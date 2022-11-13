import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkn extends ahbh implements ahcw
{
    public static final ahkn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkn.class, (ahbh)(a = new ahkn()));
    }
    
    private ahkn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahkn.b) == null) {
                    synchronized (ahkn.class) {
                        if (ahkn.b == null) {
                            ahkn.b = (ahdd)new ahba((ahbh)ahkn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahkn.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkn.a);
            }
            case 3: {
                return new ahkn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkn.a, "\u0001\u0000", (Object[])null);
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
