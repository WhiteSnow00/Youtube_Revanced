import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsh extends ahbh implements ahcw
{
    public static final apsh a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)apsh.class, (ahbh)(a = new apsh()));
    }
    
    private apsh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apsh.c) == null) {
                    synchronized (apsh.class) {
                        if (apsh.c == null) {
                            apsh.c = (ahdd)new ahba((ahbh)apsh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsh.a;
            }
            case 4: {
                return new ahaz((ahbh)apsh.a);
            }
            case 3: {
                return new apsh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", airy.m });
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
