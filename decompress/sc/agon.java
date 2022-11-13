import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agon extends ahbh implements ahcw
{
    public static final agon a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)agon.class, (ahbh)(a = new agon()));
    }
    
    private agon() {
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
                if ((d = agon.d) == null) {
                    synchronized (agon.class) {
                        if (agon.d == null) {
                            agon.d = (ahdd)new ahba((ahbh)agon.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agon.a;
            }
            case 4: {
                return new ahaz((ahbh)agon.a);
            }
            case 3: {
                return new agon();
            }
            case 2: {
                return newMessageInfo((MessageLite)agon.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u1037\u0000\u0003\u103a\u0000", new Object[] { "c", "b" });
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
