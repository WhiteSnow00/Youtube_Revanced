import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajen extends ahbh implements ahcw
{
    public static final ajen a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajen.class, (ahbh)(a = new ajen()));
    }
    
    private ajen() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajen.b) == null) {
                    synchronized (ajen.class) {
                        if (ajen.b == null) {
                            ajen.b = (ahdd)new ahba((ahbh)ajen.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajen.a;
            }
            case 4: {
                return new ahaz((ahbh)ajen.a);
            }
            case 3: {
                return new ajen();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajen.a, "\u0001\u0000", (Object[])null);
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
