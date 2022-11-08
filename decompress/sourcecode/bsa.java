import java.util.Arrays;
import androidx.media3.common.Metadata;
import android.view.Display;
import android.hardware.display.DisplayManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class bsa
{
    public static boolean a(final Context context) {
        final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        final boolean b = false;
        Display display;
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        }
        else {
            display = null;
        }
        boolean b2 = b;
        if (display != null) {
            b2 = b;
            if (display.isHdr()) {
                final int[] supportedHdrTypes = display.getHdrCapabilities().getSupportedHdrTypes();
                final int length = supportedHdrTypes.length;
                int n = 0;
                while (true) {
                    b2 = b;
                    if (n >= length) {
                        break;
                    }
                    if (supportedHdrTypes[n] == 1) {
                        b2 = true;
                        break;
                    }
                    ++n;
                }
            }
        }
        return b2;
    }
    
    public static Metadata b(final btj btj, final boolean b) {
        bvj a;
        if (b) {
            a = null;
        }
        else {
            a = bvk.a;
        }
        final Metadata d = new bhu().d(btj, a);
        if (d != null && d.a() != 0) {
            return d;
        }
        return null;
    }
    
    public static cfr d(final Context context, final Class clazz, final String s) {
        context.getClass();
        if (!aubt.e((CharSequence)s)) {
            return new cfr(context, clazz, s);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
    
    public static Object e(final Class clazz) {
        final Package package1 = clazz.getPackage();
        package1.getClass();
        final String name = package1.getName();
        final String canonicalName = clazz.getCanonicalName();
        canonicalName.getClass();
        name.getClass();
        String substring = canonicalName;
        if (name.length() != 0) {
            substring = canonicalName.substring(name.length() + 1);
            substring.getClass();
        }
        substring.getClass();
        final String replace = substring.replace('.', '_');
        replace.getClass();
        final String concat = replace.concat("_Impl");
        try {
            String string;
            if (name.length() == 0) {
                string = concat;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append('.');
                sb.append(concat);
                string = sb.toString();
            }
            final Class<?> forName = Class.forName(string, true, clazz.getClassLoader());
            forName.getClass();
            return forName.newInstance();
        }
        catch (final InstantiationException ex) {
            final StringBuilder sb2 = new StringBuilder("Failed to create an instance of ");
            sb2.append(clazz);
            sb2.append(".canonicalName");
            throw new RuntimeException(sb2.toString());
        }
        catch (final IllegalAccessException ex2) {
            final StringBuilder sb3 = new StringBuilder("Cannot access the constructor ");
            sb3.append(clazz);
            sb3.append(".canonicalName");
            throw new RuntimeException(sb3.toString());
        }
        catch (final ClassNotFoundException ex3) {
            final StringBuilder sb4 = new StringBuilder("Cannot find implementation for ");
            sb4.append(clazz.getCanonicalName());
            sb4.append(". ");
            sb4.append(concat);
            sb4.append(" does not exist");
            throw new RuntimeException(sb4.toString());
        }
    }
    
    public static dmk f(final bar bar) {
        bar.H(1);
        final int k = bar.k();
        final long n = bar.b;
        final long n2 = k;
        final int n3 = k / 18;
        final long[] array = new long[n3];
        final long[] array2 = new long[n3];
        int n4 = 0;
        long[] copy;
        long[] copy2;
        while (true) {
            copy = array;
            copy2 = array2;
            if (n4 >= n3) {
                break;
            }
            final long p = bar.p();
            if (p == -1L) {
                copy = Arrays.copyOf(array, n4);
                copy2 = Arrays.copyOf(array2, n4);
                break;
            }
            array[n4] = p;
            array2[n4] = bar.p();
            bar.H(2);
            ++n4;
        }
        bar.H((int)(n + n2 - bar.b));
        return new dmk(copy, copy2);
    }
    
    public void c(final cgl cgl) {
    }
}
