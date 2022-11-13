import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anux extends ahbh implements ahcw
{
    public static final anux a;
    private static volatile ahdd d;
    public int b;
    public aqfa c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anux.class, (ahbh)(a = new anux()));
    }
    
    private anux() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anux.d) == null) {
                    synchronized (anux.class) {
                        if (anux.d == null) {
                            anux.d = (ahdd)new ahba((ahbh)anux.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anux.a;
            }
            case 4: {
                return new ahaz((ahbh)anux.a);
            }
            case 3: {
                return new anux();
            }
            case 2: {
                return newMessageInfo((MessageLite)anux.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
