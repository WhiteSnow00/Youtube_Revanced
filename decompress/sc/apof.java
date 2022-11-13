import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apof extends ahbh implements ahcw
{
    public static final apof a;
    private static volatile ahdd d;
    public int b;
    public amxe c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apof.class, (ahbh)(a = new apof()));
    }
    
    private apof() {
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
                if ((d = apof.d) == null) {
                    synchronized (apof.class) {
                        if (apof.d == null) {
                            apof.d = (ahdd)new ahba((ahbh)apof.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apof.a;
            }
            case 4: {
                return new ahaz((ahbh)apof.a);
            }
            case 3: {
                return new apof();
            }
            case 2: {
                return newMessageInfo((MessageLite)apof.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "b", "c" });
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
