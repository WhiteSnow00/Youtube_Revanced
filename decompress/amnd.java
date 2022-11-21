import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnd extends ahcz implements aheo
{
    public static final amnd a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ahsx k;
    private amiy l;
    private ahjl m;
    private alqb n;
    private ajws o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(amnd.class, a = new amnd());
    }
    
    private amnd() {
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amnd.b) == null) {
                    synchronized (amnd.class) {
                        if (amnd.b == null) {
                            amnd.b = (ahev)new ahcs((ahcz)amnd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amnd.a;
            }
            case 4: {
                return new ahcr((ahcz)amnd.a);
            }
            case 3: {
                return new amnd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnd.a, "\u0001\f\u0000\u0001\u0002\u0013\f\u0000\u0000\f\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\f\u1409\n\u000f\u1409\r\u0011\u1409\u000f\u0012\u1409\u0010\u0013\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
