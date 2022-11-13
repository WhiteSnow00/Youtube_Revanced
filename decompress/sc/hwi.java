import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwi implements tcc
{
    public final hwl a;
    private AsyncTask b;
    
    public hwi(final hwl a) {
        this.a = a;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap bitmap = (Bitmap)o2;
        this.c();
        if (bitmap != null) {
            this.b = new cdy(bitmap).a((cdz)new jgr(this, bitmap, 1));
        }
    }
    
    public final void c() {
        final AsyncTask b = this.b;
        if (b != null && !b.isCancelled()) {
            this.b.cancel(false);
            this.b = null;
        }
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
        final hwl a = this.a;
        if (a.ar()) {
            a.bH(hwl.bT());
        }
    }
}
