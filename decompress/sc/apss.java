import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apss extends ahbh implements ahcw
{
    public static final apss a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)apss.class, (ahbh)(a = new apss()));
    }
    
    private apss() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apss.c) == null) {
                    synchronized (apss.class) {
                        if (apss.c == null) {
                            apss.c = (ahdd)new ahba((ahbh)apss.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apss.a;
            }
            case 4: {
                return new ahaz((ahbh)apss.a);
            }
            case 3: {
                return new apss();
            }
            case 2: {
                return newMessageInfo((MessageLite)apss.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apow.t });
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
