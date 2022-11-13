import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajes extends ahbh implements ahcw
{
    public static final ajes a;
    private static volatile ahdd c;
    public int b;
    private Object d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajes.class, (ahbh)(a = new ajes()));
    }
    
    private ajes() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajes.c) == null) {
                    synchronized (ajes.class) {
                        if (ajes.c == null) {
                            ajes.c = (ahdd)new ahba((ahbh)ajes.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajes.a;
            }
            case 4: {
                return new ahaz((ahbh)ajes.a);
            }
            case 3: {
                return new ajes();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajes.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "d", "b", aoqa.class });
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
