import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqm implements tcc
{
    final PlayerResponseModel a;
    final abqo b;
    final PlaybackStartDescriptor c;
    final xan d;
    public final abqp e;
    
    public abqm(final abqp e, final PlayerResponseModel a, final abqo b, final PlaybackStartDescriptor c, final xan d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final /* bridge */ void b(final Object o, Object a) {
        final Void void1 = (Void)o;
        final abnm abnm = (abnm)a;
        synchronized (this.e.h) {
            final abqp e = this.e;
            a = e.h.a;
            if (a == null) {
                return;
            }
            if (abrj.ai(e.f)) {
                final int n = abnm.c - 1;
                if (n != 0) {
                    if (n != 1) {
                        final abqo b = this.b;
                        if (b != null) {
                            b.f();
                        }
                    }
                    else {
                        this.e.b.execute((Runnable)new wmb(this, this.a, (abvb)a, this.b, abnm, 8));
                    }
                }
                else if (aakv.n(this.a.y())) {
                    this.e.b.execute((Runnable)new zet(this, this.a, (abvb)a, this.b, this.c, this.d, 4));
                }
                else {
                    this.e.d(this.a, this.c, this.d, (abvb)a);
                }
            }
            else {
                final int n2 = abnm.c - 1;
                if (n2 != 0) {
                    if (n2 != 1) {
                        final abqo b2 = this.b;
                        if (b2 != null) {
                            b2.f();
                        }
                    }
                    else if (!this.e.f(this.a, (abvb)a, this.b)) {
                        this.e.c(this.a, abnm.b, (abvb)a);
                    }
                }
                else {
                    this.e.d(this.a, this.c, this.d, (abvb)a);
                }
            }
        }
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Void void1 = (Void)o;
        zlm.b(zll.b, zlk.j, "Could not get playability result: ".concat(String.valueOf(String.valueOf(ex))));
    }
}
