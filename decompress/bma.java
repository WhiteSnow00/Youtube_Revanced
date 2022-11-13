import android.view.View$MeasureSpec;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import android.util.DisplayMetrics;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bma
{
    public static void a(final blu blu, final bha bha) {
        final LogSessionId a = bha.a();
        if (!a.equals((Object)LogSessionId.LOG_SESSION_ID_NONE)) {
            ((MediaFormat)blu.b).setString("log-session-id", a.getStringId());
        }
    }
    
    public static int b(final bas bas, final int n) {
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
                return bas.m() + 1;
            }
            case 6: {
                return bas.i() + 1;
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
    
    public static float c(final DisplayMetrics displayMetrics, final int n) {
        return n / displayMetrics.density + 0.5f;
    }
    
    public static int d(final DisplayMetrics displayMetrics, final float n) {
        final double n2 = n * displayMetrics.density;
        Double.isNaN(n2);
        return (int)(n2 + 0.5);
    }
    
    public static dss e(final dsx dsx, final List list, final int n, final int n2, final float n3, final int n4, final egv egv, final int n5, final int n6, final egv egv2) {
        final DisplayMetrics displayMetrics = dsx.b().getDisplayMetrics();
        final afeq o = afeq.o((Collection)list);
        if (n > n2) {
            final een b = eeo.b(dsx);
            b.f();
            b.e(0.0f);
            b.R(c(displayMetrics, n - n2));
            list.add(b.c());
        }
        else {
            final een b2 = eeo.b(dsx);
            b2.f();
            b2.e(0.0f);
            float n7 = n3;
            if (n3 < 0.0f) {
                n7 = 0.0f;
            }
            b2.R(n7);
            list.add(b2.c());
        }
        list.addAll((Collection)o);
        if (n > n2) {
            final een b3 = eeo.b(dsx);
            b3.f();
            b3.e(0.0f);
            b3.R(c(displayMetrics, n - n2));
            list.add(b3.c());
        }
        final dwn b4 = dwo.b(dsx);
        b4.f(egv);
        b4.ab(n5);
        b4.l(n6);
        b4.c(egv2);
        if (n4 == 4) {
            b4.aa();
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            b4.h(((dst)iterator.next()).j());
        }
        return (dss)b4;
    }
    
    public static int f(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View$MeasureSpec.getSize(n), n2);
        }
        if (mode == 0) {
            return n2;
        }
        if (mode == 1073741824) {
            return View$MeasureSpec.getSize(n);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }
    
    public static int g(final int n) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode == Integer.MIN_VALUE) {
            return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), Integer.MIN_VALUE);
        }
        if (mode == 0) {
            return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), 0);
        }
        if (mode == 1073741824) {
            return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }
    
    public static void h(int n, int size, final float n2, final dwq dwq) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size2 = View$MeasureSpec.getSize(n);
        final double n3 = size2 / n2;
        final int mode2 = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int b = (int)Math.ceil(n3);
        final int a = (int)Math.ceil(size * n2);
        n = mode;
        if (mode == 0) {
            n = 0;
            if (mode2 == 0) {
                dwq.a = 0;
                dwq.b = 0;
                return;
            }
        }
        if (n == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (b > size) {
                dwq.a = a;
                dwq.b = size;
                return;
            }
            dwq.a = size2;
            dwq.b = b;
        }
        else if (n == 1073741824) {
            dwq.a = size2;
            if (mode2 != 0 && b > size) {
                dwq.b = size;
                return;
            }
            dwq.b = b;
        }
        else if (mode2 == 1073741824) {
            dwq.b = size;
            if (n != 0 && a > size2) {
                dwq.a = size2;
                return;
            }
            dwq.a = a;
        }
        else {
            if (n == Integer.MIN_VALUE) {
                dwq.a = size2;
                dwq.b = b;
                return;
            }
            if (mode2 == Integer.MIN_VALUE) {
                dwq.a = a;
                dwq.b = size;
            }
        }
    }
    
    public static boolean i(final bas bas, final btp btp, final boolean b, final paq paq) {
        try {
            long s = bas.s();
            if (!b) {
                s *= btp.b;
            }
            paq.a = s;
            return true;
        }
        catch (final NumberFormatException ex) {
            return false;
        }
    }
    
    public static boolean j(final bas bas, final btp btp, int n, final paq paq) {
        final int b = bas.b;
        final long q = bas.q();
        final long n2 = q >>> 16;
        if (n2 != n) {
            return false;
        }
        final boolean b2 = (n2 & 0x1L) == 0x1L;
        n = (int)(q >> 4 & 0xFL);
        if (n <= 7) {
            if (n != btp.g - 1) {
                return false;
            }
        }
        else if (n > 10 || btp.g != 2) {
            return false;
        }
        n = (int)(q >> 1 & 0x7L);
        if (n != 0) {
            if (n != btp.i) {
                return false;
            }
        }
        if ((q & 0x1L) != 0x1L && i(bas, btp, b2, paq)) {
            n = b(bas, (int)(q >> 12 & 0xFL));
            if (n != -1 && n <= btp.b) {
                final int e = btp.e;
                final int n3 = (int)(q >> 8 & 0xFL);
                if (n3 != 0) {
                    if (n3 <= 11) {
                        if (n3 != btp.f) {
                            return false;
                        }
                    }
                    else if (n3 == 12) {
                        if (bas.i() * 1000 != e) {
                            return false;
                        }
                    }
                    else {
                        if (n3 > 14) {
                            return false;
                        }
                        final int n4 = n = bas.m();
                        if (n3 == 14) {
                            n = n4 * 10;
                        }
                        if (n != e) {
                            return false;
                        }
                    }
                }
                n = bas.i();
                if (n == bax.ax(bas.a, b, bas.b - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
