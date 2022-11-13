import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annn extends ahbh implements ahcw
{
    public static final annn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)annn.class, (ahbh)(a = new annn()));
    }
    
    private annn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annn.b) == null) {
                    synchronized (annn.class) {
                        if (annn.b == null) {
                            annn.b = (ahdd)new ahba((ahbh)annn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annn.a;
            }
            case 4: {
                return new ahaz((ahbh)annn.a);
            }
            case 3: {
                return new annn();
            }
            case 2: {
                return newMessageInfo((MessageLite)annn.a, "\u0000\u0000", (Object[])null);
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
