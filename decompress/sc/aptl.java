import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptl extends ahbh implements ahcw
{
    public static final aptl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptl.class, (ahbh)(a = new aptl()));
    }
    
    private aptl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptl.b) == null) {
                    synchronized (aptl.class) {
                        if (aptl.b == null) {
                            aptl.b = (ahdd)new ahba((ahbh)aptl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptl.a;
            }
            case 4: {
                return new ahaz((ahbh)aptl.a);
            }
            case 3: {
                return new aptl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptl.a, "\u0001\u0000", (Object[])null);
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
