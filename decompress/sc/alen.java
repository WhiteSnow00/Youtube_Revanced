import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alen extends ahbh implements ahcw
{
    public static final alen a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alen.class, (ahbh)(a = new alen()));
    }
    
    private alen() {
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
                if ((d = alen.d) == null) {
                    synchronized (alen.class) {
                        if (alen.d == null) {
                            alen.d = (ahdd)new ahba((ahbh)alen.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alen.a;
            }
            case 4: {
                return new ahaz((ahbh)alen.a);
            }
            case 3: {
                return new alen();
            }
            case 2: {
                return newMessageInfo((MessageLite)alen.a, "\u0001\u0004\u0001\u0000\uf897\u18b0\ue1ab\u3bc6\u0004\u0000\u0000\u0004\uf897\u18b0\u143c\u0000\uf8af\u18b0\u143c\u0000\uedf1\u38ca\u143c\u0000\ue1ab\u3bc6\u143c\u0000", new Object[] { "c", "b", aled.class, alee.class, ajwq.class, aldy.class });
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
