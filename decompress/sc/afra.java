import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afra extends ahbh implements ahcw
{
    private static final afra a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private long e;
    private String f;
    private String g;
    private String h;
    private String i;
    private ahbp j;
    private ahbx k;
    private ahbx l;
    private ahbx m;
    private ahbx n;
    private ahbx o;
    private int p;
    private afqy q;
    private afrc r;
    private ahbx s;
    private ahbx t;
    private afqw u;
    private ahbx v;
    private byte w;
    
    static {
        ahbh.registerDefaultInstance((Class)afra.class, (ahbh)(a = new afra()));
    }
    
    private afra() {
        this.w = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = emptyIntList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.s = emptyProtobufList();
        this.t = emptyProtobufList();
        this.v = emptyProtobufList();
    }
    
    public static afqz b() {
        return (afqz)afra.a.createBuilder();
    }
    
    public static afqz c(final afra afra) {
        return (afqz)afra.a.createBuilder((ahbh)afra);
    }
    
    static afra d() {
        return afra.a;
    }
    
    public static void e(final afra afra, final int n) {
        afra.t(n);
    }
    
    public static void f(final afra afra, final afqy afqy) {
        afra.q(afqy);
    }
    
    public static void g(final afra afra, final afqx afqx) {
        afra.n(afqx);
    }
    
    public static void h(final afra afra, final afqw afqw) {
        afra.p(afqw);
    }
    
    public static void i(final afra afra, final long n) {
        afra.w(n);
    }
    
    public static void j(final afra afra, final String s) {
        afra.s(s);
    }
    
    public static void k(final afra afra, final String s) {
        afra.v(s);
    }
    
    public static void l(final afra afra, final String s) {
        afra.r(s);
    }
    
    public static void m(final afra afra, final String s) {
        afra.u(s);
    }
    
    private void n(final afqx afqx) {
        afqx.getClass();
        this.o();
        this.s.add((Object)afqx);
    }
    
    private void o() {
        final ahbx s = this.s;
        if (!s.c()) {
            this.s = ahbh.mutableCopy(s);
        }
    }
    
    private void p(final afqw u) {
        u.getClass();
        this.u = u;
        this.d |= 0x400;
    }
    
    private void q(final afqy q) {
        q.getClass();
        this.q = q;
        this.d |= 0x1;
    }
    
    private void r(final String h) {
        h.getClass();
        this.c |= 0x8000;
        this.h = h;
    }
    
    private void s(final String f) {
        this.c |= 0x800;
        this.f = f;
    }
    
    private void t(final int p) {
        this.c |= 0x40000000;
        this.p = p;
    }
    
    private void u(final String i) {
        this.c |= 0x20000;
        this.i = i;
    }
    
    private void v(final String g) {
        g.getClass();
        this.c |= 0x4000;
        this.g = g;
    }
    
    private void w(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    public afqy a() {
        afqy afqy;
        if ((afqy = this.q) == null) {
            afqy = afqy.a;
        }
        return afqy;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = afra.b) == null) {
                    synchronized (afra.class) {
                        if (afra.b == null) {
                            afra.b = (ahdd)new ahba((ahbh)afra.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return afra.a;
            }
            case 4: {
                return new afqz();
            }
            case 3: {
                return new afra();
            }
            case 2: {
                return newMessageInfo((MessageLite)afra.a, "\u0001\n\u0000\u0002\u0002;\n\u0000\u0001\u0001\u0002\u1002\u0001\t\u1008\u000e\r\u1008\u000b\u0011\u1008\u0011\u001f\u1006\u001e!\u1009 %\u1409\"(\u001b0\u1009*;\u1008\u000f", new Object[] { "c", "d", "e", "g", "f", "i", "p", "q", "r", "s", afqx.class, "u", "h" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
