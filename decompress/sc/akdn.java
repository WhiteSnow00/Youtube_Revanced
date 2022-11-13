import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdn extends ahbh implements ahcw
{
    public static final akdn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akdn.class, (ahbh)(a = new akdn()));
    }
    
    private akdn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akdn.b) == null) {
                    synchronized (akdn.class) {
                        if (akdn.b == null) {
                            akdn.b = (ahdd)new ahba((ahbh)akdn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdn.a;
            }
            case 4: {
                return new ahaz((ahbh)akdn.a);
            }
            case 3: {
                return new akdn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdn.a, "\u0001\u0000", (Object[])null);
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
