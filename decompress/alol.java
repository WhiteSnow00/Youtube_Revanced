import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alol extends ahbh implements ahcw
{
    public static final alol a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alol.class, (ahbh)(a = new alol()));
    }
    
    private alol() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alol.b) == null) {
                    synchronized (alol.class) {
                        if (alol.b == null) {
                            alol.b = (ahdd)new ahba((ahbh)alol.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alol.a;
            }
            case 4: {
                return new ahaz((ahbh)alol.a);
            }
            case 3: {
                return new alol();
            }
            case 2: {
                return newMessageInfo((MessageLite)alol.a, "\u0001\u0000", (Object[])null);
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
