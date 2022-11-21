import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphv extends ahcz implements aheo
{
    public static final aphv a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private amiy k;
    private aisc l;
    private aisc m;
    private aibx n;
    private aibx o;
    private aibx p;
    private anxb q;
    private anxb r;
    private aibx s;
    private ahjl t;
    private ajws u;
    private ajws v;
    private ajws w;
    private ajws x;
    private byte y;
    
    static {
        ahcz.registerDefaultInstance(aphv.class, a = new aphv());
    }
    
    private aphv() {
        this.y = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphv.b) == null) {
                    synchronized (aphv.class) {
                        if (aphv.b == null) {
                            aphv.b = (ahev)new ahcs((ahcz)aphv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphv.a;
            }
            case 4: {
                return new ahcr((ahcz)aphv.a);
            }
            case 3: {
                return new aphv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphv.a, "\u0001\u0015\u0000\u0001\u00039\u0015\u0000\u0000\u0015\u0003\u1409\u0019\u000b\u1409\u000e\u001b\u1409\u0018\u001d\u1409\u001a\u001e\u1409\u001b\u001f\u1409\u001c\"\u1409\n&\u1409\u0011'\u1409\u0001(\u1409\u0002)\u1409\u0003*\u1409\u0004,\u1409\u0005-\u1409\u0006.\u1409\u000f1\u1409\r2\u1409\u00145\u1409\u00136\u1409\u00128\u1409\u00159\u1409\u0016", new Object[] { "c", "u", "l", "t", "v", "w", "x", "j", "n", "d", "e", "f", "g", "h", "i", "m", "k", "q", "p", "o", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
