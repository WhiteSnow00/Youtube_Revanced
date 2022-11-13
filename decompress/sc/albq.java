import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albq extends ahbh implements ahcw
{
    public static final albq a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)albq.class, (ahbh)(a = new albq()));
    }
    
    private albq() {
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
                if ((d = albq.d) == null) {
                    synchronized (albq.class) {
                        if (albq.d == null) {
                            albq.d = (ahdd)new ahba((ahbh)albq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albq.a;
            }
            case 4: {
                return new ahaz((ahbh)albq.a);
            }
            case 3: {
                return new albq();
            }
            case 2: {
                return newMessageInfo((MessageLite)albq.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000", new Object[] { "c", "b", albp.class });
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
