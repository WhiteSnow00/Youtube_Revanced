import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdu extends ahcz implements aheo
{
    public static final apdu a;
    private static volatile ahev b;
    private int c;
    private apdt d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apdu.class, a = new apdu());
    }
    
    private apdu() {
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
                if ((b = apdu.b) == null) {
                    synchronized (apdu.class) {
                        if (apdu.b == null) {
                            apdu.b = (ahev)new ahcs((ahcz)apdu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdu.a;
            }
            case 4: {
                return new ahcr((ahcz)apdu.a);
            }
            case 3: {
                return new apdu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdu.a, "\u0001\u0001\u0000\u0001\uf34b\u40fa\uf34b\u40fa\u0001\u0000\u0000\u0001\uf34b\u40fa\u1409\u0000", new Object[] { "c", "d" });
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
