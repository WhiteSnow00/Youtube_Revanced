import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbo extends ahbh implements ahcw
{
    public static final anbo a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anbo.class, (ahbh)(a = new anbo()));
    }
    
    private anbo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anbo.c) == null) {
                    synchronized (anbo.class) {
                        if (anbo.c == null) {
                            anbo.c = (ahdd)new ahba((ahbh)anbo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anbo.a;
            }
            case 4: {
                return new ahaz((ahbh)anbo.a);
            }
            case 3: {
                return new anbo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amvu.r });
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
