import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxo extends ahbh implements ahcw
{
    private static final aoxo a;
    private static volatile ahdd b;
    private int c;
    private Object d;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxo.class, (ahbh)(a = new aoxo()));
    }
    
    private aoxo() {
        this.c = 0;
    }
    
    public static aoxo c() {
        return aoxo.a;
    }
    
    public static aoxo d() {
        return aoxo.a;
    }
    
    public anwk a() {
        if (this.c == 2) {
            return (anwk)this.d;
        }
        return anwk.a;
    }
    
    public aoxn b() {
        return aoxn.a(this.c);
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoxo.b) == null) {
                    synchronized (aoxo.class) {
                        if (aoxo.b == null) {
                            aoxo.b = (ahdd)new ahba((ahbh)aoxo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxo.a;
            }
            case 4: {
                return new ahaz((ahbh)c());
            }
            case 3: {
                return new aoxo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxo.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "d", "c", aoxm.class, anwk.class });
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
