import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apeh extends ahcz implements aheo
{
    public static final apeh a;
    private static volatile ahev b;
    private ajws A;
    private ajws B;
    private ajws C;
    private byte D;
    private int c;
    private int d;
    private ajws e;
    private anxb f;
    private ajws g;
    private aisc h;
    private aphj i;
    private aiet j;
    private aiet k;
    private apei l;
    private ajws m;
    private ajws n;
    private ajws o;
    private aibx p;
    private ajws q;
    private ahjl r;
    private ajws s;
    private aisc t;
    private ajws u;
    private ajws v;
    private ajws w;
    private ajws x;
    private ajws y;
    private ajws z;
    
    static {
        ahcz.registerDefaultInstance(apeh.class, a = new apeh());
    }
    
    private apeh() {
        this.D = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apeh.b) == null) {
                    synchronized (apeh.class) {
                        if (apeh.b == null) {
                            apeh.b = (ahev)new ahcs((ahcz)apeh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apeh.a;
            }
            case 4: {
                return new ahcr((ahcz)apeh.a);
            }
            case 3: {
                return new apeh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apeh.a, "\u0001\u0019\u0000\u0002\u0002#\u0019\u0000\u0000\u0019\u0002\u1409\u0014\u0003\u1409\u0000\u0004\u1409\u0015\u0007\u1409 \b\u1409!\n\u1409\u0006\u000b\u1409\u001c\f\u1409\u001d\r\u1409\u0016\u000f\u1409\u0018\u0010\u1409\u001e\u0011\u1409\u001a\u0012\u1409\u001b\u0013\u1409\u0019\u0015\u1409\n\u0016\u1409\u0003\u0018\u1409\u0005\u0019\u1409\u000b\u001a\u1409\f\u001c\u1409\r\u001d\u1409\u000e\u001e\u1409\u000f\u001f\u1409\b\"\u1409\t#\u1409\u0001", new Object[] { "c", "d", "r", "e", "s", "B", "C", "i", "y", "z", "t", "u", "A", "w", "x", "v", "l", "g", "h", "m", "n", "o", "p", "q", "j", "k", "f" });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.D = d;
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
