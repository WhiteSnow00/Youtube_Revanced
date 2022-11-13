import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbf extends ahbh implements ahcw
{
    public static final arbf a;
    private static volatile ahdd g;
    public int b;
    public aitg c;
    public int d;
    public int e;
    public ahfu f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)arbf.class, (ahbh)(a = new arbf()));
    }
    
    private arbf() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = arbf.g) == null) {
                    synchronized (arbf.class) {
                        if (arbf.g == null) {
                            arbf.g = (ahdd)new ahba((ahbh)arbf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arbf.a;
            }
            case 4: {
                return new ahaz((ahbh)arbf.a);
            }
            case 3: {
                return new arbf();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
