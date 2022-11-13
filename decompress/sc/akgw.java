import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgw extends ahbh implements ahcw
{
    public static final akgw a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgw.class, (ahbh)(a = new akgw()));
    }
    
    private akgw() {
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
                if ((d = akgw.d) == null) {
                    synchronized (akgw.class) {
                        if (akgw.d == null) {
                            akgw.d = (ahdd)new ahba((ahbh)akgw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgw.a;
            }
            case 4: {
                return new ahaz((ahbh)akgw.a);
            }
            case 3: {
                return new akgw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgw.a, "\u0001\t\u0001\u0000\uf61f\u0f29\uec93\u6009\t\u0000\u0000\u0007\uf61f\u0f29\u103c\u0000\ue18f\u174a\u143c\u0000\ufd61\u1d59\u143c\u0000\ue67d\u1e18\u143c\u0000\ue5be\u2871\u143c\u0000\uf95d\u2871\u103c\u0000\uf09c\u28a0\u143c\u0000\ueb1d\u40e6\u143c\u0000\uec93\u6009\u143c\u0000", new Object[] { "c", "b", apjr.class, appn.class, apki.class, akxd.class, ahkt.class, ajuc.class, aooo.class, ahly.class, ahlt.class });
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
