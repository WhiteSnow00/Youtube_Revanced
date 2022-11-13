import java.net.Authenticator;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.net.URL;
import java.net.PasswordAuthentication;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import io.grpc.Status;
import java.util.EnumSet;
import io.grpc.Status$Code;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfn
{
    public static volatile asjr a;
    public static volatile asjr b;
    
    public static void A(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("More produced than requested: ");
            sb.append(n3);
            atqx.j((Throwable)new IllegalStateException(sb.toString()));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
    }
    
    public static void B(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return;
            }
            if (value == Long.MAX_VALUE) {
                return;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("More produced than requested: ");
            sb.append(n3);
            atqx.j((Throwable)new IllegalStateException(sb.toString()));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
    }
    
    public static boolean C(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static Set a(final Map map, final String s) {
        final List e = ascm.e(map, s);
        if (e == null) {
            return null;
        }
        final EnumSet<Status$Code> none = EnumSet.noneOf(Status$Code.class);
        for (final Object next : e) {
            Label_0166: {
                if (next instanceof Double) {
                    final Double n = (Double)next;
                    final int intValue = n.intValue();
                    final double n2 = intValue;
                    final double doubleValue = n;
                    final boolean b = true;
                    aefb.M(n2 == doubleValue, "Status code %s is not integral", next);
                    final Status$Code status$Code = Status.fromCodeValue(intValue).getCode();
                    aefb.M(status$Code.value() == n.intValue() && b, "Status code %s is not valid", next);
                    break Label_0166;
                }
                if (!(next instanceof String)) {
                    break Label_0166;
                }
                try {
                    final Status$Code status$Code = Status$Code.a((String)next);
                    none.add(status$Code);
                    continue;
                }
                catch (final IllegalArgumentException ex) {
                    final String value = String.valueOf(next);
                    final StringBuilder sb = new StringBuilder("Status code ");
                    sb.append(value);
                    sb.append(" is not valid");
                    throw new afay(sb.toString(), (Throwable)ex);
                }
            }
            final String value2 = String.valueOf(next);
            final String value3 = String.valueOf(((String)next).getClass());
            final StringBuilder sb2 = new StringBuilder("Can not convert status code ");
            sb2.append(value2);
            sb2.append(" to Status.Code, because its type is ");
            sb2.append(value3);
            throw new afay(sb2.toString());
        }
        return Collections.unmodifiableSet((Set<?>)none);
    }
    
    public static final PasswordAuthentication b(final String s, final InetAddress inetAddress, final int n) {
        URL url;
        try {
            url = new URL("https", s, n, "");
        }
        catch (final MalformedURLException ex) {
            aseh.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[] { "https", s });
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(s, inetAddress, n, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }
    
    public static asir c() {
        return e(askj.b);
    }
    
    public static asir d(final asjg asjg) {
        askk.b((Object)asjg, "run is null");
        return new asip(asjg);
    }
    
    public static asir e(final Runnable runnable) {
        askk.b((Object)runnable, "run is null");
        return new asit(runnable);
    }
    
    public static final void f(final Appendable appendable, final Object o, final atng atng) {
        if (atng != null) {
            appendable.append((CharSequence)atng.invoke(o));
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
    
    public static boolean g(final CharSequence charSequence) {
        charSequence.getClass();
        final int length = charSequence.length();
        boolean b = true;
        if (length != 0) {
            final atlf a = ((atos)new atot(0, charSequence.length() - 1)).a();
            do {
                b = b;
                if (a.a) {
                    continue;
                }
                return b;
            } while (u(charSequence.charAt(a.a())));
            b = false;
        }
        return b;
    }
    
    public static int h(final CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }
    
    public static int i(final CharSequence charSequence, final String s, int index, final boolean b) {
        charSequence.getClass();
        s.getClass();
        if (!b && charSequence instanceof String) {
            index = ((String)charSequence).indexOf(s, index);
        }
        else {
            final atot atot = new atot(aryu.e(index, 0), aryu.f(charSequence.length(), charSequence.length()));
            Label_0162: {
                if (charSequence instanceof String) {
                    final int a = ((atos)atot).a;
                    final int b2 = ((atos)atot).b;
                    if ((index = a) <= b2) {
                        while (!t(s, (String)charSequence, index, s.length(), b)) {
                            if (index == b2) {
                                break Label_0162;
                            }
                            ++index;
                        }
                        return index;
                    }
                }
                else {
                    final int a2 = ((atos)atot).a;
                    final int b3 = ((atos)atot).b;
                    if ((index = a2) <= b3) {
                        while (!o(s, charSequence, index, s.length(), b)) {
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
    
    public static String j(String substring, final String s, final String s2) {
        final int n = n(substring, s, 0, false, 6);
        if (n == -1) {
            return s2;
        }
        substring = substring.substring(n + s.length(), substring.length());
        substring.getClass();
        return substring;
    }
    
    public static boolean k(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        charSequence.getClass();
        charSequence2.getClass();
        return n(charSequence, (String)charSequence2, 0, b, 2) >= 0;
    }
    
    public static boolean l(final CharSequence charSequence, final CharSequence charSequence2) {
        return k(charSequence, charSequence2, false);
    }
    
    public static int m(final CharSequence charSequence, final char c, int n, final int n2) {
        charSequence.getClass();
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return ((String)charSequence).indexOf(c, n);
    }
    
    public static int n(final CharSequence charSequence, final String s, int n, final boolean b, int n2) {
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
        return i(charSequence, s, n, (boolean)(((b ? 1 : 0) & n2) != 0x0));
    }
    
    public static boolean o(final CharSequence charSequence, final CharSequence charSequence2, final int n, final int n2, final boolean b) {
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
    
    public static String p(final String s, final String s2, final String s3) {
        int n = i(s, s2, 0, false);
        String string = s;
        if (n >= 0) {
            final int length = s2.length();
            final int n2 = s.length() - length + s3.length();
            if (n2 < 0) {
                throw new OutOfMemoryError();
            }
            final StringBuilder sb = new StringBuilder(n2);
            int n3 = 0;
            int i;
            int n4;
            do {
                sb.append(s, n3, n);
                sb.append(s3);
                n4 = n + length;
                if (n >= s.length()) {
                    break;
                }
                i = (n = i(s, s2, n + aryu.e(length, 1), (boolean)(0 != 0)));
                n3 = n4;
            } while (i > 0);
            sb.append(s, n4, s.length());
            string = sb.toString();
        }
        return string;
    }
    
    public static boolean q(final String s, final String s2) {
        s.getClass();
        return s.startsWith(s2);
    }
    
    public static String r(String substring) {
        substring.getClass();
        substring.getClass();
        final int lastIndex = substring.lastIndexOf(46, h(substring));
        if (lastIndex == -1) {
            return substring;
        }
        substring = substring.substring(lastIndex + 1, substring.length());
        substring.getClass();
        return substring;
    }
    
    public static int s(final CharSequence charSequence, final String s) {
        final int h = h(charSequence);
        charSequence.getClass();
        return ((String)charSequence).lastIndexOf(s, h);
    }
    
    public static boolean t(final String s, final String s2, final int n, final int n2, final boolean b) {
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
    
    public static final boolean u(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    public static final void v(final int n) {
        final atot atot = new atot(2, 36);
        if (((atos)atot).a <= n && n <= ((atos)atot).b) {
            return;
        }
        final StringBuilder sb = new StringBuilder("radix ");
        sb.append(n);
        sb.append(" was not in valid range ");
        sb.append(new atot(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static long w(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, y(value, n)));
        return value;
    }
    
    public static long x(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, y(value, n)));
        return value;
    }
    
    public static long y(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static long z(final long n, final long n2) {
        final long n3 = n * n2;
        if ((n | n2) >>> 31 != 0L && n3 / n != n2) {
            return Long.MAX_VALUE;
        }
        return n3;
    }
}
