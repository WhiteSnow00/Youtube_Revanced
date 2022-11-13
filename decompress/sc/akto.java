import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akto extends ahbh implements ahcw
{
    public static final akto a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)akto.class, (ahbh)(a = new akto()));
    }
    
    private akto() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akto.d) == null) {
                    synchronized (akto.class) {
                        if (akto.d == null) {
                            akto.d = (ahdd)new ahba((ahbh)akto.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akto.a;
            }
            case 4: {
                return new ahaz((ahbh)akto.a);
            }
            case 3: {
                return new akto();
            }
            case 2: {
                return newMessageInfo((MessageLite)akto.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
