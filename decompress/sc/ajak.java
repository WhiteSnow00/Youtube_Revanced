import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajak extends ahbh implements ahcw
{
    public static final ajak a;
    private static volatile ahdd c;
    public akmh b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajak.class, (ahbh)(a = new ajak()));
    }
    
    private ajak() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajak.c) == null) {
                    synchronized (ajak.class) {
                        if (ajak.c == null) {
                            ajak.c = (ahdd)new ahba((ahbh)ajak.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajak.a;
            }
            case 4: {
                return new ahaz((ahbh)ajak.a);
            }
            case 3: {
                return new ajak();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajak.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[] { "d", "b" });
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