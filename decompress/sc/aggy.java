import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggy extends ahbh implements ahcw
{
    public static final aggy a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aggy.class, (ahbh)(a = new aggy()));
    }
    
    private aggy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aggy.b) == null) {
                    synchronized (aggy.class) {
                        if (aggy.b == null) {
                            aggy.b = (ahdd)new ahba((ahbh)aggy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aggy.a;
            }
            case 4: {
                return new ahaz((ahbh)aggy.a);
            }
            case 3: {
                return new aggy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aggy.a, "\u0001\u0000", (Object[])null);
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
