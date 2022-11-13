import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxf extends ahbh implements ahcw
{
    public static final aoxf a;
    private static volatile ahdd e;
    public int b;
    public float c;
    public float d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxf.class, (ahbh)(a = new aoxf()));
    }
    
    private aoxf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aoxf.e) == null) {
                    synchronized (aoxf.class) {
                        if (aoxf.e == null) {
                            aoxf.e = (ahdd)new ahba((ahbh)aoxf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoxf.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxf.a);
            }
            case 3: {
                return new aoxf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "f", "b", "c", "d" });
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
