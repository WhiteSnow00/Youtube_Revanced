import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arii extends ahcu implements ahcv
{
    private static final arii a;
    private static volatile ahev b;
    private int c;
    private long d;
    private long e;
    private String f;
    private int g;
    private String h;
    private long i;
    private ahdp j;
    private ahbt k;
    private ahbt m;
    private String n;
    private String o;
    private String p;
    private String q;
    private long r;
    private ahbt s;
    private String t;
    private ahdh u;
    private ahdh v;
    private int w;
    private boolean x;
    private String y;
    private byte z;
    
    static {
        ahcz.registerDefaultInstance(arii.class, (ahcz)(a = new arii()));
    }
    
    private arii() {
        this.w = -1;
        this.z = 2;
        this.f = "";
        this.h = "";
        this.j = emptyProtobufList();
        this.k = ahbt.b;
        final ahbt b = ahbt.b;
        this.m = b;
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
        this.r = 180000L;
        this.s = b;
        this.t = "";
        this.u = emptyIntList();
        this.v = emptyIntList();
        this.y = "";
    }
    
    public static arih g() {
        return (arih)((ahcz)arii.a).createBuilder();
    }
    
    static arii h() {
        return arii.a;
    }
    
    public static void i(final arii arii, final boolean b) {
        arii.v(true);
    }
    
    public static void j(final arii arii, final long n) {
        arii.t(n);
    }
    
    public static void k(final arii arii, final long n) {
        arii.u(n);
    }
    
    public static void l(final arii arii, final int n) {
        arii.r(n);
    }
    
    public static void m(final arii arii, final long n) {
        arii.s(n);
    }
    
    public static void n(final arii arii, final ahbt ahbt) {
        arii.w(ahbt);
    }
    
    public static void o(final arii arii, final long n) {
        arii.x(n);
    }
    
    public static void p(final arii arii, final ahbt ahbt) {
        arii.q(ahbt);
    }
    
    private void q(final ahbt s) {
        this.c |= 0x80000;
        this.s = s;
    }
    
    private void r(final int g) {
        this.c |= 0x20;
        this.g = g;
    }
    
    private void s(final long i) {
        this.c |= 0x80;
        this.i = i;
    }
    
    private void t(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void u(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void v(final boolean b) {
        this.c |= 0x800000;
        this.x = true;
    }
    
    private void w(final ahbt m) {
        m.getClass();
        this.c |= 0x800;
        this.m = m;
    }
    
    private void x(final long r) {
        this.c |= 0x20000;
        this.r = r;
    }
    
    public int a() {
        return this.g;
    }
    
    public long d() {
        return this.d;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte z = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arii.b) == null) {
                    synchronized (arii.class) {
                        if (arii.b == null) {
                            arii.b = (ahev)new ahcs((ahcz)arii.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arii.a;
            }
            case 4: {
                return new arih();
            }
            case 3: {
                return new arii();
            }
            case 2: {
                return newMessageInfo((MessageLite)arii.a, "\u0001\b\u0000\u0001\u0001\u0019\b\u0000\u0000\u0000\u0001\u1002\u0000\u0006\u100a\u000b\u000b\u1004\u0005\f\u1002\u0007\u000f\u1010\u0011\u0011\u1002\u0001\u0012\u100a\u0013\u0019\u1007\u0017", new Object[] { "c", "d", "m", "g", "i", "r", "e", "s", "x" });
            }
            case 1: {
                if (o == null) {
                    z = 0;
                }
                this.z = z;
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
    
    public ahbt f() {
        return this.m;
    }
}
