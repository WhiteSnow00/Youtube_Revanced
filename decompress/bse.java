import android.view.Display;
import android.hardware.display.DisplayManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bse
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
    
    public static int b(final bat bat, final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                return 256 << n - 8;
            }
            case 7: {
                return bat.m() + 1;
            }
            case 6: {
                return bat.i() + 1;
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                return 576 << n - 2;
            }
            case 1: {
                return 192;
            }
        }
    }
    
    public static final cfv c(final Context context, final Class clazz, final String s) {
        context.getClass();
        if (!auop.m((CharSequence)s)) {
            return new cfv(context, clazz, s);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
    
    public static final Object d(final Class clazz) {
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
    
    public static boolean e(final bat bat, final bts bts, final boolean b, final pbg pbg) {
        try {
            long s = bat.s();
            if (!b) {
                s *= bts.b;
            }
            pbg.a = s;
            return true;
        }
        catch (final NumberFormatException ex) {
            return false;
        }
    }
    
    public static boolean f(final bat bat, final bts bts, int n, final pbg pbg) {
        final int b = bat.b;
        final long q = bat.q();
        final long n2 = q >>> 16;
        if (n2 != n) {
            return false;
        }
        final boolean b2 = (n2 & 0x1L) == 0x1L;
        n = (int)(q >> 4 & 0xFL);
        if (n <= 7) {
            if (n != bts.g - 1) {
                return false;
            }
        }
        else if (n > 10 || bts.g != 2) {
            return false;
        }
        n = (int)(q >> 1 & 0x7L);
        if (n != 0) {
            if (n != bts.i) {
                return false;
            }
        }
        if ((q & 0x1L) != 0x1L && e(bat, bts, b2, pbg)) {
            n = b(bat, (int)(q >> 12 & 0xFL));
            if (n != -1 && n <= bts.b) {
                final int e = bts.e;
                final int n3 = (int)(q >> 8 & 0xFL);
                if (n3 != 0) {
                    if (n3 <= 11) {
                        if (n3 != bts.f) {
                            return false;
                        }
                    }
                    else if (n3 == 12) {
                        if (bat.i() * 1000 != e) {
                            return false;
                        }
                    }
                    else {
                        if (n3 > 14) {
                            return false;
                        }
                        final int n4 = n = bat.m();
                        if (n3 == 14) {
                            n = n4 * 10;
                        }
                        if (n != e) {
                            return false;
                        }
                    }
                }
                n = bat.i();
                if (n == baz.ax(bat.a, b, bat.b - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
