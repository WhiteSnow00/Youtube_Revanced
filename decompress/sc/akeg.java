import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akeg extends ahbh implements ahcw
{
    public static final akeg a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akeg.class, (ahbh)(a = new akeg()));
    }
    
    private akeg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akeg.c) == null) {
                    synchronized (akeg.class) {
                        if (akeg.c == null) {
                            akeg.c = (ahdd)new ahba((ahbh)akeg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akeg.a;
            }
            case 4: {
                return new ahaz((ahbh)akeg.a);
            }
            case 3: {
                return new akeg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akeg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akeh.a });
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
