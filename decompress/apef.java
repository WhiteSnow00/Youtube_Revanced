import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apef extends ahcz implements aheo
{
    public static final apef a;
    private static volatile ahev b;
    private ajws A;
    private ajws B;
    private ajws C;
    private byte D;
    private int c;
    private int d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private aisc l;
    private amiy m;
    private anxb n;
    private ajws o;
    private aibx p;
    private aibx q;
    private anxb r;
    private anxb s;
    private anxb t;
    private aibx u;
    private anxb v;
    private ahjl w;
    private ajws x;
    private ajws y;
    private ajws z;
    
    static {
        ahcz.registerDefaultInstance(apef.class, a = new apef());
    }
    
    private apef() {
        this.D = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = apef.b) == null) {
                    synchronized (apef.class) {
                        if (apef.b == null) {
                            apef.b = (ahev)new ahcs((ahcz)apef.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apef.a;
            }
            case 4: {
                return new ahcr((ahcz)apef.a);
            }
            case 3: {
                return new apef();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apef.a, "\u0001\u0019\u0000\u0002\u0002!\u0019\u0000\u0000\u0019\u0002\u1409\u001b\u0003\u1409\u001c\u0004\u1409\u001d\u0005\u1409\u001e\u0006\u1409 \u0007\u1409\n\b\u1409\u000f\n\u1409\u001a\f\u1409\u0003\u000f\u1409\u001f\u0010\u1409\u0004\u0011\u1409\u0005\u0012\u1409\u0006\u0013\u1409\u0010\u0015\u1409\t\u0016\u1409\u000b\u0017\u1409\u0007\u0019\u1409\u0014\u001a\u1409\f\u001b\u1409\u0011\u001d\u1409\u0016\u001e\u1409\u0012\u001f\u1409\b \u1409\u0017!\u1409\u0018", new Object[] { "c", "d", "x", "y", "z", "A", "C", "l", "o", "w", "e", "B", "f", "g", "h", "p", "k", "m", "i", "s", "n", "q", "t", "r", "j", "u", "v" });
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
