import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albt extends ahbh implements ahcw
{
    public static final albt a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)albt.class, (ahbh)(a = new albt()));
    }
    
    private albt() {
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
                if ((d = albt.d) == null) {
                    synchronized (albt.class) {
                        if (albt.d == null) {
                            albt.d = (ahdd)new ahba((ahbh)albt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albt.a;
            }
            case 4: {
                return new ahaz((ahbh)albt.a);
            }
            case 3: {
                return new albt();
            }
            case 2: {
                return newMessageInfo((MessageLite)albt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
