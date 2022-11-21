import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfi extends ahcz implements aheo
{
    public static final apfi a;
    private static volatile ahev b;
    private aisc A;
    private byte B;
    private int c;
    private int d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private amiy i;
    private aisc j;
    private apfh k;
    private aibx l;
    private ahjl m;
    private aibx n;
    private aphj o;
    private ajws p;
    private ajws q;
    private ajws r;
    private ajws s;
    private ajws t;
    private ajws u;
    private ajws v;
    private ajws w;
    private ajws x;
    private ajws y;
    private ajws z;
    
    static {
        ahcz.registerDefaultInstance(apfi.class, a = new apfi());
    }
    
    private apfi() {
        this.B = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte b = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b2;
                if ((b2 = apfi.b) == null) {
                    synchronized (apfi.class) {
                        if (apfi.b == null) {
                            apfi.b = (ahev)new ahcs((ahcz)apfi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apfi.a;
            }
            case 4: {
                return new ahcr((ahcz)apfi.a);
            }
            case 3: {
                return new apfi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfi.a, "\u0001\u0017\u0000\u0002\u0003(\u0017\u0000\u0000\u0017\u0003\u1409\u0012\u0004\u1409\u0005\u0007\u1409\u0016\b\u1409\u0017\t\u1409\u0018\n\u1409\u0019\u000b\u1409\u001a\f\u1409\u001d\r\u1409\u001e\u000e\u1409\u001f\u000f\u1409 \u0010\u1409\u0011\u0013\u1409\u001b\u0014\u1409\u001c\u0016\u1409\u000e\u001b\u1409\u0007\u001d\u1409\u0015\u001f\u1409\u0001 \u1409\u0003!\u1409\u0004\"\u1409\u000b'\u1409\f(\u1409\u0002", new Object[] { "c", "d", "o", "i", "q", "r", "s", "t", "u", "x", "y", "z", "A", "n", "v", "w", "m", "j", "p", "e", "g", "h", "k", "l", "f" });
            }
            case 1: {
                if (o == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            }
            case 0: {
                return this.B;
            }
        }
    }
}
