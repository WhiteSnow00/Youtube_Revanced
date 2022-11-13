import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuo extends ahbh implements ahcw
{
    public static final anuo a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anuo.class, (ahbh)(a = new anuo()));
    }
    
    private anuo() {
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
                if ((c = anuo.c) == null) {
                    synchronized (anuo.class) {
                        if (anuo.c == null) {
                            anuo.c = (ahdd)new ahba((ahbh)anuo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anuo.a;
            }
            case 4: {
                return new ahaz((ahbh)anuo.a);
            }
            case 3: {
                return new anuo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
