import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amok extends ahcz implements aheo
{
    public static final amok a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private anxb e;
    private ajws f;
    private ajws g;
    private anxb h;
    private aisc i;
    private anxb j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(amok.class, a = new amok());
    }
    
    private amok() {
        this.k = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = amok.b) == null) {
                    synchronized (amok.class) {
                        if (amok.b == null) {
                            amok.b = (ahev)new ahcs((ahcz)amok.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amok.a;
            }
            case 4: {
                return new ahcr((ahcz)amok.a);
            }
            case 3: {
                return new amok();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amok.a, "\u0001\u0007\u0000\u0001\u0006\u0012\u0007\u0000\u0000\u0007\u0006\u1409\u0001\u000b\u1409\u0002\f\u1409\u0003\r\u1409\u0004\u0010\u1409\u0005\u0011\u1409\u0006\u0012\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
