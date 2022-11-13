import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoje extends ahbh implements ahcw
{
    public static final aoje a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoje.class, (ahbh)(a = new aoje()));
    }
    
    private aoje() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoje.b) == null) {
                    synchronized (aoje.class) {
                        if (aoje.b == null) {
                            aoje.b = (ahdd)new ahba((ahbh)aoje.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoje.a;
            }
            case 4: {
                return new ahaz((ahbh)aoje.a);
            }
            case 3: {
                return new aoje();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoje.a, "\u0001\u0000", (Object[])null);
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
