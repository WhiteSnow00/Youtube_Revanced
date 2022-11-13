import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqn implements tcc
{
    final PlayerResponseModel a;
    final PlaybackStartDescriptor b;
    final xan c;
    final abqp d;
    
    public abqn(final abqp d, final PlayerResponseModel a, final PlaybackStartDescriptor b, final xan c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ void b(final Object o, Object a) {
        final Void void1 = (Void)o;
        final abnm abnm = (abnm)a;
        synchronized (this.d.h) {
            final abqp d = this.d;
            a = d.h.a;
            if (a == null) {
                zlm.b(zll.b, zlk.j, "Null Director when attempting to prewarm after checking playability.");
                return;
            }
            if (abnm.c - 1 == 0) {
                final PlayerResponseModel a2 = this.a;
                final PlaybackStartDescriptor b = this.b;
                final xan c = this.c;
                tbi.f();
                ((aukf)d.e.j).tu((Object)new aamk());
                if (c != null) {
                    c.c("pc");
                }
                if (((abvb)a).V()) {
                    ((abvb)a).G(a2, b);
                }
            }
        }
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Void void1 = (Void)o;
        zlm.b(zll.b, zlk.j, "Could not get playability result when prewarming: ".concat(String.valueOf(String.valueOf(ex))));
    }
}
