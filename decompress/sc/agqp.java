import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqp extends ahbh implements ahcw
{
    public static final agqp a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)agqp.class, (ahbh)(a = new agqp()));
    }
    
    private agqp() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = agqp.g) == null) {
                    synchronized (agqp.class) {
                        if (agqp.g == null) {
                            agqp.g = (ahdd)new ahba((ahbh)agqp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agqp.a;
            }
            case 4: {
                return new ahaz((ahbh)agqp.a);
            }
            case 3: {
                return new agqp();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "b", "c", afqo.f, "d", afqo.e, "e", "f", aqls.s });
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
