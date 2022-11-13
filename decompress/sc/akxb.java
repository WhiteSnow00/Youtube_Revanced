import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxb extends ahbh implements ahcw
{
    public static final akxb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akxb.class, (ahbh)(a = new akxb()));
    }
    
    private akxb() {
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
                if ((d = akxb.d) == null) {
                    synchronized (akxb.class) {
                        if (akxb.d == null) {
                            akxb.d = (ahdd)new ahba((ahbh)akxb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akxb.a;
            }
            case 4: {
                return new ahaz((ahbh)akxb.a);
            }
            case 3: {
                return new akxb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akxb.a, "\u0001\n\u0001\u0000\ue18f\u174a\ueffb\ub0e7\n\u0000\u0000\t\ue18f\u174a\u143c\u0000\ufbb1\u1aa2\u103c\u0000\ue67d\u1e18\u143c\u0000\ue62e\u1e20\u143c\u0000\ue5be\u2871\u143c\u0000\ue63d\u2a15\u143c\u0000\ue162\u2a82\u143c\u0000\uedf4\u2e99\u143c\u0000\uec93\u6009\u143c\u0000\ueffb\ub0e7\u143c\u0000", new Object[] { "c", "b", appn.class, anfm.class, akxd.class, apjq.class, ahkt.class, ahln.class, ahnr.class, ahmi.class, ahlt.class, ahkv.class });
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
