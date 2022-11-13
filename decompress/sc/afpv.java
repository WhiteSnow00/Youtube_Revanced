import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpv extends ahbh implements ahcw
{
    public static final afpv a;
    private static volatile ahdd d;
    public int b;
    public afre c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)afpv.class, (ahbh)(a = new afpv()));
    }
    
    private afpv() {
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
                if ((d = afpv.d) == null) {
                    synchronized (afpv.class) {
                        if (afpv.d == null) {
                            afpv.d = (ahdd)new ahba((ahbh)afpv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afpv.a;
            }
            case 4: {
                return new ahaz((ahbh)afpv.a);
            }
            case 3: {
                return new afpv();
            }
            case 2: {
                return newMessageInfo((MessageLite)afpv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
