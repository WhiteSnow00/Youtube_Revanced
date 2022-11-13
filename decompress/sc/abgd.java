import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Iterator;
import com.google.android.libraries.youtube.player.features.queue.PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgd implements aboq, abon, abor
{
    private static final String b;
    public final abfq a;
    private final abgg c;
    private final Set d;
    private final abgc e;
    private int f;
    private WatchNextResponseModel g;
    
    static {
        b = ttr.a("PQSN");
    }
    
    public abgd(final abfq a, final abgg c) {
        a.getClass();
        this.a = a;
        this.c = c;
        this.d = new HashSet();
        (this.e = new abgc(this)).e();
        c.b = new WeakReference((T)this);
    }
    
    public abgd(final abfq abfq, final abgg abgg, final PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState playbackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState) {
        this(abfq, abgg);
        this.h(playbackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState.a);
    }
    
    public static boolean q(final aboj aboj) {
        return aboj instanceof aboh && ((aboh)aboj).k(abgd.class);
    }
    
    static /* bridge */ void r(final abgd abgd) {
        abgd.t(false);
    }
    
    private final Object s() {
        this.e.f();
        return this.c.b();
    }
    
    private final void t(final boolean b) {
        final int j = this.j(abop.b);
        final int i = this.j(abop.a);
        final int n = this.n();
        final boolean pd = this.pD();
        int n2 = 0;
        int n3;
        if (!pd) {
            n3 = 0;
        }
        else {
            n3 = 16;
        }
        final boolean b2 = j == 2;
        int n4;
        if (i == 2) {
            n4 = 2;
        }
        else {
            n4 = 0;
        }
        int n5;
        if (n == 1) {
            n5 = 4;
        }
        else {
            n5 = 0;
        }
        if (n == 2) {
            n2 = 8;
        }
        final boolean f = ((b2 ? 1 : 0) | n4 | n5 | n2 | n3) != 0x0;
        if (this.f != (f ? 1 : 0) || b) {
            this.f = (f ? 1 : 0);
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((afhd)iterator.next()).s();
            }
        }
    }
    
    private final void u(final Object o, final boolean b) {
        this.e.e();
        this.c.c(o);
        this.t(b);
    }
    
    public final PlaybackStartDescriptor a(final abop abop) {
        final Object s = this.s();
        final PlaybackStartDescriptor c = this.a.c(abop);
        boolean b = false;
        this.u(s, false);
        if (c == null) {
            final String b2 = abgd.b;
            final String name = abop.e.name();
            final StringBuilder sb = new StringBuilder("getNavigationDescriptor for ");
            sb.append(name);
            sb.append("returned NULL");
            ttr.m(b2, sb.toString());
            return null;
        }
        if (abop.e == aboo.c || abop.e == aboo.d) {
            b = true;
        }
        final abjp e = c.e();
        e.f = b;
        e.e = b;
        return e.a();
    }
    
    public final abjt b(final abop abop) {
        return this.a.E();
    }
    
    public final abop c(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        return this.a.d(playbackStartDescriptor, abjt);
    }
    
    public final SequenceNavigatorState d() {
        return (SequenceNavigatorState)new PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState(this.g);
    }
    
    public final void e(final boolean b) {
        this.t(false);
    }
    
    public final void f(final abop abop, final PlaybackStartDescriptor playbackStartDescriptor) {
        final Object s = this.s();
        this.a.s(abop, playbackStartDescriptor);
        this.u(s, false);
    }
    
    public final void g() {
        this.e.f();
        final abgg c = this.c;
        final WeakReference b = c.b;
        if (b == null || adkp.ae((Object)this, b.get())) {
            c.b = null;
        }
        final abfq a = this.a;
        if (a instanceof abgj) {
            ((abgj)a).e();
        }
    }
    
    public final void h(final WatchNextResponseModel g) {
        final Object s = this.s();
        this.g = g;
        this.a.t(g);
        this.u(s, true);
    }
    
    public final boolean i() {
        return false;
    }
    
    public final int j(final abop abop) {
        return this.a.z(abop);
    }
    
    public final void k(final PlaybackStartDescriptor playbackStartDescriptor) {
    }
    
    public final void l(final afhd afhd) {
        this.d.add(afhd);
    }
    
    public final void m(final afhd afhd) {
        this.d.remove(afhd);
    }
    
    public final int n() {
        final abfq a = this.a;
        if (a instanceof abon) {
            return ((abon)a).n();
        }
        return 0;
    }
    
    public final void o(final int n) {
        if (this.p(n)) {
            final abfq a = this.a;
            if (a instanceof abon) {
                ((abon)a).o(n);
                this.t(false);
            }
        }
    }
    
    public final boolean p(final int n) {
        final abfq a = this.a;
        return a instanceof abon && ((abon)a).p(n);
    }
    
    public final void pC(final boolean b) {
        if (this.pE()) {
            final abfq a = this.a;
            if (a instanceof abor) {
                ((abor)a).pC(b);
                this.t(false);
            }
        }
    }
    
    public final boolean pD() {
        if (this.pE()) {
            final abfq a = this.a;
            if (a instanceof abor && ((abor)a).pD()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean pE() {
        final abfq a = this.a;
        return a instanceof abor && ((abor)a).pE();
    }
}
