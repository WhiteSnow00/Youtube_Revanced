import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqw extends ahbh implements ahcw
{
    public static final agqw a;
    private static volatile ahdd c;
    public agqo b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqw.class, (ahbh)(a = new agqw()));
    }
    
    private agqw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agqw.c) == null) {
                    synchronized (agqw.class) {
                        if (agqw.c == null) {
                            agqw.c = (ahdd)new ahba((ahbh)agqw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqw.a;
            }
            case 4: {
                return new ahaz((ahbh)agqw.a);
            }
            case 3: {
                return new agqw();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
