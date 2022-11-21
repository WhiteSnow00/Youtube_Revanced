import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphu extends ahcz implements aheo
{
    public static final aphu a;
    private static volatile ahev b;
    private aisc A;
    private anxb B;
    private byte C;
    private int c;
    private int d;
    private ajws e;
    private aisc f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private ajws l;
    private ajws m;
    private ajws n;
    private ajws o;
    private ajws p;
    private ajws q;
    private ajws r;
    private ajws s;
    private aisc t;
    private aphj u;
    private amiy v;
    private ahjl w;
    private anxb x;
    private anxb y;
    private anxb z;
    
    static {
        ahcz.registerDefaultInstance(aphu.class, a = new aphu());
    }
    
    private aphu() {
        this.C = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte c = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphu.b) == null) {
                    synchronized (aphu.class) {
                        if (aphu.b == null) {
                            aphu.b = (ahev)new ahcs((ahcz)aphu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphu.a;
            }
            case 4: {
                return new ahcr((ahcz)aphu.a);
            }
            case 3: {
                return new aphu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphu.a, "\u0001\u0018\u0000\u0002\u0002)\u0018\u0000\u0000\u0018\u0002\u1409\u0004\u0003\u1409\u0007\u0004\u1409\b\u0005\u1409\t\u0006\u1409\n\u0007\u1409\u000b\b\u1409\f\t\u1409\u000e\f\u1409\u001a\r\u1409\u001b\u000e\u1409\r\u0013\u1409\u001e\u0014\u1409\u0005\u0016\u1409\u000f\u0017\u1409\u0010\u0018\u1409\u0011\u0019\u1409\u0012\u001a\u1409\u0015\u001d\u1409\u0014#\u1409 $\u1409!%\u1409#&\u1409\")\u1409$", new Object[] { "c", "d", "e", "g", "h", "i", "j", "k", "l", "n", "u", "v", "m", "w", "f", "o", "p", "q", "r", "t", "s", "x", "y", "A", "z", "B" });
            }
            case 1: {
                if (o == null) {
                    c = 0;
                }
                this.C = c;
                return null;
            }
            case 0: {
                return this.C;
            }
        }
    }
}
