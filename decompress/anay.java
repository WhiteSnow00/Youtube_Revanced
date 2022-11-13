import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anay extends ahbh implements ahcw
{
    public static final anay a;
    private static volatile ahdd b;
    private int c;
    private anax d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anay.class, (ahbh)(a = new anay()));
    }
    
    private anay() {
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
                final ahdd b;
                if ((b = anay.b) == null) {
                    synchronized (anay.class) {
                        if (anay.b == null) {
                            anay.b = (ahdd)new ahba((ahbh)anay.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anay.a;
            }
            case 4: {
                return new ahaz((ahbh)anay.a);
            }
            case 3: {
                return new anay();
            }
            case 2: {
                return newMessageInfo((MessageLite)anay.a, "\u0001\u0001\u0000\u0001\ue589\u3c7e\ue589\u3c7e\u0001\u0000\u0000\u0001\ue589\u3c7e\u1409\u0000", new Object[] { "c", "d" });
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
