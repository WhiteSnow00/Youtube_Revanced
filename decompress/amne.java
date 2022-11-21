import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amne extends ahcz implements aheo
{
    public static final amne a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aiet g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private ajws l;
    private ajws m;
    private ajws n;
    private aisc o;
    private aich p;
    private aich q;
    private aich r;
    private ahsx s;
    private almp t;
    private amiy u;
    private ahjl v;
    private aiet w;
    private byte x;
    
    static {
        ahcz.registerDefaultInstance(amne.class, a = new amne());
    }
    
    private amne() {
        this.x = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amne.b) == null) {
                    synchronized (amne.class) {
                        if (amne.b == null) {
                            amne.b = (ahev)new ahcs((ahcz)amne.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amne.a;
            }
            case 4: {
                return new ahcr((ahcz)amne.a);
            }
            case 3: {
                return new amne();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amne.a, "\u0001\u0014\u0000\u0001\u0003$\u0014\u0000\u0000\u0014\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0007\u1409\t\b\u1409\n\t\u1409\f\n\u1409\r\u000b\u1409\u000f\u000e\u1409\u0013\u0010\u1409\u0017\u0012\u1409\u000b\u0013\u1409\u0014\u0015\u1409\u000e\u0016\u1409\u0015\u0018\u1409\u0010\u0019\u1409\u0011\u001a\u1409\u0012\u001c\u1409\u0003!\u1409\u0005$\u1409\u001b", new Object[] { "c", "d", "f", "h", "i", "j", "l", "m", "o", "s", "v", "k", "t", "n", "u", "p", "q", "r", "e", "g", "w" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
