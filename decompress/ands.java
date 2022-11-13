import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ands extends ahbh implements ahcw
{
    public static final ands a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ands.class, (ahbh)(a = new ands()));
    }
    
    private ands() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ands.b) == null) {
                    synchronized (ands.class) {
                        if (ands.b == null) {
                            ands.b = (ahdd)new ahba((ahbh)ands.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ands.a;
            }
            case 4: {
                return new ahaz((ahbh)ands.a);
            }
            case 3: {
                return new ands();
            }
            case 2: {
                return newMessageInfo((MessageLite)ands.a, "\u0001\u0000", (Object[])null);
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
