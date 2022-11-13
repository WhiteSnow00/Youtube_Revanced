import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloo extends ahbh implements ahcw
{
    public static final aloo a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aloo.class, (ahbh)(a = new aloo()));
    }
    
    private aloo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aloo.b) == null) {
                    synchronized (aloo.class) {
                        if (aloo.b == null) {
                            aloo.b = (ahdd)new ahba((ahbh)aloo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aloo.a;
            }
            case 4: {
                return new ahaz((ahbh)aloo.a);
            }
            case 3: {
                return new aloo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aloo.a, "\u0001\u0000", (Object[])null);
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
