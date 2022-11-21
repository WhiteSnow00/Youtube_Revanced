import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antm extends ahcz implements aheo
{
    public static final antm a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(antm.class, a = new antm());
    }
    
    private antm() {
        this.j = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = antm.b) == null) {
                    synchronized (antm.class) {
                        if (antm.b == null) {
                            antm.b = (ahev)new ahcs((ahcz)antm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antm.a;
            }
            case 4: {
                return new ahcr((ahcz)antm.a);
            }
            case 3: {
                return new antm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antm.a, "\u0001\u0006\u0000\u0001\u0003\t\u0006\u0000\u0000\u0006\u0003\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0005\b\u1409\u0002\t\u1409\u0004", new Object[] { "c", "d", "e", "g", "i", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
