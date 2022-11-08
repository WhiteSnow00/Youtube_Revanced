import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Method;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubt
{
    public static String a() {
        return "108.0.5340.9@".concat("fa2780c5");
    }
    
    public static Context b(Context contextForSplit, final String s) {
        final auaq a = auaq.a();
        try {
            contextForSplit = ((Context)contextForSplit).createContextForSplit(s);
            a.close();
            return (Context)contextForSplit;
        }
        finally {
            Label_0054: {
                final Throwable t2;
                try {
                    a.close();
                    break Label_0054;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s2 = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s2, (Class[])array);
                    final Object o = contextForSplit;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(o, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s2 = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s2, (Class[])array);
                    final Object o = contextForSplit;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(o, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    public static final void d(final Appendable appendable, final Object o, final atml atml) {
        if (atml != null) {
            appendable.append((CharSequence)atml.invoke(o));
            return;
        }
        if (o != null) {
            if (!(o instanceof CharSequence)) {
                if (o instanceof Character) {
                    appendable.append((char)o);
                    return;
                }
                appendable.append(o.toString());
                return;
            }
        }
        appendable.append((CharSequence)o);
    }
    
    public static boolean e(final CharSequence charSequence) {
        charSequence.getClass();
        final int length = charSequence.length();
        boolean b = true;
        if (length != 0) {
            final atkk a = ((atnx)new atny(0, charSequence.length() - 1)).a();
            do {
                b = b;
                if (a.a) {
                    continue;
                }
                return b;
            } while (s(charSequence.charAt(a.a())));
            b = false;
        }
        return b;
    }
    
    public static int f(final CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }
    
    public static int g(final CharSequence charSequence, final String s, int index, final boolean b) {
        charSequence.getClass();
        s.getClass();
        if (!b && charSequence instanceof String) {
            index = ((String)charSequence).indexOf(s, index);
        }
        else {
            final atny atny = new atny(atnp.d(index, 0), atnp.e(charSequence.length(), charSequence.length()));
            Label_0162: {
                if (charSequence instanceof String) {
                    final int a = ((atnx)atny).a;
                    final int b2 = ((atnx)atny).b;
                    if ((index = a) <= b2) {
                        while (!r(s, (String)charSequence, index, s.length(), b)) {
                            if (index == b2) {
                                break Label_0162;
                            }
                            ++index;
                        }
                        return index;
                    }
                }
                else {
                    final int a2 = ((atnx)atny).a;
                    final int b3 = ((atnx)atny).b;
                    if ((index = a2) <= b3) {
                        while (!m(s, charSequence, index, s.length(), b)) {
                            if (index == b3) {
                                break Label_0162;
                            }
                            ++index;
                        }
                        return index;
                    }
                }
            }
            index = -1;
        }
        return index;
    }
    
    public static String h(String substring, final String s, final String s2) {
        final int l = l(substring, s, 0, false, 6);
        if (l == -1) {
            return s2;
        }
        substring = substring.substring(l + s.length(), substring.length());
        substring.getClass();
        return substring;
    }
    
    public static boolean i(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        charSequence.getClass();
        charSequence2.getClass();
        return l(charSequence, (String)charSequence2, 0, b, 2) >= 0;
    }
    
    public static /* synthetic */ int l(final CharSequence charSequence, final String s, int n, final boolean b, int n2) {
        final int n3 = 0;
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x4) != 0x0) {
            n2 = n3;
        }
        else {
            n2 = 1;
        }
        return g(charSequence, s, n, (boolean)(((b ? 1 : 0) & n2) != 0x0));
    }
    
    public static boolean m(final CharSequence charSequence, final CharSequence charSequence2, final int n, final int n2, final boolean b) {
        charSequence.getClass();
        if (n >= 0 && charSequence.length() - n2 >= 0 && n <= charSequence2.length() - n2) {
            for (int i = 0; i < n2; ++i) {
                final char char1 = charSequence.charAt(i);
                final char char2 = charSequence2.charAt(n + i);
                if (char1 != char2) {
                    if (b) {
                        final char upperCase = Character.toUpperCase(char1);
                        final char upperCase2 = Character.toUpperCase(char2);
                        if (upperCase == upperCase2) {
                            continue;
                        }
                        if (Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
                            continue;
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean r(final String s, final String s2, final int n, final int n2, final boolean b) {
        s.getClass();
        boolean b2;
        if (!b) {
            b2 = s.regionMatches(0, s2, n, n2);
        }
        else {
            b2 = s.regionMatches(true, 0, s2, n, n2);
        }
        return b2;
    }
    
    public static final boolean s(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    public static final void t(final int n) {
        final atny atny = new atny(2, 36);
        if (((atnx)atny).a <= n && n <= ((atnx)atny).b) {
            return;
        }
        final StringBuilder sb = new StringBuilder("radix ");
        sb.append(n);
        sb.append(" was not in valid range ");
        sb.append(new atny(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void u(final ashj ashj, final AtomicInteger atomicInteger, final athl athl) {
        if (atomicInteger.getAndIncrement() == 0) {
            final Throwable d = athp.d(athl);
            if (d != null) {
                ashj.b(d);
                return;
            }
            ashj.tu();
        }
    }
    
    public static void v(final aujp aujp, final AtomicInteger atomicInteger, final athl athl) {
        if (atomicInteger.getAndIncrement() == 0) {
            final Throwable d = athp.d(athl);
            if (d != null) {
                aujp.b(d);
                return;
            }
            aujp.tu();
        }
    }
    
    public static void w(final ashj ashj, final Throwable t, final AtomicInteger atomicInteger, final athl athl) {
        if (athp.e(athl, t)) {
            if (atomicInteger.getAndIncrement() == 0) {
                ashj.b(athp.d(athl));
            }
            return;
        }
        aulo.r(t);
    }
    
    public static void x(final aujp aujp, final Throwable t, final AtomicInteger atomicInteger, final athl athl) {
        if (athp.e(athl, t)) {
            if (atomicInteger.getAndIncrement() == 0) {
                aujp.b(athp.d(athl));
            }
            return;
        }
        aulo.r(t);
    }
    
    public static void y(final aujp aujp, final Object o, final AtomicInteger atomicInteger, final athl athl) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            aujp.tr(o);
            if (atomicInteger.decrementAndGet() != 0) {
                final Throwable d = athp.d(athl);
                if (d != null) {
                    aujp.b(d);
                    return;
                }
                aujp.tu();
            }
        }
    }
}
