import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdt extends ahcz implements aheo
{
    public static final apdt a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ahjl h;
    private ajws i;
    private ajws j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apdt.class, a = new apdt());
    }
    
    private apdt() {
        this.k = 2;
        emptyProtobufList();
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
                if ((b = apdt.b) == null) {
                    synchronized (apdt.class) {
                        if (apdt.b == null) {
                            apdt.b = (ahev)new ahcs((ahcz)apdt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdt.a;
            }
            case 4: {
                return new ahcr((ahcz)apdt.a);
            }
            case 3: {
                return new apdt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdt.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0001\u0003\u1409\u0007\u0004\u1409\b\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u0005\t\u1409\u0004", new Object[] { "c", "d", "i", "j", "e", "f", "h", "g" });
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
