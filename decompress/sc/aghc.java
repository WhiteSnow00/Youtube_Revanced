import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghc extends ahbh implements ahcw
{
    private static final aghc a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private aghk e;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aghc.class, (ahbh)(a = new aghc()));
    }
    
    private aghc() {
        this.d = "";
    }
    
    public static aghb a() {
        return (aghb)aghc.a.createBuilder();
    }
    
    static aghc b() {
        return aghc.a;
    }
    
    public static aghc c() {
        return aghc.a;
    }
    
    public static void e(final aghc aghc, final String s) {
        aghc.h(s);
    }
    
    public static void f(final aghc aghc, final aghk aghk) {
        aghc.i(aghk);
    }
    
    public static void g(final aghc aghc, final int n) {
        aghc.j(n);
    }
    
    private void h(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void i(final aghk e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void j(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    public String d() {
        return this.d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aghc.b) == null) {
                    synchronized (aghc.class) {
                        if (aghc.b == null) {
                            aghc.b = (ahdd)new ahba((ahbh)aghc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghc.a;
            }
            case 4: {
                return new aghb();
            }
            case 3: {
                return new aghc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u100b\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
