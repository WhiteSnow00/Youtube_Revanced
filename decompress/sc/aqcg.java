import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcg extends ahbh implements ahcw
{
    public static final aqcg a;
    private static volatile ahdd d;
    public int b;
    public float c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcg.class, (ahbh)(a = new aqcg()));
    }
    
    private aqcg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqcg.d) == null) {
                    synchronized (aqcg.class) {
                        if (aqcg.d == null) {
                            aqcg.d = (ahdd)new ahba((ahbh)aqcg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcg.a);
            }
            case 3: {
                return new aqcg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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
