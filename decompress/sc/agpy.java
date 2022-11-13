import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpy extends ahbh implements ahcw
{
    public static final agpy a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpy.class, (ahbh)(a = new agpy()));
    }
    
    private agpy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agpy.b) == null) {
                    synchronized (agpy.class) {
                        if (agpy.b == null) {
                            agpy.b = (ahdd)new ahba((ahbh)agpy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agpy.a;
            }
            case 4: {
                return new ahaz((ahbh)agpy.a);
            }
            case 3: {
                return new agpy();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpy.a, "\u0000\u0000", (Object[])null);
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
