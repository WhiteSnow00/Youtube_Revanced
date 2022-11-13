import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alch extends ahbh implements ahcw
{
    public static final alch a;
    private static volatile ahdd c;
    public aoua b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)alch.class, (ahbh)(a = new alch()));
    }
    
    private alch() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = alch.c) == null) {
                    synchronized (alch.class) {
                        if (alch.c == null) {
                            alch.c = (ahdd)new ahba((ahbh)alch.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alch.a;
            }
            case 4: {
                return new ahaz((ahbh)alch.a);
            }
            case 3: {
                return new alch();
            }
            case 2: {
                return newMessageInfo((MessageLite)alch.a, "\u0001\u0001\u0000\u0001\uec98\u218a\uec98\u218a\u0001\u0000\u0000\u0000\uec98\u218a\u1009\u0000", new Object[] { "d", "b" });
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
