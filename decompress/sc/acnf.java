import java.util.concurrent.Executor;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnf implements tcc
{
    public final acnd a;
    public final acnh b;
    final aujg c;
    
    public acnf(final aujg c, final acnh b, final acnd a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap bitmap = (Bitmap)o2;
        ((HashMap<Uri, WeakReference>)this.c.c).put(uri, new WeakReference(bitmap));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.d(this.a, bitmap);
            return;
        }
        ((Executor)this.c.a).execute((Runnable)new abvs(this, bitmap, 11));
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
    }
}
