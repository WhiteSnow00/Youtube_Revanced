import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amoz extends ahcz implements aheo
{
    public static final amoz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private amoy h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(amoz.class, a = new amoz());
    }
    
    private amoz() {
        this.j = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = amoz.b) == null) {
                    synchronized (amoz.class) {
                        if (amoz.b == null) {
                            amoz.b = (ahev)new ahcs((ahcz)amoz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amoz.a;
            }
            case 4: {
                return new ahcr((ahcz)amoz.a);
            }
            case 3: {
                return new amoz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amoz.a, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0006\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\b\u000b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "i", "h" });
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
