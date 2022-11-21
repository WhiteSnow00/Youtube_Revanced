import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzo extends ahcz implements aheo
{
    public static final apzo a;
    private static volatile ahev k;
    public int b;
    public ajws c;
    public apzp d;
    public ajws e;
    public apzn f;
    public ahdp g;
    public ajws h;
    public ahdp i;
    public ahbt j;
    private aisc l;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(apzo.class, a = new apzo());
    }
    
    private apzo() {
        this.n = 2;
        emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        this.i = ahcz.emptyProtobufList();
        this.j = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = apzo.k) == null) {
                    synchronized (apzo.class) {
                        if (apzo.k == null) {
                            apzo.k = (ahev)new ahcs((ahcz)apzo.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apzo.a;
            }
            case 4: {
                return new ahcr((ahcz)apzo.a);
            }
            case 3: {
                return new apzo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzo.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0002\t\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003\b\u1409\u0004\t\u1409\u0006\n\u100a\u0007\u000b\u041b\f\u041b\r\u1409\u0005", new Object[] { "b", "c", "d", "l", "e", "f", "m", "j", "g", ajws.class, "i", ajws.class, "h" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
