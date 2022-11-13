import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpf extends ahbh implements ahcw
{
    public static final alpf a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)alpf.class, (ahbh)(a = new alpf()));
    }
    
    private alpf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = alpf.c) == null) {
                    synchronized (alpf.class) {
                        if (alpf.c == null) {
                            alpf.c = (ahdd)new ahba((ahbh)alpf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alpf.a;
            }
            case 4: {
                return new ahaz((ahbh)alpf.a);
            }
            case 3: {
                return new alpf();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
