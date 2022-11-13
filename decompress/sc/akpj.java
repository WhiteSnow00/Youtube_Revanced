import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpj extends ahbh implements ahcw
{
    public static final akpj a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akpj.class, (ahbh)(a = new akpj()));
    }
    
    private akpj() {
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
                if ((d = akpj.d) == null) {
                    synchronized (akpj.class) {
                        if (akpj.d == null) {
                            akpj.d = (ahdd)new ahba((ahbh)akpj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpj.a;
            }
            case 4: {
                return new ahaz((ahbh)akpj.a);
            }
            case 3: {
                return new akpj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpj.a, "\u0001\u0001\u0001\u0000\ue315\u1baf\ue315\u1baf\u0001\u0000\u0000\u0001\ue315\u1baf\u143c\u0000", new Object[] { "c", "b", ahrc.class });
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
