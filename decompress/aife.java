import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aife extends ahbh implements ahcw
{
    public static final aife a;
    private static volatile ahdd f;
    public float b;
    public float c;
    public float d;
    public float e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)aife.class, (ahbh)(a = new aife()));
    }
    
    private aife() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aife.f) == null) {
                    synchronized (aife.class) {
                        if (aife.f == null) {
                            aife.f = (ahdd)new ahba((ahbh)aife.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aife.a;
            }
            case 4: {
                return new ahaz((ahbh)aife.a);
            }
            case 3: {
                return new aife();
            }
            case 2: {
                return newMessageInfo((MessageLite)aife.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
