import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alop extends ahbh implements ahcw
{
    public static final alop a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alop.class, (ahbh)(a = new alop()));
    }
    
    private alop() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alop.b) == null) {
                    synchronized (alop.class) {
                        if (alop.b == null) {
                            alop.b = (ahdd)new ahba((ahbh)alop.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alop.a;
            }
            case 4: {
                return new ahaz((ahbh)alop.a);
            }
            case 3: {
                return new alop();
            }
            case 2: {
                return newMessageInfo((MessageLite)alop.a, "\u0001\u0000", (Object[])null);
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
