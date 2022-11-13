import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqn extends ahbh implements ahcw
{
    public static final alqn a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)alqn.class, (ahbh)(a = new alqn()));
    }
    
    private alqn() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alqn.d) == null) {
                    synchronized (alqn.class) {
                        if (alqn.d == null) {
                            alqn.d = (ahdd)new ahba((ahbh)alqn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqn.a;
            }
            case 4: {
                return new ahaz((ahbh)alqn.a);
            }
            case 3: {
                return new alqn();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
