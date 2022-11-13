import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxi extends ahbh implements ahcw
{
    public static final anxi a;
    private static volatile ahdd d;
    public int b;
    public anxh c;
    
    static {
        ahbh.registerDefaultInstance((Class)anxi.class, (ahbh)(a = new anxi()));
    }
    
    private anxi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anxi.d) == null) {
                    synchronized (anxi.class) {
                        if (anxi.d == null) {
                            anxi.d = (ahdd)new ahba((ahbh)anxi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anxi.a;
            }
            case 4: {
                return new ahaz((ahbh)anxi.a);
            }
            case 3: {
                return new anxi();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxi.a, "\u0001\u0001\u0000\u0001\ufdf5\u3745\ufdf5\u3745\u0001\u0000\u0000\u0000\ufdf5\u3745\u1009\u0000", new Object[] { "b", "c" });
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
