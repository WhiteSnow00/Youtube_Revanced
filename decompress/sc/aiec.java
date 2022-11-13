import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiec extends ahbh implements ahcw
{
    private static final aiec a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aiec.class, (ahbh)(a = new aiec()));
    }
    
    private aiec() {
    }
    
    public static aiec a() {
        return aiec.a;
    }
    
    public static aiec b() {
        return aiec.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aiec.b) == null) {
                    synchronized (aiec.class) {
                        if (aiec.b == null) {
                            aiec.b = (ahdd)new ahba((ahbh)aiec.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiec.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aiec();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiec.a, "\u0001\u0000", (Object[])null);
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
