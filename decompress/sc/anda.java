import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anda extends ahbh implements ahcw
{
    public static final anda a;
    private static volatile ahdd c;
    public float b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anda.class, (ahbh)(a = new anda()));
    }
    
    private anda() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anda.c) == null) {
                    synchronized (anda.class) {
                        if (anda.c == null) {
                            anda.c = (ahdd)new ahba((ahbh)anda.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anda.a;
            }
            case 4: {
                return new ahaz((ahbh)anda.a);
            }
            case 3: {
                return new anda();
            }
            case 2: {
                return newMessageInfo((MessageLite)anda.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "d", "b" });
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
