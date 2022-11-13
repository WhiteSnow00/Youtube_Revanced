import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxs extends ahbh implements ahcw
{
    public static final ajxs a;
    private static volatile ahdd d;
    public int b;
    public anwq c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxs.class, (ahbh)(a = new ajxs()));
    }
    
    private ajxs() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajxs.d) == null) {
                    synchronized (ajxs.class) {
                        if (ajxs.d == null) {
                            ajxs.d = (ahdd)new ahba((ahbh)ajxs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxs.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxs.a);
            }
            case 3: {
                return new ajxs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
