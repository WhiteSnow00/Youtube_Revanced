import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqli extends ahbh implements ahcw
{
    public static final aqli a;
    private static volatile ahdd g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqli.class, (ahbh)(a = new aqli()));
    }
    
    private aqli() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqli.g) == null) {
                    synchronized (aqli.class) {
                        if (aqli.g == null) {
                            aqli.g = (ahdd)new ahba((ahbh)aqli.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqli.a;
            }
            case 4: {
                return new ahaz((ahbh)aqli.a);
            }
            case 3: {
                return new aqli();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqli.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u1001\u0000\u0003\u1001\u0001\u0004\u1001\u0002\u0005\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
