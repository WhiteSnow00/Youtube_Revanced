import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgl extends ahbh implements ahcw
{
    public static final akgl a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgl.class, (ahbh)(a = new akgl()));
    }
    
    private akgl() {
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
                if ((d = akgl.d) == null) {
                    synchronized (akgl.class) {
                        if (akgl.d == null) {
                            akgl.d = (ahdd)new ahba((ahbh)akgl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgl.a;
            }
            case 4: {
                return new ahaz((ahbh)akgl.a);
            }
            case 3: {
                return new akgl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgl.a, "\u0001\u0003\u0001\u0000\uf345\u3751\ue98b\u5d65\u0003\u0000\u0000\u0003\uf345\u3751\u143c\u0000\ufa04\u51de\u143c\u0000\ue98b\u5d65\u143c\u0000", new Object[] { "c", "b", akgh.class, akgg.class, ajrf.class });
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
