import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albp extends ahbh implements ahcw
{
    public static final albp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)albp.class, (ahbh)(a = new albp()));
    }
    
    private albp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = albp.b) == null) {
                    synchronized (albp.class) {
                        if (albp.b == null) {
                            albp.b = (ahdd)new ahba((ahbh)albp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return albp.a;
            }
            case 4: {
                return new ahaz((ahbh)albp.a);
            }
            case 3: {
                return new albp();
            }
            case 2: {
                return newMessageInfo((MessageLite)albp.a, "\u0001\u0000", (Object[])null);
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
