import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqr extends ahcz implements aheo
{
    public static final apqr a;
    private static volatile ahev d;
    public int b;
    public amzj c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apqr.class, a = new apqr());
    }
    
    private apqr() {
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
                if ((d = apqr.d) == null) {
                    synchronized (apqr.class) {
                        if (apqr.d == null) {
                            apqr.d = (ahev)new ahcs((ahcz)apqr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqr.a;
            }
            case 4: {
                return new ahcr((ahcz)apqr.a);
            }
            case 3: {
                return new apqr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqr.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "b", "c" });
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
