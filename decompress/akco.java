import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akco extends ahbh implements ahcw
{
    private static final akco a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akco.class, (ahbh)(a = new akco()));
    }
    
    private akco() {
    }
    
    public static akco a() {
        return akco.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akco.b) == null) {
                    synchronized (akco.class) {
                        if (akco.b == null) {
                            akco.b = (ahdd)new ahba((ahbh)akco.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akco.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new akco();
            }
            case 2: {
                return newMessageInfo((MessageLite)akco.a, "\u0001\u0000", (Object[])null);
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
