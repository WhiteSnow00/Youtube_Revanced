import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfk implements abfb
{
    private final String a;
    private Runnable b;
    private boolean c;
    private final acqb d;
    
    public abfk(final String a, final acqb d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.d = d;
    }
    
    public final void a(final Throwable t) {
        this.d.f(this.a, t);
    }
    
    public final void b(final PlayerResponseModel playerResponseModel) {
    }
    
    public final void c(int n) {
        if (--n != 2) {
            if (n != 3 && n != 4) {
                return;
            }
        }
        else {
            final acqb d = this.d;
            final String a = this.a;
            final Object a2 = d.a;
            if (a2 != null) {
                final vkf vkf = (vkf)a2;
                final vkd a3 = vkf.a(a, (Throwable)null);
                if (a3 != null) {
                    a3.a.run();
                    a3.b.c("pce");
                    a3.g.bX(a3.f.z());
                    vkf.h(vke.d);
                }
            }
        }
        synchronized (this) {
            this.c = true;
            final Runnable b = this.b;
            if (b != null) {
                b.run();
            }
        }
    }
    
    public final void d(final Runnable b) {
        synchronized (this) {
            if (this.c) {
                b.run();
                return;
            }
            this.b = b;
        }
    }
}
