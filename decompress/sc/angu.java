import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angu extends ahbh implements ahcw
{
    public static final angu a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)angu.class, (ahbh)(a = new angu()));
    }
    
    private angu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = angu.d) == null) {
                    synchronized (angu.class) {
                        if (angu.d == null) {
                            angu.d = (ahdd)new ahba((ahbh)angu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angu.a;
            }
            case 4: {
                return new ahaz((ahbh)angu.a);
            }
            case 3: {
                return new angu();
            }
            case 2: {
                return newMessageInfo((MessageLite)angu.a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005\u100b\u0006\u0006\u100b\u0007", new Object[] { "e", "b", "c" });
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
