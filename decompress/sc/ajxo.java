import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxo extends ahbh implements ahcw
{
    public static final ajxo a;
    private static volatile ahdd d;
    public double b;
    public double c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxo.class, (ahbh)(a = new ajxo()));
    }
    
    private ajxo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajxo.d) == null) {
                    synchronized (ajxo.class) {
                        if (ajxo.d == null) {
                            ajxo.d = (ahdd)new ahba((ahbh)ajxo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxo.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxo.a);
            }
            case 3: {
                return new ajxo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001", new Object[] { "e", "b", "c" });
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
