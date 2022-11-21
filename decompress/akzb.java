import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzb extends ahcz implements aheo
{
    public static final akzb a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akzb.class, a = new akzb());
    }
    
    private akzb() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akzb.d) == null) {
                    synchronized (akzb.class) {
                        if (akzb.d == null) {
                            akzb.d = (ahev)new ahcs((ahcz)akzb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzb.a;
            }
            case 4: {
                return new ahcr((ahcz)akzb.a);
            }
            case 3: {
                return new akzb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzb.a, "\u0001\n\u0001\u0000\ue18f\u174a\ueffb\ub0e7\n\u0000\u0000\t\ue18f\u174a\u143c\u0000\ufbb1\u1aa2\u103c\u0000\ue67d\u1e18\u143c\u0000\ue62e\u1e20\u143c\u0000\ue5be\u2871\u143c\u0000\ue63d\u2a15\u143c\u0000\ue162\u2a82\u143c\u0000\uedf4\u2e99\u143c\u0000\uec93\u6009\u143c\u0000\ueffb\ub0e7\u143c\u0000", new Object[] { "c", "b", aprz.class, anht.class, akzd.class, apmc.class, ahmk.class, ahne.class, ahpi.class, ahnz.class, ahnk.class, ahmm.class });
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
