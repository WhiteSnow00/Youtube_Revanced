import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleo extends ahbh implements ahcw
{
    public static final aleo a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aleo.class, (ahbh)(a = new aleo()));
    }
    
    private aleo() {
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
                if ((d = aleo.d) == null) {
                    synchronized (aleo.class) {
                        if (aleo.d == null) {
                            aleo.d = (ahdd)new ahba((ahbh)aleo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aleo.a;
            }
            case 4: {
                return new ahaz((ahbh)aleo.a);
            }
            case 3: {
                return new aleo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aleo.a, "\u0001\u0001\u0001\u0000\ue53c\u2847\ue53c\u2847\u0001\u0000\u0000\u0001\ue53c\u2847\u143c\u0000", new Object[] { "c", "b", aopp.class });
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