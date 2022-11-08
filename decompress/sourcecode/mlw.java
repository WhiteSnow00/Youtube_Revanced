import android.os.AsyncTask;
import android.net.Uri;
import com.google.android.gms.cast.framework.media.ImageHints;
import android.content.Context;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlw
{
    public mlx a;
    public Bitmap b;
    public boolean c;
    public mlv d;
    private final Context e;
    private final ImageHints f;
    private Uri g;
    
    public mlw(final Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }
    
    public mlw(final Context e, final ImageHints f) {
        this.e = e;
        this.f = f;
        this.c();
    }
    
    private final void c() {
        final mlx a = this.a;
        if (a != null) {
            a.cancel(true);
            this.a = null;
        }
        this.g = null;
        this.b = null;
        this.c = false;
    }
    
    public final void a() {
        this.c();
        this.d = null;
    }
    
    public final void b(Uri g) {
        if (g == null) {
            this.c();
            return;
        }
        if (!g.equals((Object)this.g)) {
            this.c();
            this.g = g;
            final ImageHints f = this.f;
            final int b = f.b;
            Label_0094: {
                if (b != 0) {
                    final int c = f.c;
                    if (c != 0) {
                        this.a = new mlx(this.e, b, c, this);
                        break Label_0094;
                    }
                }
                this.a = new mlx(this.e, 0, 0, this);
            }
            final mlx a = this.a;
            kgk.aL((Object)a);
            g = this.g;
            kgk.aL((Object)g);
            a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Uri[] { g });
        }
    }
}
