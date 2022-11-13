import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alot extends ahbh implements ahcw
{
    public static final alot a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alot.class, (ahbh)(a = new alot()));
    }
    
    private alot() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alot.b) == null) {
                    synchronized (alot.class) {
                        if (alot.b == null) {
                            alot.b = (ahdd)new ahba((ahbh)alot.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alot.a;
            }
            case 4: {
                return new ahaz((ahbh)alot.a);
            }
            case 3: {
                return new alot();
            }
            case 2: {
                return newMessageInfo((MessageLite)alot.a, "\u0001\u0000", (Object[])null);
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
