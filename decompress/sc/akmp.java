import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmp extends ahbh implements ahcw
{
    public static final akmp a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)akmp.class, (ahbh)(a = new akmp()));
    }
    
    private akmp() {
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
                if ((d = akmp.d) == null) {
                    synchronized (akmp.class) {
                        if (akmp.d == null) {
                            akmp.d = (ahdd)new ahba((ahbh)akmp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmp.a;
            }
            case 4: {
                return new ahaz((ahbh)akmp.a);
            }
            case 3: {
                return new akmp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
