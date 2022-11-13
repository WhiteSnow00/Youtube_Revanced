import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcl extends ahbh implements ahcw
{
    public static final alcl a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)alcl.class, (ahbh)(a = new alcl()));
    }
    
    private alcl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alcl.d) == null) {
                    synchronized (alcl.class) {
                        if (alcl.d == null) {
                            alcl.d = (ahdd)new ahba((ahbh)alcl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alcl.a;
            }
            case 4: {
                return new ahaz((ahbh)alcl.a);
            }
            case 3: {
                return new alcl();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
