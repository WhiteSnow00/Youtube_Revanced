import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogm extends ahbh implements ahcw
{
    public static final aogm a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogm.class, (ahbh)(a = new aogm()));
    }
    
    private aogm() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aogm.d) == null) {
                    synchronized (aogm.class) {
                        if (aogm.d == null) {
                            aogm.d = (ahdd)new ahba((ahbh)aogm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogm.a;
            }
            case 4: {
                return new ahaz((ahbh)aogm.a);
            }
            case 3: {
                return new aogm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogm.a, "\u0001\u0001\u0001\u0000\uf26a\u2912\uf26a\u2912\u0001\u0000\u0000\u0001\uf26a\u2912\u143c\u0000", new Object[] { "c", "b", aljh.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
