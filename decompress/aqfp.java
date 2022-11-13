import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfp extends ahbh implements ahcw
{
    public static final aqfp a;
    private static volatile ahdd g;
    public int b;
    public aqfq c;
    public aqfq d;
    public aqfq e;
    public aqfq f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfp.class, (ahbh)(a = new aqfp()));
    }
    
    private aqfp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqfp.g) == null) {
                    synchronized (aqfp.class) {
                        if (aqfp.g == null) {
                            aqfp.g = (ahdd)new ahba((ahbh)aqfp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqfp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfp.a);
            }
            case 3: {
                return new aqfp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
