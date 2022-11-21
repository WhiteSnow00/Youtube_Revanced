import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwx extends ahcz implements aheo
{
    public static final alwx a;
    private static volatile ahev b;
    private int c;
    private anmr d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aisc h;
    private aisc i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(alwx.class, a = new alwx());
    }
    
    private alwx() {
        this.k = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alwx.b) == null) {
                    synchronized (alwx.class) {
                        if (alwx.b == null) {
                            alwx.b = (ahev)new ahcs((ahcz)alwx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwx.a;
            }
            case 4: {
                return new ahcr((ahcz)alwx.a);
            }
            case 3: {
                return new alwx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwx.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\t\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
