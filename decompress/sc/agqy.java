import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqy extends ahbh implements ahcw
{
    public static final agqy a;
    private static volatile ahdd c;
    public agrb b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqy.class, (ahbh)(a = new agqy()));
    }
    
    private agqy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agqy.c) == null) {
                    synchronized (agqy.class) {
                        if (agqy.c == null) {
                            agqy.c = (ahdd)new ahba((ahbh)agqy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqy.a;
            }
            case 4: {
                return new ahaz((ahbh)agqy.a);
            }
            case 3: {
                return new agqy();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
