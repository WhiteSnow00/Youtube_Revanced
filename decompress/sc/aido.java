import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aido extends ahbh implements ahcw
{
    public static final aido a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aido.class, (ahbh)(a = new aido()));
    }
    
    private aido() {
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
                if ((d = aido.d) == null) {
                    synchronized (aido.class) {
                        if (aido.d == null) {
                            aido.d = (ahdd)new ahba((ahbh)aido.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aido.a;
            }
            case 4: {
                return new ahaz((ahbh)aido.a);
            }
            case 3: {
                return new aido();
            }
            case 2: {
                return newMessageInfo((MessageLite)aido.a, "\u0001\u0002\u0001\u0000\uec16\u387f\uf20f\u3e81\u0002\u0000\u0000\u0000\uec16\u387f\u103c\u0000\uf20f\u3e81\u103c\u0000", new Object[] { "c", "b", aibe.class, alnx.class });
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
