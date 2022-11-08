import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.Map;
import java.util.Set;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufc implements Serializable
{
    public static final aufc a;
    public static Set b;
    public static auji d;
    private static aujk e;
    private static volatile aufc f;
    private static auhr g;
    private static Map h;
    private static Map i;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String c;
    
    static {
        a = (aufc)new aujj("UTC", "UTC", 0, 0);
        final auji auji = null;
        try {
            final String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    final aujk aujk = (aujk)Class.forName(property).newInstance();
                }
                catch (final Exception ex) {
                    final Thread currentThread = Thread.currentThread();
                    currentThread.getThreadGroup().uncaughtException(currentThread, ex);
                }
            }
        }
        catch (final SecurityException ex2) {}
        final aujk aujk = null;
        Object o = aujk;
        if (aujk == null) {
            try {
                o = new aujn();
            }
            catch (final Exception ex3) {
                final Thread currentThread2 = Thread.currentThread();
                currentThread2.getThreadGroup().uncaughtException(currentThread2, ex3);
                o = aujk;
            }
        }
        Object e;
        if ((e = o) == null) {
            e = new aujl();
        }
        final Set a2 = ((aujk)e).a();
        if (a2 == null || a2.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!a2.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (aufc.a.equals(((aujk)e).b("UTC"))) {
            aufc.e = (aujk)e;
            aufc.b = a2;
            auji auji2;
            try {
                final String property2 = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
                auji2 = auji;
                if (property2 != null) {
                    try {
                        auji2 = (auji)Class.forName(property2).newInstance();
                    }
                    catch (final Exception ex4) {
                        final Thread currentThread3 = Thread.currentThread();
                        currentThread3.getThreadGroup().uncaughtException(currentThread3, ex4);
                        auji2 = auji;
                    }
                }
            }
            catch (final SecurityException ex5) {
                auji2 = auji;
            }
            auji d;
            if ((d = auji2) == null) {
                d = new auji();
            }
            aufc.d = d;
            return;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }
    
    protected aufc(final String c) {
        this.c = c;
    }
    
    public static String h(int n) {
        final StringBuffer sb = new StringBuffer();
        if (n >= 0) {
            sb.append('+');
        }
        else {
            sb.append('-');
            n = -n;
        }
        final int n2 = n / 3600000;
        auik.e(sb, n2, 2);
        n -= n2 * 3600000;
        final int n3 = n / 60000;
        sb.append(':');
        auik.e(sb, n3, 2);
        n -= n3 * 60000;
        if (n == 0) {
            return sb.toString();
        }
        final int n4 = n / 1000;
        sb.append(':');
        auik.e(sb, n4, 2);
        n -= n4 * 1000;
        if (n == 0) {
            return sb.toString();
        }
        sb.append('.');
        auik.e(sb, n, 3);
        return sb.toString();
    }
    
    public static aufc i(final String s) {
        if (s == null) {
            return k();
        }
        if (s.equals("UTC")) {
            return aufc.a;
        }
        final aufc b = aufc.e.b(s);
        if (b != null) {
            return b;
        }
        if (!s.startsWith("+") && !s.startsWith("-")) {
            final StringBuilder sb = new StringBuilder("The datetime zone id '");
            sb.append(s);
            sb.append("' is not recognised");
            throw new IllegalArgumentException(sb.toString());
        }
        final int o = o(s);
        if (o == 0L) {
            return aufc.a;
        }
        return q(h(o), o);
    }
    
    public static aufc j(final int n) {
        if (n >= -86399999 && n <= 86399999) {
            return q(h(n), n);
        }
        final StringBuilder sb = new StringBuilder("Millis out of range: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static aufc k() {
        final aufc f;
        if ((f = aufc.f) == null) {
            synchronized (aufc.class) {
                if (aufc.f == null) {
                    aufc i = null;
                    aufc b = null;
                    aufc aufc = null;
                    Label_0252: {
                        Label_0056: {
                            try {
                                final String property = System.getProperty("user.timezone");
                                if (property != null) {
                                    i = i(property);
                                    break Label_0056;
                                }
                            }
                            catch (final IllegalArgumentException ex) {
                                aufc = i;
                                break Label_0252;
                            }
                            catch (final RuntimeException ex2) {}
                            i = null;
                        }
                        if (i == null) {
                            try {
                                final TimeZone default1 = TimeZone.getDefault();
                                Label_0072: {
                                    if (default1 == null) {
                                        aufc = k();
                                    }
                                    else {
                                        final String id = default1.getID();
                                        if (id.equals("UTC")) {
                                            aufc = aufc.a;
                                        }
                                        else {
                                            final String p = p(id);
                                            if (p != null) {
                                                b = aufc.e.b(p);
                                            }
                                            aufc b2;
                                            if ((b2 = b) == null) {
                                                b2 = aufc.e.b(id);
                                            }
                                            if ((aufc = b2) == null) {
                                                if (p == null) {
                                                    final String id2 = default1.getID();
                                                    if (id2.startsWith("GMT+") || id2.startsWith("GMT-")) {
                                                        final int o = o(id2.substring(3));
                                                        if (o == 0L) {
                                                            aufc = aufc.a;
                                                            break Label_0072;
                                                        }
                                                        aufc = q(h(o), o);
                                                        break Label_0072;
                                                    }
                                                }
                                                final StringBuilder sb = new StringBuilder("The datetime zone id '");
                                                sb.append(id);
                                                sb.append("' is not recognised");
                                                throw new IllegalArgumentException(sb.toString());
                                            }
                                        }
                                    }
                                }
                                break Label_0252;
                            }
                            catch (final IllegalArgumentException ex3) {}
                        }
                        aufc = i;
                    }
                    aufc a;
                    if ((a = aufc) == null) {
                        a = aufc.a;
                    }
                    aufc.f = a;
                }
            }
        }
        return f;
    }
    
    private static int o(final String s) {
        final aufa aufa = new aufa();
        auhr r = r();
        if (r.c != aufa) {
            r = new auhr((auio)r.a, (auim)r.b, (aueu)aufa, (aufc)r.d);
        }
        final Object b = r.b;
        if (b != null) {
            final auii auii = new auii(r.b((aueu)r.c));
            final int c = ((auim)b).c(auii, (CharSequence)s, 0);
            int n;
            if (c >= 0) {
                if ((n = c) >= s.length()) {
                    return -(int)auii.g((CharSequence)s);
                }
            }
            else {
                n = ~c;
            }
            throw new IllegalArgumentException(auik.c(s.toString(), n));
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }
    
    private static String p(String s) {
        synchronized (aufc.class) {
            Map i;
            if ((i = aufc.i) == null) {
                i = new HashMap();
                i.put("GMT", "UTC");
                i.put("WET", "WET");
                i.put("CET", "CET");
                i.put("MET", "CET");
                i.put("ECT", "CET");
                i.put("EET", "EET");
                i.put("MIT", "Pacific/Apia");
                i.put("HST", "Pacific/Honolulu");
                i.put("AST", "America/Anchorage");
                i.put("PST", "America/Los_Angeles");
                i.put("MST", "America/Denver");
                i.put("PNT", "America/Phoenix");
                i.put("CST", "America/Chicago");
                i.put("EST", "America/New_York");
                i.put("IET", "America/Indiana/Indianapolis");
                i.put("PRT", "America/Puerto_Rico");
                i.put("CNT", "America/St_Johns");
                i.put("AGT", "America/Argentina/Buenos_Aires");
                i.put("BET", "America/Sao_Paulo");
                i.put("ART", "Africa/Cairo");
                i.put("CAT", "Africa/Harare");
                i.put("EAT", "Africa/Addis_Ababa");
                i.put("NET", "Asia/Yerevan");
                i.put("PLT", "Asia/Karachi");
                i.put("IST", "Asia/Kolkata");
                i.put("BST", "Asia/Dhaka");
                i.put("VST", "Asia/Ho_Chi_Minh");
                i.put("CTT", "Asia/Shanghai");
                i.put("JST", "Asia/Tokyo");
                i.put("ACT", "Australia/Darwin");
                i.put("AET", "Australia/Sydney");
                i.put("SST", "Pacific/Guadalcanal");
                i.put("NST", "Pacific/Auckland");
                aufc.i = i;
            }
            s = (String)i.get(s);
            return s;
        }
    }
    
    private static aufc q(final String s, final int n) {
        monitorenter(aufc.class);
        Label_0016: {
            if (n != 0) {
                break Label_0016;
            }
            try {
                return aufc.a;
                while (true) {
                    Label_0034: {
                        while (true) {
                            aufc.h = new HashMap();
                            break Label_0034;
                            iftrue(Label_0034:)(aufc.h != null);
                            continue;
                        }
                        final Reference reference;
                        final aufc aufc = (aufc)reference.get();
                        iftrue(Label_0068:)(aufc == null);
                        return aufc;
                        final aujj aujj;
                        Label_0068: {
                            aujj = new aujj(s, (String)null, n, n);
                        }
                        aufc.h.put(s, new SoftReference(aujj));
                        return (aufc)aujj;
                    }
                    final Reference reference = aufc.h.get(s);
                    iftrue(Label_0068:)(reference == null);
                    continue;
                }
            }
            finally {
                monitorexit(aufc.class);
            }
        }
    }
    
    private static auhr r() {
        synchronized (aufc.class) {
            if (aufc.g == null) {
                final auma auma = new auma();
                auma.u((String)null, true, 4);
                aufc.g = auma.a();
            }
            return aufc.g;
        }
    }
    
    public abstract int a(final long p0);
    
    public int b(long f) {
        final int a = this.a(f);
        final long n = f - a;
        final int a2 = this.a(n);
        if (a != a2) {
            if (a - a2 < 0 && this.e(n) != this.e(f - a2)) {
                return a;
            }
        }
        else if (a >= 0) {
            f = this.f(n);
            if (f < n) {
                final int a3 = this.a(f);
                if (n - f <= a3 - a) {
                    return a3;
                }
            }
        }
        return a2;
    }
    
    public abstract int c(final long p0);
    
    public final long d(final long n) {
        final long n2 = this.a(n);
        final long n3 = n + n2;
        if ((n ^ n3) < 0L && (n ^ n2) >= 0L) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return n3;
    }
    
    public abstract long e(final long p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract long f(final long p0);
    
    public abstract String g(final long p0);
    
    @Override
    public int hashCode() {
        return this.c.hashCode() + 57;
    }
    
    public abstract boolean l();
    
    public final boolean m(final long n) {
        return this.a(n) == this.c(n);
    }
    
    public final long n(final long n, long n2) {
        final int a = this.a(n2);
        if (this.a(n2 = n - a) != a) {
            int a2 = this.a(n);
            final long n3 = n - a2;
            final int a3 = this.a(n3);
            Label_0134: {
                if (a2 != a3 && a2 < 0) {
                    final long e = this.e(n3);
                    long n4 = Long.MAX_VALUE;
                    n2 = e;
                    if (e == n3) {
                        n2 = Long.MAX_VALUE;
                    }
                    final long n5 = n - a3;
                    final long e2 = this.e(n5);
                    if (e2 != n5) {
                        n4 = e2;
                    }
                    if (n2 != n4) {
                        break Label_0134;
                    }
                }
                a2 = a3;
            }
            final long n6 = a2;
            final long n7 = n2 = n - n6;
            if ((n ^ n7) < 0L) {
                if ((n ^ n6) < 0L) {
                    throw new ArithmeticException("Subtracting time zone offset caused overflow");
                }
                n2 = n7;
            }
        }
        return n2;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
    
    protected Object writeReplace() {
        return new aufb(this.c);
    }
}
