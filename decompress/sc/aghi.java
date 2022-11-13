import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghi extends ahbh implements ahcw
{
    private static final aghi a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private Object e;
    private int f;
    private String g;
    
    static {
        ahbh.registerDefaultInstance((Class)aghi.class, (ahbh)(a = new aghi()));
    }
    
    private aghi() {
        this.d = 0;
        this.g = "";
    }
    
    public static aghh a() {
        return (aghh)aghi.a.createBuilder();
    }
    
    static aghi b() {
        return aghi.a;
    }
    
    public static void c(final aghi aghi, final String s) {
        aghi.h(s);
    }
    
    public static void d(final aghi aghi, final aghe aghe) {
        aghi.g(aghe);
    }
    
    public static void e(final aghi aghi, final aghd aghd) {
        aghi.f(aghd);
    }
    
    private void f(final aghd aghd) {
        this.f = aghd.f;
        this.c |= 0x4;
    }
    
    private void g(final aghe e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void h(final String e) {
        e.getClass();
        this.d = 1;
        this.e = e;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aghi.b) == null) {
                    synchronized (aghi.class) {
                        if (aghi.b == null) {
                            aghi.b = (ahdd)new ahba((ahbh)aghi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghi.a;
            }
            case 4: {
                return new aghh();
            }
            case 3: {
                return new aghi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghi.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000\u0003\u100c\u0002", new Object[] { "e", "d", "c", aghe.class, "f", aghd.b() });
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
