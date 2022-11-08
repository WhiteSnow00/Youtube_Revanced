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

public final class abek implements abmq, abmn, abmr
{
    private static final String b;
    public final abdx a;
    private final aben c;
    private final Set d;
    private final abej e;
    private int f;
    private WatchNextResponseModel g;
    
    static {
        b = trn.a("PQSN");
    }
    
    public abek(final abdx a, final aben c) {
        a.getClass();
        this.a = a;
        this.c = c;
        this.d = new HashSet();
        (this.e = new abej(this)).e();
        c.b = new WeakReference((T)this);
    }
    
    public abek(final abdx abdx, final aben aben, final PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState playbackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState) {
        this(abdx, aben);
        this.h(playbackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState.a);
    }
    
    public static boolean q(final abmj abmj) {
        return abmj instanceof abmh && ((abmh)abmj).k((Class)abek.class);
    }
    
    private final Object s() {
        this.e.f();
        return this.c.b();
    }
    
    private final void t(final boolean b) {
        final int j = this.j(abmp.b);
        final int i = this.j(abmp.a);
        final int n = this.n();
        final boolean pz = this.pz();
        int n2 = 0;
        final boolean b2 = j == 2;
        int n3;
        if (i == 2) {
            n3 = 2;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (n == 1) {
            n4 = 4;
        }
        else {
            n4 = 0;
        }
        int n5;
        if (n == 2) {
            n5 = 8;
        }
        else {
            n5 = 0;
        }
        if (pz) {
            n2 = 16;
        }
        final boolean f = ((b2 ? 1 : 0) | n3 | n4 | n5 | n2) != 0x0;
        if (this.f != (f ? 1 : 0) || b) {
            this.f = (f ? 1 : 0);
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((aepj)iterator.next()).r();
            }
        }
    }
    
    private final void u(final Object o, final boolean b) {
        this.e.e();
        this.c.c(o);
        this.t(b);
    }
    
    public final PlaybackStartDescriptor a(final abmp abmp) {
        final Object s = this.s();
        final PlaybackStartDescriptor c = this.a.c(abmp);
        boolean b = false;
        this.u(s, false);
        if (c == null) {
            final String b2 = abek.b;
            final String name = abmp.e.name();
            final StringBuilder sb = new StringBuilder("getNavigationDescriptor for ");
            sb.append(name);
            sb.append("returned NULL");
            trn.m(b2, sb.toString());
            return null;
        }
        if (abmp.e == abmo.c || abmp.e == abmo.d) {
            b = true;
        }
        final abhx e = c.e();
        e.f = b;
        e.e = b;
        return e.a();
    }
    
    public final abib b(final abmp abmp) {
        return this.a.E();
    }
    
    public final abmp c(final PlaybackStartDescriptor playbackStartDescriptor, final abib abib) {
        return this.a.d(playbackStartDescriptor, abib);
    }
    
    public final SequenceNavigatorState d() {
        return (SequenceNavigatorState)new PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState(this.g);
    }
    
    public final void e(final boolean b) {
        this.t(false);
    }
    
    public final void f(final abmp abmp, final PlaybackStartDescriptor playbackStartDescriptor) {
        final Object s = this.s();
        this.a.s(abmp, playbackStartDescriptor);
        this.u(s, false);
    }
    
    public final void g() {
        this.e.f();
        final aben c = this.c;
        final WeakReference b = c.b;
        if (b == null || aeda.v(this, b.get())) {
            c.b = null;
        }
        final abdx a = this.a;
        if (a instanceof abep) {
            ((abep)a).e();
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
    
    public final int j(final abmp abmp) {
        return this.a.z(abmp);
    }
    
    public final void k(final PlaybackStartDescriptor playbackStartDescriptor) {
    }
    
    public final void l(final aepj aepj) {
        this.d.add(aepj);
    }
    
    public final void m(final aepj aepj) {
        this.d.remove(aepj);
    }
    
    public final int n() {
        final abdx a = this.a;
        if (a instanceof abmn) {
            return ((abmn)a).n();
        }
        return 0;
    }
    
    public final void o(final int n) {
        if (this.p(n)) {
            final abdx a = this.a;
            if (a instanceof abmn) {
                ((abmn)a).o(n);
                this.t(false);
            }
        }
    }
    
    public final boolean p(final int n) {
        final abdx a = this.a;
        return a instanceof abmn && ((abmn)a).p(n);
    }
    
    public final boolean pA() {
        final abdx a = this.a;
        return a instanceof abmr && ((abmr)a).pA();
    }
    
    public final void py(final boolean b) {
        if (this.pA()) {
            final abdx a = this.a;
            if (a instanceof abmr) {
                ((abmr)a).py(b);
                this.t(false);
            }
        }
    }
    
    public final boolean pz() {
        if (this.pA()) {
            final abdx a = this.a;
            if (a instanceof abmr && ((abmr)a).pz()) {
                return true;
            }
        }
        return false;
    }
}
