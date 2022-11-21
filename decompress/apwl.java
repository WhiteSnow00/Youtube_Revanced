import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwl extends ahcz implements aheo
{
    public static final apwl a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private anxb h;
    private ahjl i;
    private apwk j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apwl.class, a = new apwl());
    }
    
    private apwl() {
        this.k = 2;
        ahcz.emptyProtobufList();
        emptyProtobufList();
        ahcz.emptyProtobufList();
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
                if ((b = apwl.b) == null) {
                    synchronized (apwl.class) {
                        if (apwl.b == null) {
                            apwl.b = (ahev)new ahcs((ahcz)apwl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwl.a;
            }
            case 4: {
                return new ahcr((ahcz)apwl.a);
            }
            case 3: {
                return new apwl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwl.a, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\t\u0010\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
