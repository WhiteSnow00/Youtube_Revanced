import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcm extends ahbh implements ahcw
{
    public static final alcm a;
    private static volatile ahdd e;
    public int b;
    public aktx c;
    public alcl d;
    
    static {
        ahbh.registerDefaultInstance((Class)alcm.class, (ahbh)(a = new alcm()));
    }
    
    private alcm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = alcm.e) == null) {
                    synchronized (alcm.class) {
                        if (alcm.e == null) {
                            alcm.e = (ahdd)new ahba((ahbh)alcm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alcm.a;
            }
            case 4: {
                return new ahaz((ahbh)alcm.a);
            }
            case 3: {
                return new alcm();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcm.a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003\u1009\u0002\u0006\u1009\u0005", new Object[] { "b", "c", "d" });
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
