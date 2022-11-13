import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Iterator;
import java.util.HashSet;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abom implements aboq, abon, abor
{
    private final aezs a;
    private final boolean b;
    private final Set c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;
    private vgp h;
    private WatchNextResponseModel i;
    
    public abom(final AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState, final aezs a) {
        this.e = 0;
        autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.getClass();
        a.getClass();
        this.a = a;
        this.d = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.a;
        this.i = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.b;
        this.f = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.c;
        this.e = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.d;
        this.b = false;
        this.c = new HashSet();
        this.t();
    }
    
    public abom(final String d, final boolean b, final aezs a) {
        this.e = 0;
        a.getClass();
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = new HashSet();
    }
    
    private final aiqj q() {
        final vgp h = this.h;
        if (h != null && this.v(h.a())) {
            return h.a();
        }
        return null;
    }
    
    private final aiqj r() {
        final vgp h = this.h;
        if (h != null && this.v(h.b())) {
            return h.b();
        }
        return null;
    }
    
    private final aiqj s() {
        final vgp h = this.h;
        if (h != null && this.v(h.c())) {
            return h.c();
        }
        return null;
    }
    
    private final void t() {
        monitorenter(this);
        try {
            final WatchNextResponseModel i = this.i;
            vgp a;
            final vgp vgp = a = null;
            if (i != null) {
                final vgs h = i.h;
                a = vgp;
                if (h != null) {
                    int e = this.e;
                    final boolean p = this.p(e);
                    boolean b = false;
                    if (!p) {
                        e = 0;
                    }
                    this.e = e;
                    final boolean f = this.f && this.pE();
                    this.f = f;
                    final boolean b2 = e == 1;
                    if (e == 2) {
                        b = true;
                    }
                    a = h.a(b2, b, f, this.g);
                }
            }
            if (this.h == a) {
                monitorexit(this);
                return;
            }
            this.h = a;
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((afhd)iterator.next()).s();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final boolean u(final PlaybackStartDescriptor playbackStartDescriptor) {
        return playbackStartDescriptor != null && !TextUtils.isEmpty((CharSequence)this.d) && TextUtils.equals((CharSequence)playbackStartDescriptor.i(), (CharSequence)this.d);
    }
    
    private final boolean v(final aiqj aiqj) {
        return aiqj != null && this.a.a((Object)aiqj);
    }
    
    public final PlaybackStartDescriptor a(final abop abop) {
        final aboo a = aboo.a;
        final int ordinal = abop.e.ordinal();
        if (ordinal == 0) {
            final abjp d = PlaybackStartDescriptor.d();
            d.a = this.s();
            return d.a();
        }
        if (ordinal == 1) {
            final vgp h = this.h;
            final abjp d2 = PlaybackStartDescriptor.d();
            if (h != null) {
                final aiqj d3 = h.d();
                if (d3 != null) {
                    d2.a = d3;
                }
            }
            return d2.a();
        }
        if (ordinal == 2) {
            final abjp d4 = PlaybackStartDescriptor.d();
            d4.a = this.r();
            d4.f = true;
            d4.e = true;
            return d4.a();
        }
        if (ordinal == 3) {
            final abjp d5 = PlaybackStartDescriptor.d();
            d5.a = this.q();
            d5.f = true;
            d5.e = true;
            return d5.a();
        }
        if (ordinal == 4) {
            return abop.f;
        }
        throw new UnsupportedOperationException("Unsupported navigation type: ".concat(String.valueOf(String.valueOf(abop.e))));
    }
    
    public final abjt b(final abop abop) {
        abjt abjt;
        if ((abjt = abop.g) == null) {
            abjt = abjt.a;
        }
        return abjt;
    }
    
    public final abop c(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        if (this.u(playbackStartDescriptor)) {
            return new abop(aboo.e, playbackStartDescriptor, abjt);
        }
        return null;
    }
    
    public final SequenceNavigatorState d() {
        synchronized (this) {
            return (SequenceNavigatorState)new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(this.d, this.i, this.f, this.e);
        }
    }
    
    public final void e(final boolean g) {
        synchronized (this) {
            this.g = g;
            this.t();
        }
    }
    
    public final void f(final abop abop, final PlaybackStartDescriptor playbackStartDescriptor) {
    }
    
    public final void g() {
    }
    
    public final void h(final WatchNextResponseModel i) {
        this.i = i;
        this.t();
    }
    
    public final boolean i() {
        return true;
    }
    
    public final int j(final abop abop) {
        final aboo a = aboo.a;
        final int ordinal = abop.e.ordinal();
        final boolean b = false;
        boolean b2 = false;
        final boolean b3 = false;
        int n = 1;
        if (ordinal == 0) {
            if (this.s() != null) {
                b2 = true;
            }
            return abop.a(b2);
        }
        if (ordinal == 1) {
            final vgp h = this.h;
            aiqj d = null;
            if (h != null) {
                d = d;
                if (this.v(h.d())) {
                    d = h.d();
                }
            }
            boolean b4 = b;
            if (d != null) {
                b4 = true;
            }
            return abop.a(b4);
        }
        if (ordinal == 2) {
            if (this.r() != null && this.b) {
                n = 2;
            }
            else if (this.i == null) {
                return 3;
            }
            return n;
        }
        if (ordinal == 3) {
            boolean b5 = b3;
            if (this.q() != null) {
                b5 = true;
            }
            return abop.a(b5);
        }
        if (ordinal != 4) {
            return 1;
        }
        if (this.u(abop.f)) {
            return 2;
        }
        return 1;
    }
    
    public final void k(final PlaybackStartDescriptor playbackStartDescriptor) {
    }
    
    public final void l(final afhd afhd) {
        synchronized (this) {
            this.c.add(afhd);
        }
    }
    
    public final void m(final afhd afhd) {
        synchronized (this) {
            this.c.remove(afhd);
        }
    }
    
    public final int n() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public final void o(final int e) {
        synchronized (this) {
            this.e = e;
            this.t();
        }
    }
    
    public final boolean p(final int n) {
        if (n == 1) {
            final WatchNextResponseModel i = this.i;
            if (i != null) {
                final vgs h = i.h;
                if (h != null && h.c()) {
                    return true;
                }
            }
            return false;
        }
        if (n != 2) {
            return false;
        }
        final WatchNextResponseModel j = this.i;
        if (j != null) {
            final vgs h2 = j.h;
            if (h2 != null && h2.b()) {
                return true;
            }
        }
        return false;
    }
    
    public final void pC(final boolean f) {
        synchronized (this) {
            this.f = f;
            this.t();
        }
    }
    
    public final boolean pD() {
        synchronized (this) {
            return this.f;
        }
    }
    
    public final boolean pE() {
        final WatchNextResponseModel i = this.i;
        if (i != null) {
            final vgs h = i.h;
            if (h != null && h.d()) {
                return true;
            }
        }
        return false;
    }
}
