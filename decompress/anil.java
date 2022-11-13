import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anil extends ahbh implements ahcw
{
    public static final anil a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anil.class, (ahbh)(a = new anil()));
    }
    
    private anil() {
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
                if ((d = anil.d) == null) {
                    synchronized (anil.class) {
                        if (anil.d == null) {
                            anil.d = (ahdd)new ahba((ahbh)anil.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anil.a;
            }
            case 4: {
                return new ahaz((ahbh)anil.a);
            }
            case 3: {
                return new anil();
            }
            case 2: {
                return newMessageInfo((MessageLite)anil.a, "\u0001\u0001\u0001\u0000\ue952\u24a1\ue952\u24a1\u0001\u0000\u0000\u0001\ue952\u24a1\u143c\u0000", new Object[] { "c", "b", aoix.class });
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
