import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbj extends ahbh implements ahcw
{
    public static final arbj a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)arbj.class, (ahbh)(a = new arbj()));
    }
    
    private arbj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = arbj.e) == null) {
                    synchronized (arbj.class) {
                        if (arbj.e == null) {
                            arbj.e = (ahdd)new ahba((ahbh)arbj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arbj.a;
            }
            case 4: {
                return new ahaz((ahbh)arbj.a);
            }
            case 3: {
                return new arbj();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
