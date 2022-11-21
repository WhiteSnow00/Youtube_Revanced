import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqh extends ahcz implements aheo
{
    public static final apqh a;
    private static volatile ahev b;
    private int c;
    private aprm d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apqh.class, a = new apqh());
    }
    
    private apqh() {
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
                final ahev b;
                if ((b = apqh.b) == null) {
                    synchronized (apqh.class) {
                        if (apqh.b == null) {
                            apqh.b = (ahev)new ahcs((ahcz)apqh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqh.a;
            }
            case 4: {
                return new ahcr((ahcz)apqh.a);
            }
            case 3: {
                return new apqh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqh.a, "\u0001\u0001\u0000\u0001\ueaf2\u2166\ueaf2\u2166\u0001\u0000\u0000\u0001\ueaf2\u2166\u1409\u0000", new Object[] { "c", "d" });
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
