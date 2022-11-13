import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknd extends ahbh implements ahcw
{
    public static final aknd a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aknd.class, (ahbh)(a = new aknd()));
    }
    
    private aknd() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aknd.c) == null) {
                    synchronized (aknd.class) {
                        if (aknd.c == null) {
                            aknd.c = (ahdd)new ahba((ahbh)aknd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aknd.a;
            }
            case 4: {
                return new ahaz((ahbh)aknd.a);
            }
            case 3: {
                return new aknd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknd.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
