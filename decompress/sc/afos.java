import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afos extends ahbh implements ahcw
{
    public static final afos a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)afos.class, (ahbh)(a = new afos()));
    }
    
    private afos() {
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
                if ((c = afos.c) == null) {
                    synchronized (afos.class) {
                        if (afos.c == null) {
                            afos.c = (ahdd)new ahba((ahbh)afos.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afos.a;
            }
            case 4: {
                return new ahaz((ahbh)afos.a);
            }
            case 3: {
                return new afos();
            }
            case 2: {
                return newMessageInfo((MessageLite)afos.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1008\u0000", new Object[] { "d", "b" });
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
