import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqt extends ahbh implements ahcw
{
    public static final afqt a;
    private static volatile ahdd e;
    public int b;
    public float c;
    public float d;
    
    static {
        ahbh.registerDefaultInstance((Class)afqt.class, (ahbh)(a = new afqt()));
    }
    
    private afqt() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = afqt.e) == null) {
                    synchronized (afqt.class) {
                        if (afqt.e == null) {
                            afqt.e = (ahdd)new ahba((ahbh)afqt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afqt.a;
            }
            case 4: {
                return new ahaz((ahbh)afqt.a);
            }
            case 3: {
                return new afqt();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
