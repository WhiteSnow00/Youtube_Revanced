import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkl extends ahbh implements ahcw
{
    public static final amkl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)amkl.class, (ahbh)(a = new amkl()));
    }
    
    private amkl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amkl.b) == null) {
                    synchronized (amkl.class) {
                        if (amkl.b == null) {
                            amkl.b = (ahdd)new ahba((ahbh)amkl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkl.a;
            }
            case 4: {
                return new ahaz((ahbh)amkl.a);
            }
            case 3: {
                return new amkl();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkl.a, "\u0001\u0000", (Object[])null);
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