import android.content.ContentResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import android.net.Uri;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.system.Os;
import java.io.File;
import android.os.ParcelFileDescriptor;
import java.lang.reflect.Executable;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

class aii extends aio
{
    private static Class a;
    private static Constructor b;
    private static Method c;
    private static Method d;
    private static boolean e;
    
    public aii() {
    }
    
    private static Object f() {
        g();
        InvocationTargetException instance = null;
        try {
            instance = aii.b.newInstance(new Object[0]);
            return instance;
        }
        catch (final InvocationTargetException instance) {}
        catch (final InstantiationException instance) {}
        catch (final IllegalAccessException ex) {}
        throw new RuntimeException(instance);
    }
    
    private static void g() {
        if (aii.e) {
            return;
        }
        aii.e = true;
        Class<?> forName = null;
        Executable constructor = null;
        Method method = null;
        Method method2 = null;
        Label_0107: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = forName.getConstructor((Class[])new Class[0]);
                method = forName.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass());
                break Label_0107;
            }
            catch (final NoSuchMethodException constructor) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi21Impl", ((NoSuchMethodException)constructor).getClass().getName(), (Throwable)constructor);
            forName = null;
            method2 = null;
            constructor = (method = null);
        }
        aii.b = (Constructor)constructor;
        aii.a = forName;
        aii.c = method;
        aii.d = method2;
    }
    
    private static final File h(final ParcelFileDescriptor parcelFileDescriptor) {
        try {
            final StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            final String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        }
        catch (final ErrnoException ex) {
            return null;
        }
    }
    
    @Override
    public Typeface a(Context instance, ahm b, Resources resources, int i) {
        final Object f = f();
        final ahn[] a = b.a;
        final int length = a.length;
        i = 0;
        while (i < length) {
            final ahn ahn = a[i];
            b = (ahm)vl.b((Context)instance);
            if (b != null) {
                try {
                    if (!vl.f((File)b, resources, ahn.f)) {
                        return null;
                    }
                    final String path = ((File)b).getPath();
                    final int b2 = ahn.b;
                    final boolean c = ahn.c;
                    g();
                    try {
                        if (!(boolean)aii.c.invoke(f, path, b2, c)) {
                            return null;
                        }
                        ((File)b).delete();
                        ++i;
                        continue;
                    }
                    catch (final InvocationTargetException instance) {}
                    catch (final IllegalAccessException ex) {}
                    resources = (Resources)new RuntimeException(instance);
                    throw resources;
                }
                catch (final RuntimeException ex2) {
                    ((File)b).delete();
                }
                finally {
                    ((File)b).delete();
                }
            }
            return null;
        }
        g();
        try {
            instance = (InvocationTargetException)Array.newInstance(aii.a, 1);
            Array.set(instance, 0, f);
            instance = (InvocationTargetException)aii.d.invoke(null, instance);
            return (Typeface)instance;
        }
        catch (final InvocationTargetException instance) {}
        catch (final IllegalAccessException ex3) {}
        throw new RuntimeException(instance);
    }
    
    @Override
    public Typeface b(final Context context, CancellationSignal openFileDescriptor, ogz[] array, final int n) {
        if (array.length <= 0) {
            return null;
        }
        final ogz l = this.l(array, n);
        final ContentResolver contentResolver = context.getContentResolver();
        try {
            openFileDescriptor = (CancellationSignal)contentResolver.openFileDescriptor((Uri)l.e, "r", openFileDescriptor);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                final File h = h((ParcelFileDescriptor)openFileDescriptor);
                if (h != null && h.canRead()) {
                    final Typeface fromFile = Typeface.createFromFile(h);
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return fromFile;
                }
                array = (ogz[])(Object)new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor());
                try {
                    final Typeface k = super.k(context, (InputStream)(Object)array);
                    ((FileInputStream)(Object)array).close();
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return k;
                }
                finally {
                    try {
                        ((FileInputStream)(Object)array).close();
                    }
                    finally {
                        final Throwable t;
                        vj.b((Throwable)context, t);
                    }
                }
            }
            finally {
                try {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                finally {
                    final Throwable t2;
                    vj.b((Throwable)context, t2);
                }
            }
        }
        catch (final IOException ex) {
            return null;
        }
    }
}
