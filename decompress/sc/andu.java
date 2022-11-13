import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class andu extends ahbh implements ahcw
{
    public static final andu a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)andu.class, (ahbh)(a = new andu()));
    }
    
    private andu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = andu.b) == null) {
                    synchronized (andu.class) {
                        if (andu.b == null) {
                            andu.b = (ahdd)new ahba((ahbh)andu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andu.a;
            }
            case 4: {
                return new ahaz((ahbh)andu.a);
            }
            case 3: {
                return new andu();
            }
            case 2: {
                return newMessageInfo((MessageLite)andu.a, "\u0001\u0000", (Object[])null);
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
