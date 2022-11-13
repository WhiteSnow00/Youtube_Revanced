import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfq extends ahbh implements ahcw
{
    public static final anfq a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anfq.class, (ahbh)(a = new anfq()));
    }
    
    private anfq() {
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
                if ((c = anfq.c) == null) {
                    synchronized (anfq.class) {
                        if (anfq.c == null) {
                            anfq.c = (ahdd)new ahba((ahbh)anfq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anfq.a;
            }
            case 4: {
                return new ahaz((ahbh)anfq.a);
            }
            case 3: {
                return new anfq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
