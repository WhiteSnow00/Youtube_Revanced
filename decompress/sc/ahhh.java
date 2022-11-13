import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhh extends ahbh implements ahcw
{
    private static final ahhh a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhh.class, (ahbh)(a = new ahhh()));
    }
    
    private ahhh() {
        this.h = "";
    }
    
    public static ahhg a() {
        return (ahhg)ahhh.a.createBuilder();
    }
    
    static ahhh b() {
        return ahhh.a;
    }
    
    public static void f(final ahhh ahhh, final ahhm ahhm) {
        ahhh.n(ahhm);
    }
    
    public static void g(final ahhh ahhh, final ahhj ahhj) {
        ahhh.l(ahhj);
    }
    
    public static void h(final ahhh ahhh, final String s) {
        ahhh.o(s);
    }
    
    public static void i(final ahhh ahhh, final ahhk ahhk) {
        ahhh.k(ahhk);
    }
    
    public static void j(final ahhh ahhh, final ahhl ahhl) {
        ahhh.m(ahhl);
    }
    
    private void k(final ahhk ahhk) {
        this.e = ahhk.u;
        this.c |= 0x2;
    }
    
    private void l(final ahhj ahhj) {
        this.g = ahhj.n;
        this.c |= 0x20;
    }
    
    private void m(final ahhl ahhl) {
        this.f = ahhl.e;
        this.c |= 0x8;
    }
    
    private void n(final ahhm ahhm) {
        this.d = ahhm.ae;
        this.c |= 0x1;
    }
    
    private void o(final String h) {
        h.getClass();
        this.c |= 0x40;
        this.h = h;
    }
    
    public ahhj c() {
        ahhj ahhj;
        if ((ahhj = ahhj.b(this.g)) == null) {
            ahhj = ahhj.a;
        }
        return ahhj;
    }
    
    public ahhk d() {
        ahhk ahhk;
        if ((ahhk = ahhk.b(this.e)) == null) {
            ahhk = ahhk.a;
        }
        return ahhk;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahhh.b) == null) {
                    synchronized (ahhh.class) {
                        if (ahhh.b == null) {
                            ahhh.b = (ahdd)new ahba((ahbh)ahhh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhh.a;
            }
            case 4: {
                return new ahhg();
            }
            case 3: {
                return new ahhh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhh.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u100c\u0003\u0006\u100c\u0005\u0007\u1008\u0006", new Object[] { "c", "d", ahhm.a(), "e", ahhk.a(), "f", ahhl.a(), "g", ahhj.a(), "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public ahhm e() {
        ahhm ahhm;
        if ((ahhm = ahhm.b(this.d)) == null) {
            ahhm = ahhm.a;
        }
        return ahhm;
    }
}
