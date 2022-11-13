import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CancellationException;
import java.util.Map;
import java.util.Set;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsz
{
    public static Thread a;
    
    private aqsz() {
    }
    
    private static String A(final String s) {
        final String[] split = s.substring(s.lastIndexOf(47) + 1).split("_", -1);
        if (split.length == 6 && split[2].length() == 10 && split[2].charAt(4) == '-' && split[2].charAt(7) == '-') {
            return split[2];
        }
        throw new aqwi();
    }
    
    public static aqtl a(final aqtl aqtl) {
        if (aqtl == null) {
            return null;
        }
        final int j = aqtl.j;
        if (j == 0) {
            throw null;
        }
        int i = 0;
        switch (j - 1) {
            default: {
                return aqtl;
            }
            case 16: {
                if (aqtl.e == 0 && aqtl.f == 0) {
                    return new aqtl(2);
                }
                final aqtl a = a(aqtl.c[0]);
                final int f = aqtl.f;
                if (f == -1) {
                    final int e = aqtl.e;
                    if (e == 0) {
                        return z(14, aqtl.b, a, null);
                    }
                    if (e == 1) {
                        return z(15, aqtl.b, a, null);
                    }
                    final aqtl aqtl2 = new aqtl(18);
                    final ArrayList list = new ArrayList();
                    while (i < aqtl.e - 1) {
                        list.add(a);
                        ++i;
                    }
                    list.add(z(15, aqtl.b, a, null));
                    aqtl2.c = list.toArray(new aqtl[list.size()]);
                    return aqtl2;
                }
                else {
                    final int e2 = aqtl.e;
                    ArrayList<aqtl> list2 = null;
                    Label_0300: {
                        if (e2 == 1) {
                            if (f == 1) {
                                return a;
                            }
                        }
                        else if (e2 <= 0) {
                            list2 = null;
                            break Label_0300;
                        }
                        final ArrayList list3 = new ArrayList();
                        int n = 0;
                        while (true) {
                            list2 = list3;
                            if (n >= aqtl.e) {
                                break;
                            }
                            list3.add(a);
                            ++n;
                        }
                    }
                    if (aqtl.f > aqtl.e) {
                        aqtl aqtl3 = z(16, aqtl.b, a, null);
                        for (int k = aqtl.e + 1; k < aqtl.f; ++k) {
                            final aqtl aqtl4 = new aqtl(18);
                            aqtl4.c = new aqtl[] { a, aqtl3 };
                            aqtl3 = z(16, aqtl.b, aqtl4, null);
                        }
                        if (list2 == null) {
                            return aqtl3;
                        }
                        list2.add(aqtl3);
                    }
                    if (list2 != null) {
                        final aqtl aqtl5 = new aqtl(18);
                        aqtl5.c = list2.toArray(new aqtl[list2.size()]);
                        return aqtl5;
                    }
                    return new aqtl(1);
                }
                break;
            }
            case 13:
            case 14:
            case 15: {
                return z(aqtl.j, aqtl.b, a(aqtl.c[0]), aqtl);
            }
            case 12:
            case 17:
            case 18: {
                aqtl aqtl6 = aqtl;
                int n2 = 0;
                while (true) {
                    final aqtl[] c = aqtl.c;
                    if (n2 >= c.length) {
                        break;
                    }
                    final aqtl aqtl7 = c[n2];
                    final aqtl a2 = a(aqtl7);
                    aqtl aqtl8;
                    if ((aqtl8 = aqtl6) == aqtl) {
                        aqtl8 = aqtl6;
                        if (a2 != aqtl7) {
                            aqtl8 = new aqtl(aqtl);
                            aqtl8.d = null;
                            final aqtl[] c2 = aqtl.c;
                            aqtl8.c = aqth.k(c2, 0, c2.length);
                        }
                    }
                    if (aqtl8 != aqtl) {
                        aqtl8.c[n2] = a2;
                    }
                    ++n2;
                    aqtl6 = aqtl8;
                }
                return aqtl6;
            }
        }
    }
    
    public static void b(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static String c(String s) {
        s = s.substring(s.lastIndexOf(47) + 1);
        final int index = s.indexOf(95);
        final int n = index + 1;
        final int index2 = s.indexOf(95, n);
        if (index >= index2) {
            throw new aqwi();
        }
        s = s.substring(n, index2);
        final int index3 = s.indexOf(45);
        final int lastIndex = s.lastIndexOf(45);
        if (index3 < lastIndex) {
            return s.substring(index3 + 1, lastIndex);
        }
        throw new aqwi();
    }
    
    public static boolean d(String a, final String s) {
        if (a.isEmpty()) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        a = A(a);
        try {
            return a.compareTo(A(s)) > 0;
        }
        catch (final aqwi aqwi) {
            return true;
        }
    }
    
    public static int e(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int f(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int g(final int n) {
        if (n == 2) {
            return 3;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int h(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int i(final int n) {
        if (n < 3) {
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)(n / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
    
    public static LinkedHashMap j(final int n) {
        return new LinkedHashMap(i(n));
    }
    
    public static List k(final int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(n);
    }
    
    public static void l(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.format(s, array));
    }
    
    public static void m(final Object o) {
        o.getClass();
    }
    
    public static void n(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static Object o(final Context context) {
        final Application r = r(context.getApplicationContext());
        final boolean b = r instanceof arlm;
        final Class<? extends Application> class1 = r.getClass();
        if (b) {
            return ((arlm)r).aR();
        }
        throw new IllegalArgumentException(String.format("Sting BroadcastReceiver must be attached to an @Sting Application. Found: %s", class1));
    }
    
    public static avr p(final qt qt, final avr avr) {
        final arzp yo = ((arkn)aqsy.k(qt, arkn.class)).yO();
        Bundle extras;
        if (qt.getIntent() != null) {
            extras = qt.getIntent().getExtras();
        }
        else {
            extras = null;
        }
        return yo.c((cgk)qt, extras, avr);
    }
    
    public static avr q(final br br, final avr avr) {
        return ((arko)aqsy.k(br, arko.class)).aB().b(br, avr);
    }
    
    public static Application r(final Context context) {
        if (!(context instanceof Application)) {
            Context baseContext = context;
            while (baseContext instanceof ContextWrapper) {
                final Context context2 = baseContext = ((ContextWrapper)baseContext).getBaseContext();
                if (context2 instanceof Application) {
                    return (Application)context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(context))));
        }
        return (Application)context;
    }
    
    public static boolean s(final Context context) {
        final Set ds = ((arkm)aqsy.j(context, arkm.class)).dS();
        final afiq afiq = (afiq)ds;
        l(afiq.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        return ds.isEmpty() || (boolean)afiq.k().next();
    }
    
    public static final arlu t(final auch auch) {
        return new arlu((Map)auch.a);
    }
    
    public static atrz u() {
        return new atrz();
    }
    
    public static void v(final atrw atrw) {
        atrw.r((CancellationException)null);
    }
    
    public static atrh w(final atrw atrw, final boolean b, final atng atng, final int n) {
        final boolean b2 = false;
        return atrw.tN(0x1 == ((b ? 1 : 0) & ((n & 0x1) ^ 0x1)) || b2, (n & 0x2) != 0x0, atng);
    }
    
    public static final atkh x(final atmv atmv) {
        atmv.getClass();
        return (atkh)new atkn(atmv);
    }
    
    public static boolean y(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    private static aqtl z(final int n, final int b, final aqtl aqtl, aqtl aqtl2) {
        final int j = aqtl.j;
        if (j == 2) {
            return aqtl;
        }
        if (n == j && (b & 0x20) == (aqtl.b & 0x20)) {
            return aqtl;
        }
        if (aqtl2 != null && aqtl2.j == n && (aqtl2.b & 0x20) == (b & 0x20) && aqtl == aqtl2.c[0]) {
            return aqtl2;
        }
        aqtl2 = new aqtl(n);
        aqtl2.b = b;
        aqtl2.c = new aqtl[] { aqtl };
        return aqtl2;
    }
}
