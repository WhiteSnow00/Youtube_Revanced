import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageg extends ahbh implements ahcw
{
    public static final ageg a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ageg.class, (ahbh)(a = new ageg()));
    }
    
    private ageg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ageg.b) == null) {
                    synchronized (ageg.class) {
                        if (ageg.b == null) {
                            ageg.b = (ahdd)new ahba((ahbh)ageg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ageg.a;
            }
            case 4: {
                return new ahaz((ahbh)ageg.a);
            }
            case 3: {
                return new ageg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ageg.a, "\u0000\u0000", (Object[])null);
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
