import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpp extends ahbh implements ahcw
{
    public static final agpp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpp.class, (ahbh)(a = new agpp()));
    }
    
    private agpp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agpp.b) == null) {
                    synchronized (agpp.class) {
                        if (agpp.b == null) {
                            agpp.b = (ahdd)new ahba((ahbh)agpp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agpp.a;
            }
            case 4: {
                return new ahaz((ahbh)agpp.a);
            }
            case 3: {
                return new agpp();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpp.a, "\u0000\u0000", (Object[])null);
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
