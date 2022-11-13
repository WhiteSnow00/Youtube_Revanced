import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwy extends ahbh implements ahcw
{
    private static final anwy a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    private boolean e;
    private String f;
    
    static {
        ahbh.registerDefaultInstance((Class)anwy.class, (ahbh)(a = new anwy()));
    }
    
    private anwy() {
        this.f = "";
    }
    
    public static anwx a() {
        return (anwx)anwy.a.createBuilder();
    }
    
    static anwy b() {
        return anwy.a;
    }
    
    public static void c(final anwy anwy, final boolean b) {
        anwy.g(true);
    }
    
    public static void d(final anwy anwy, final boolean b) {
        anwy.h(b);
    }
    
    public static void e(final anwy anwy, final String s) {
        anwy.f(s);
    }
    
    private void f(final String f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void g(final boolean b) {
        this.c |= 0x1;
        this.d = true;
    }
    
    private void h(final boolean e) {
        this.c |= 0x2;
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
                if ((b = anwy.b) == null) {
                    synchronized (anwy.class) {
                        if (anwy.b == null) {
                            anwy.b = (ahdd)new ahba((ahbh)anwy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anwy.a;
            }
            case 4: {
                return new anwx();
            }
            case 3: {
                return new anwy();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
