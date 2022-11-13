import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araz extends ahbh implements ahcw
{
    public static final araz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)araz.class, (ahbh)(a = new araz()));
    }
    
    private araz() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = araz.d) == null) {
                    synchronized (araz.class) {
                        if (araz.d == null) {
                            araz.d = (ahdd)new ahba((ahbh)araz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return araz.a;
            }
            case 4: {
                return new ahaz((ahbh)araz.a);
            }
            case 3: {
                return new araz();
            }
            case 2: {
                return newMessageInfo((MessageLite)araz.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u103f\u0000", new Object[] { "c", "b", aqvs.t, aqvs.u });
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
