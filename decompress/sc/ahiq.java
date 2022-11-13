import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiq extends ahbh implements ahcw
{
    public static final ahiq a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahiq.class, (ahbh)(a = new ahiq()));
    }
    
    private ahiq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ahiq.g) == null) {
                    synchronized (ahiq.class) {
                        if (ahiq.g == null) {
                            ahiq.g = (ahdd)new ahba((ahbh)ahiq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahiq.a;
            }
            case 4: {
                return new ahaz((ahbh)ahiq.a);
            }
            case 3: {
                return new ahiq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiq.a, "\u0001\u0004\u0000\u0001\u0006\r\u0004\u0000\u0000\u0000\u0006\u1004\u0004\n\u1007\u0007\u000b\u1007\b\r\u1007\n", new Object[] { "b", "c", "d", "e", "f" });
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
