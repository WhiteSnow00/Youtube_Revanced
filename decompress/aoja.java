import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoja extends ahbh implements ahcw
{
    public static final aoja a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoja.class, (ahbh)(a = new aoja()));
    }
    
    private aoja() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoja.b) == null) {
                    synchronized (aoja.class) {
                        if (aoja.b == null) {
                            aoja.b = (ahdd)new ahba((ahbh)aoja.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoja.a;
            }
            case 4: {
                return new ahaz((ahbh)aoja.a);
            }
            case 3: {
                return new aoja();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoja.a, "\u0001\u0000", (Object[])null);
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
