import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alom extends ahbh implements ahcw
{
    public static final alom a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alom.class, (ahbh)(a = new alom()));
    }
    
    private alom() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alom.b) == null) {
                    synchronized (alom.class) {
                        if (alom.b == null) {
                            alom.b = (ahdd)new ahba((ahbh)alom.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alom.a;
            }
            case 4: {
                return new ahaz((ahbh)alom.a);
            }
            case 3: {
                return new alom();
            }
            case 2: {
                return newMessageInfo((MessageLite)alom.a, "\u0001\u0000", (Object[])null);
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
