import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvy extends ahbh implements ahcw
{
    public static final anvy a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anvy.class, (ahbh)(a = new anvy()));
    }
    
    private anvy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anvy.c) == null) {
                    synchronized (anvy.class) {
                        if (anvy.c == null) {
                            anvy.c = (ahdd)new ahba((ahbh)anvy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anvy.a;
            }
            case 4: {
                return new ahaz((ahbh)anvy.a);
            }
            case 3: {
                return new anvy();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ansm.s });
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
