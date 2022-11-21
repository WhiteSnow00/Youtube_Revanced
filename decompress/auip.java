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

public abstract class auip implements Serializable
{
    public static final auip a;
    public static Set b;
    public static aumt d;
    private static aumv e;
    private static volatile auip f;
    private static aule g;
    private static Map h;
    private static Map i;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String c;
    
    static {
        a = (auip)new aumu("UTC", "UTC", 0, 0);
        final aumt aumt = null;
        try {
            final String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    final aumv aumv = (aumv)Class.forName(property).newInstance();
                }
                catch (final Exception ex) {
                    final Thread currentThread = Thread.currentThread();
                    currentThread.getThreadGroup().uncaughtException(currentThread, ex);
                }
            }
        }
        catch (final SecurityException ex2) {}
        final aumv aumv = null;
        Object o = aumv;
        if (aumv == null) {
            try {
                o = new aumy((byte[])null);
            }
            catch (final Exception ex3) {
                final Thread currentThread2 = Thread.currentThread();
                currentThread2.getThreadGroup().uncaughtException(currentThread2, ex3);
                o = aumv;
            }
        }
        Object e;
        if ((e = o) == null) {
            e = new aumw();
        }
        final Set a2 = ((aumv)e).a();
        if (a2 == null || a2.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!a2.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (auip.a.equals(((aumv)e).b("UTC"))) {
            auip.e = (aumv)e;
            auip.b = a2;
            aumt aumt2;
            try {
                final String property2 = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
                aumt2 = aumt;
                if (property2 != null) {
                    try {
                        aumt2 = (aumt)Class.forName(property2).newInstance();
                    }
                    catch (final Exception ex4) {
                        final Thread currentThread3 = Thread.currentThread();
                        currentThread3.getThreadGroup().uncaughtException(currentThread3, ex4);
                        aumt2 = aumt;
                    }
                }
            }
            catch (final SecurityException ex5) {
                aumt2 = aumt;
            }
            aumt d;
            if ((d = aumt2) == null) {
                d = new aumt();
            }
            auip.d = d;
            return;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }
    
    protected auip(final String c) {
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
        aulx.e(sb, n2, 2);
        sb.append(':');
        n -= n2 * 3600000;
        final int n3 = n / 60000;
        aulx.e(sb, n3, 2);
        n -= n3 * 60000;
        if (n == 0) {
            return sb.toString();
        }
        final int n4 = n / 1000;
        sb.append(':');
        aulx.e(sb, n4, 2);
        n -= n4 * 1000;
        if (n == 0) {
            return sb.toString();
        }
        sb.append('.');
        aulx.e(sb, n, 3);
        return sb.toString();
    }
    
    public static auip i(final String s) {
        if (s == null) {
            return k();
        }
        if (s.equals("UTC")) {
            return auip.a;
        }
        final auip b = auip.e.b(s);
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
            return auip.a;
        }
        return q(h(o), o);
    }
    
    public static auip j(final int n) {
        if (n >= -86399999 && n <= 86399999) {
            return q(h(n), n);
        }
        final StringBuilder sb = new StringBuilder("Millis out of range: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static auip k() {
        Serializable f;
        if ((f = auip.f) == null) {
            synchronized (auip.class) {
                if ((f = auip.f) == null) {
                    auip auip = null;
                    f = null;
                    Label_0259: {
                        Label_0054: {
                            try {
                                final String property = System.getProperty("user.timezone");
                                if (property != null) {
                                    auip = i(property);
                                    break Label_0054;
                                }
                            }
                            catch (final IllegalArgumentException f) {
                                break Label_0259;
                            }
                            catch (final RuntimeException ex) {}
                            auip = null;
                        }
                        if (auip == null) {
                            try {
                                final TimeZone default1 = TimeZone.getDefault();
                                if (default1 == null) {
                                    f = (auip = k());
                                }
                                else {
                                    final String id = default1.getID();
                                    if (id.equals("UTC")) {
                                        f = (auip = auip.a);
                                    }
                                    else {
                                        final String p = p(id);
                                        if (p != null) {
                                            f = auip.e.b(p);
                                        }
                                        auip b;
                                        if ((b = (auip)f) == null) {
                                            b = auip.e.b(id);
                                        }
                                        if (b == null) {
                                            if (p == null) {
                                                f = default1.getID();
                                                if (((String)f).startsWith("GMT+") || ((String)f).startsWith("GMT-")) {
                                                    final int o = o(((String)f).substring(3));
                                                    if (o == 0L) {
                                                        f = (auip = auip.a);
                                                        break Label_0259;
                                                    }
                                                    f = (auip = q(h(o), o));
                                                    break Label_0259;
                                                }
                                            }
                                            f = new(java.lang.IllegalArgumentException.class)();
                                            final StringBuilder sb = new StringBuilder("The datetime zone id '");
                                            sb.append(id);
                                            sb.append("' is not recognised");
                                            new IllegalArgumentException(sb.toString());
                                            throw f;
                                        }
                                        auip = b;
                                    }
                                }
                            }
                            catch (final IllegalArgumentException ex2) {}
                        }
                    }
                    if ((f = auip) == null) {
                        f = auip.a;
                    }
                    auip.f = (auip)f;
                }
            }
        }
        return (auip)f;
    }
    
    private static int o(final String s) {
        final auin auin = new auin();
        aule r = r();
        if (r.c != auin) {
            r = new aule((aumb)r.a, (aulz)r.b, (auih)auin, (auip)r.d);
        }
        final Object b = r.b;
        if (b != null) {
            final aulv aulv = new aulv(r.b((auih)r.c));
            final int c = ((aulz)b).c(aulv, s, 0);
            int n;
            if (c >= 0) {
                if ((n = c) >= s.length()) {
                    return -(int)aulv.g(s);
                }
            }
            else {
                n = ~c;
            }
            throw new IllegalArgumentException(aulx.c(s.toString(), n));
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }
    
    private static String p(String s) {
        synchronized (auip.class) {
            Map i;
            if ((i = auip.i) == null) {
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
                auip.i = i;
            }
            s = (String)i.get(s);
            return s;
        }
    }
    
    private static auip q(final String s, final int n) {
        monitorenter(auip.class);
        Label_0016: {
            if (n != 0) {
                break Label_0016;
            }
            try {
                return auip.a;
                final aumu aumu;
                Label_0068: {
                    aumu = new aumu(s, (String)null, n, n);
                }
                auip.h.put(s, new SoftReference(aumu));
                return (auip)aumu;
                while (true) {
                    final Reference reference = auip.h.get(s);
                    iftrue(Label_0068:)(reference == null);
                    Block_3: {
                        Block_4: {
                            break Block_4;
                            iftrue(Label_0034:)(auip.h != null);
                            break Block_3;
                        }
                        final auip auip = (auip)reference.get();
                        iftrue(Label_0068:)(auip == null);
                        return auip;
                    }
                    auip.h = new HashMap();
                    continue;
                }
            }
            finally {
                monitorexit(auip.class);
            }
        }
    }
    
    private static aule r() {
        synchronized (auip.class) {
            if (auip.g == null) {
                final aupl aupl = new aupl();
                aupl.u((String)null, true, 4);
                auip.g = aupl.a();
            }
            return auip.g;
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
        return new auio(this.c);
    }
}
