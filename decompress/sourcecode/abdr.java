import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdr implements abdg
{
    private final String a;
    private Runnable b;
    private boolean c;
    private final acnx d;
    
    public abdr(final String a, final acnx d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.d = d;
    }
    
    public final void a(final Throwable t) {
        this.d.j(this.a, t);
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
            final acnx d = this.d;
            final String a = this.a;
            final Object a2 = d.a;
            if (a2 != null) {
                final vie vie = (vie)a2;
                final vic a3 = vie.a(a, (Throwable)null);
                if (a3 != null) {
                    a3.b.run();
                    a3.c.c("pce");
                    a3.g.br(a3.a.d());
                    vie.i(vid.d);
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
