import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;
import android.net.Uri;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.Field;
import android.util.Log;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

class aio
{
    private final ConcurrentHashMap a;
    
    public aio() {
        this.a = new ConcurrentHashMap();
    }
    
    private static long f(final Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            final Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number)declaredField.get(typeface)).longValue();
        }
        catch (final IllegalAccessException ex) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", (Throwable)ex);
            return 0L;
        }
        catch (final NoSuchFieldException ex2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", (Throwable)ex2);
            return 0L;
        }
    }
    
    private static Object g(final Object[] array, final int n, final ain ain) {
        final int length = array.length;
        int n2 = Integer.MAX_VALUE;
        Object o = null;
        int n7;
        for (int i = 0; i < length; ++i, n2 = n7) {
            final int n3 = 1;
            final boolean b = (n & 0x2) != 0x0;
            int n4;
            if (0x1 != (n & 0x1)) {
                n4 = 400;
            }
            else {
                n4 = 700;
            }
            final Object o2 = array[i];
            final int abs = Math.abs(ain.a(o2) - n4);
            int n5 = n3;
            if (ain.b(o2) == b) {
                n5 = 0;
            }
            final int n6 = abs + abs + n5;
            if (o == null || (n7 = n2) > n6) {
                n7 = n6;
                o = o2;
            }
        }
        return o;
    }
    
    public Typeface a(final Context context, final ahm ahm, final Resources resources, final int n) {
        final ahn ahn = (ahn)g(ahm.a, n, new aim(0));
        if (ahn == null) {
            return null;
        }
        final Typeface b = aih.b(context, resources, ahn.f, ahn.a, 0, n);
        final long f = f(b);
        if (f != 0L) {
            this.a.put((Object)f, (Object)ahm);
        }
        return b;
    }
    
    public Typeface b(final Context context, final CancellationSignal cancellationSignal, final ogz[] array, final int n) {
        if (array.length <= 0) {
            return null;
        }
        final ogz l = this.l(array, n);
        try {
            final InputStream openInputStream = context.getContentResolver().openInputStream((Uri)l.e);
            try {
                final Typeface k = this.k(context, openInputStream);
                vl.d((Closeable)openInputStream);
                return k;
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex2) {}
    }
    
    public Typeface d(Context b, final Resources resources, final int n, final String s, final int n2) {
        b = (Context)vl.b(b);
        if (b == null) {
            return null;
        }
        try {
            if (!vl.f((File)b, resources, n)) {
                return null;
            }
            return Typeface.createFromFile(((File)b).getPath());
        }
        catch (final RuntimeException ex) {
            return null;
        }
        finally {
            ((File)b).delete();
        }
    }
    
    protected Typeface k(Context b, final InputStream inputStream) {
        b = (Context)vl.b(b);
        if (b == null) {
            return null;
        }
        try {
            if (!vl.e((File)b, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(((File)b).getPath());
        }
        catch (final RuntimeException ex) {
            return null;
        }
        finally {
            ((File)b).delete();
        }
    }
    
    protected ogz l(final ogz[] array, final int n) {
        return (ogz)g(array, n, new aim(1));
    }
}
