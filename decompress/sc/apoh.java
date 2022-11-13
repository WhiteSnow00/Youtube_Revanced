import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoh extends ahbh implements ahcw
{
    public static final apoh a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)apoh.class, (ahbh)(a = new apoh()));
    }
    
    private apoh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apoh.c) == null) {
                    synchronized (apoh.class) {
                        if (apoh.c == null) {
                            apoh.c = (ahdd)new ahba((ahbh)apoh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apoh.a;
            }
            case 4: {
                return new ahaz((ahbh)apoh.a);
            }
            case 3: {
                return new apoh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aplg.p });
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
