import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apue extends ahbh implements ahcw
{
    public static final apue a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)apue.class, (ahbh)(a = new apue()));
    }
    
    private apue() {
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
                if ((c = apue.c) == null) {
                    synchronized (apue.class) {
                        if (apue.c == null) {
                            apue.c = (ahdd)new ahba((ahbh)apue.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apue.a;
            }
            case 4: {
                return new ahaz((ahbh)apue.a);
            }
            case 3: {
                return new apue();
            }
            case 2: {
                return newMessageInfo((MessageLite)apue.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
