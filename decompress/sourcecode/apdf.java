import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdf extends agzi implements ahax
{
    public static final apdf a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private amer k;
    private aioe l;
    private aioe m;
    private ahyg n;
    private ahyg o;
    private ahyg p;
    private anss q;
    private anss r;
    private ahyg s;
    private ahfw t;
    private ajsq u;
    private ajsq v;
    private ajsq w;
    private ajsq x;
    private byte y;
    
    static {
        agzi.registerDefaultInstance(apdf.class, a = new apdf());
    }
    
    private apdf() {
        this.y = 2;
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = apdf.b) == null) {
                    synchronized (apdf.class) {
                        if (apdf.b == null) {
                            apdf.b = (ahbe)new agzb((agzi)apdf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apdf.a;
            }
            case 4: {
                return new agza((agzi)apdf.a);
            }
            case 3: {
                return new apdf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdf.a, "\u0001\u0015\u0000\u0001\u00039\u0015\u0000\u0000\u0015\u0003\u1409\u0019\u000b\u1409\u000e\u001b\u1409\u0018\u001d\u1409\u001a\u001e\u1409\u001b\u001f\u1409\u001c\"\u1409\n&\u1409\u0011'\u1409\u0001(\u1409\u0002)\u1409\u0003*\u1409\u0004,\u1409\u0005-\u1409\u0006.\u1409\u000f1\u1409\r2\u1409\u00145\u1409\u00136\u1409\u00128\u1409\u00159\u1409\u0016", new Object[] { "c", "u", "l", "t", "v", "w", "x", "j", "n", "d", "e", "f", "g", "h", "i", "m", "k", "q", "p", "o", "r", "s" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.y = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
