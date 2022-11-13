import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arap extends ahbh implements ahcw
{
    private static final arap a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private float e;
    
    static {
        ahbh.registerDefaultInstance((Class)arap.class, (ahbh)(a = new arap()));
    }
    
    private arap() {
        this.d = "";
    }
    
    public static arao a() {
        return (arao)arap.a.createBuilder();
    }
    
    static arap b() {
        return arap.a;
    }
    
    public static void c(final arap arap, final String s) {
        arap.e(s);
    }
    
    public static void d(final arap arap, final float n) {
        arap.f(n);
    }
    
    private void e(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final float e) {
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
                if ((b = arap.b) == null) {
                    synchronized (arap.class) {
                        if (arap.b == null) {
                            arap.b = (ahdd)new ahba((ahbh)arap.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arap.a;
            }
            case 4: {
                return new arao();
            }
            case 3: {
                return new arap();
            }
            case 2: {
                return newMessageInfo((MessageLite)arap.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "c", "d", "e" });
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
