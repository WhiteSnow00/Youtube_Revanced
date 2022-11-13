import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anha extends ahbh implements ahcw
{
    public static final anha a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anha.class, (ahbh)(a = new anha()));
    }
    
    private anha() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anha.b) == null) {
                    synchronized (anha.class) {
                        if (anha.b == null) {
                            anha.b = (ahdd)new ahba((ahbh)anha.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anha.a;
            }
            case 4: {
                return new ahaz((ahbh)anha.a);
            }
            case 3: {
                return new anha();
            }
            case 2: {
                return newMessageInfo((MessageLite)anha.a, "\u0001\u0000", (Object[])null);
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
