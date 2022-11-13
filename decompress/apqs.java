import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqs extends ahbh implements ahcw
{
    public static final apqs a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apqs.class, (ahbh)(a = new apqs()));
    }
    
    private apqs() {
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
                if ((d = apqs.d) == null) {
                    synchronized (apqs.class) {
                        if (apqs.d == null) {
                            apqs.d = (ahdd)new ahba((ahbh)apqs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqs.a;
            }
            case 4: {
                return new ahaz((ahbh)apqs.a);
            }
            case 3: {
                return new apqs();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqs.a, "\u0001\u0003\u0001\u0000\ufeaf\u4a23\ufa32\u53af\u0003\u0000\u0000\u0003\ufeaf\u4a23\u143c\u0000\ue14e\u4a25\u143c\u0000\ufa32\u53af\u143c\u0000", new Object[] { "c", "b", apqu.class, apqr.class, apqo.class });
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
