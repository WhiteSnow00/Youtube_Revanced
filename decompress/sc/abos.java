import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import java.util.HashSet;
import java.util.Set;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abos implements aboq, abon
{
    private final PlaybackStartDescriptor a;
    private final String[] b;
    private final Set c;
    private int d;
    private int e;
    
    public abos(final PlaybackStartDescriptor a) {
        this.a = a;
        this.b = y(a);
        this.e = a.b();
        this.c = new HashSet();
    }
    
    public abos(final VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) {
        final PlaybackStartDescriptor a = videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState.a;
        this.a = a;
        this.b = y(a);
        this.e = videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState.b;
        this.c = new HashSet();
    }
    
    private final PlaybackStartDescriptor q(final int n, final boolean b) {
        final int max = Math.max(0, Math.min(n, this.b.length - 1));
        if (max != n) {
            final zll a = zll.a;
            final zlk j = zlk.j;
            final StringBuilder sb = new StringBuilder("Out of bounds access of video IDs list. Index ");
            sb.append(n);
            sb.append(" bounded to ");
            sb.append(max);
            zlm.b(a, j, sb.toString());
        }
        final abjp d = PlaybackStartDescriptor.d();
        d.a = abkf.g(this.b[max], "", -1, 0.0f);
        d.f = b;
        d.e = b;
        return d.a();
    }
    
    private final PlaybackStartDescriptor r(final boolean b) {
        synchronized (this) {
            if (!this.v()) {
                zlm.b(zll.a, zlk.j, "Attempting to advance to non-existent video.");
                return null;
            }
            int n;
            if (this.n() == 1 && this.x()) {
                n = 0;
            }
            else {
                n = this.e + 1;
            }
            this.u(n);
            return this.q(this.e, b);
        }
    }
    
    private final PlaybackStartDescriptor s() {
        synchronized (this) {
            if (!this.w()) {
                zlm.b(zll.a, zlk.j, "Attempting to go to prior video of the first video.");
                return null;
            }
            int max;
            if (this.n() == 1 && this.e <= 0) {
                max = this.b.length - 1;
            }
            else {
                max = Math.max(0, this.e - 1);
            }
            this.u(max);
            return this.q(this.e, false);
        }
    }
    
    private final void t() {
        monitorenter(this);
        try {
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
    
    private final void u(final int e) {
        synchronized (this) {
            if (this.e == e) {
                return;
            }
            this.e = e;
            this.t();
        }
    }
    
    private final boolean v() {
        synchronized (this) {
            return this.n() == 1 || !this.x();
        }
    }
    
    private final boolean w() {
        synchronized (this) {
            return this.n() == 1 || this.e > 0;
        }
    }
    
    private final boolean x() {
        return this.e >= this.b.length - 1;
    }
    
    private static String[] y(final PlaybackStartDescriptor playbackStartDescriptor) {
        final List l = playbackStartDescriptor.l();
        if (l == null) {
            return new String[0];
        }
        return l.toArray(new String[0]);
    }
    
    public final PlaybackStartDescriptor a(final abop abop) {
        final aboo a = aboo.a;
        final int ordinal = abop.e.ordinal();
        boolean b = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.s();
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zlm.b(zll.a, zlk.j, "Autonav unsupported by VideoIdsSequenceNavigator.");
                    return null;
                }
                if (ordinal == 4) {
                    return abop.f;
                }
                throw new UnsupportedOperationException("Unsupported navigation type: ".concat(String.valueOf(String.valueOf(abop.e))));
            }
        }
        if (abop.e != aboo.c) {
            b = false;
        }
        return this.r(b);
    }
    
    public final abjt b(final abop abop) {
        return abjt.a;
    }
    
    public final abop c(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        return new abop(aboo.e, playbackStartDescriptor, abjt);
    }
    
    public final SequenceNavigatorState d() {
        return (SequenceNavigatorState)new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(this.a, this.e);
    }
    
    public final void e(final boolean b) {
    }
    
    public final void f(final abop abop, final PlaybackStartDescriptor playbackStartDescriptor) {
    }
    
    public final void g() {
    }
    
    public final void h(final WatchNextResponseModel watchNextResponseModel) {
    }
    
    public final boolean i() {
        return false;
    }
    
    public final int j(final abop abop) {
        final aboo a = aboo.a;
        final int ordinal = abop.e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return abop.a(this.w());
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return abop.a(false);
                }
                if (ordinal != 4) {
                    return 1;
                }
                return 2;
            }
        }
        return abop.a(this.v());
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
            return this.d;
        }
    }
    
    public final void o(final int d) {
        synchronized (this) {
            final boolean w = this.w();
            final boolean v = this.v();
            this.d = d;
            if (w == this.w() && v == this.v()) {
                return;
            }
            this.t();
        }
    }
    
    public final boolean p(final int n) {
        return n == 1;
    }
}
