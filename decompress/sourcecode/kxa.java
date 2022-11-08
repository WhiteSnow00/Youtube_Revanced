import java.util.Iterator;
import java.util.Map;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxa implements absp, abso
{
    public final ahvq a;
    public final /* synthetic */ WatchHistoryPreviousNextController b;
    
    public kxa(final WatchHistoryPreviousNextController b, final ahvq a) {
        this.b = b;
        this.a = a;
    }
    
    private final void e(final abmp abmp, final Runnable runnable) {
        if (this.a.d && this.b.b.j()) {
            final kwy b = this.b.b;
            b.d();
            final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)((gfz)b.b).previous();
            for (final qpt qpt : b.a) {
                ((iqw)qpt.a).n.o();
                ((iqw)qpt.a).q(playbackStartDescriptor, ((iqw)qpt.a).x.b(alkz.d));
            }
            return;
        }
        if (this.a.e && this.b.b.k()) {
            final kwy b2 = this.b.b;
            b2.d();
            final PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor)((gfz)b2.b).next();
            for (final qpt qpt2 : b2.a) {
                ((iqw)qpt2.a).q(playbackStartDescriptor2, ((iqw)qpt2.a).x.b(alkz.c));
            }
            return;
        }
        final WatchHistoryPreviousNextController b3 = this.b;
        if (b3.f) {
            final ahvq a = this.a;
            if ((a.b & 0x1) != 0x0) {
                final vax a2 = b3.a;
                aioe aioe;
                if ((aioe = a.c) == null) {
                    aioe = aioe.a;
                }
                a2.c(aioe, (Map)null);
            }
        }
        else if (((abni)b3.d.a()).l(abmp)) {
            if (runnable != null) {
                runnable.run();
            }
            ((abni)this.b.d.a()).a(abmp);
        }
    }
    
    private final boolean f(final abmp abmp) {
        final WatchHistoryPreviousNextController b = this.b;
        if (b.f) {
            if ((this.a.b & 0x1) != 0x0) {
                return true;
            }
        }
        else if (((abni)b.d.a()).l(abmp)) {
            return true;
        }
        final ahvq a = this.a;
        if (a.d) {
            return this.b.b.j();
        }
        return a.e && this.b.b.k();
    }
    
    public final void a() {
        this.e(abmp.a, (Runnable)new kxw(this, 1));
    }
    
    public final void b() {
        this.e(abmp.b, null);
    }
    
    public final boolean c() {
        return this.f(abmp.a);
    }
    
    public final boolean d() {
        return this.f(abmp.b);
    }
}
