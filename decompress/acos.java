import java.util.concurrent.Executor;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acos implements tdg
{
    public final acoq a;
    public final acou b;
    final aapu c;
    
    public acos(final aapu c, final acou b, final acoq a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final /* bridge */ void c(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
    }
    
    public final /* bridge */ void d(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap bitmap = (Bitmap)o2;
        ((HashMap<Uri, WeakReference>)this.c.c).put(uri, new WeakReference(bitmap));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.d(this.a, bitmap);
            return;
        }
        ((Executor)this.c.a).execute(new abse(this, bitmap, 13));
    }
}
