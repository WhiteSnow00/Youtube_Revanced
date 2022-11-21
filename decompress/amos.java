import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amos extends ahcz implements aheo
{
    public static final amos a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private anxb i;
    private anxb j;
    private anxb k;
    private anxb l;
    private anxb m;
    private anxb n;
    private ahjl o;
    private aisc p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(amos.class, a = new amos());
    }
    
    private amos() {
        this.q = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amos.b) == null) {
                    synchronized (amos.class) {
                        if (amos.b == null) {
                            amos.b = (ahev)new ahcs((ahcz)amos.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amos.a;
            }
            case 4: {
                return new ahcr((ahcz)amos.a);
            }
            case 3: {
                return new amos();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amos.a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0006\u0004\u1409\b\u0005\u1409\t\u0006\u1409\n\u0007\u1409\u000b\t\u1409\u0004\n\u1409\u0005\r\u1409\u0001\u000e\u1409\r\u000f\u1409\u0003\u0010\u1409\u0007", new Object[] { "c", "d", "f", "j", "l", "m", "n", "o", "h", "i", "e", "p", "g", "k" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
