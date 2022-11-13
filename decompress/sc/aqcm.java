import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcm extends ahbh implements ahcw
{
    public static final aqcm a;
    private static volatile ahdd d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcm.class, (ahbh)(a = new aqcm()));
    }
    
    private aqcm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqcm.d) == null) {
                    synchronized (aqcm.class) {
                        if (aqcm.d == null) {
                            aqcm.d = (ahdd)new ahba((ahbh)aqcm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcm.a);
            }
            case 3: {
                return new aqcm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
