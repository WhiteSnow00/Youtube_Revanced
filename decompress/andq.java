import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andq extends ahbh implements ahcw
{
    public static final andq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)andq.class, (ahbh)(a = new andq()));
    }
    
    private andq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = andq.b) == null) {
                    synchronized (andq.class) {
                        if (andq.b == null) {
                            andq.b = (ahdd)new ahba((ahbh)andq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andq.a;
            }
            case 4: {
                return new ahaz((ahbh)andq.a);
            }
            case 3: {
                return new andq();
            }
            case 2: {
                return newMessageInfo((MessageLite)andq.a, "\u0001\u0000", (Object[])null);
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
