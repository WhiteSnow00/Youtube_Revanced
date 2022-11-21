import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amii extends ahcz implements aheo
{
    public static final amii a;
    private static volatile ahev l;
    public int b;
    public ajws c;
    public akfj d;
    public aiet e;
    public aowb f;
    public aowb g;
    public aowb h;
    public anxb i;
    public anxb j;
    public ahbt k;
    private aiet m;
    private anxb n;
    private ajws o;
    private anxb p;
    private ahjl q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(amii.class, a = new amii());
    }
    
    private amii() {
        this.r = 2;
        emptyProtobufList();
        this.k = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = amii.l) == null) {
                    synchronized (amii.class) {
                        if (amii.l == null) {
                            amii.l = (ahev)new ahcs((ahcz)amii.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return amii.a;
            }
            case 4: {
                return new ahcr((ahcz)amii.a);
            }
            case 3: {
                return new amii();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amii.a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\f\u0006\u100a\r\u0007\u1409\u0003\b\u1409\u0004\t\u1409\u0006\n\u1409\u0007\u000b\u1409\b\f\u1409\n\r\u1409\t\u000e\u1409\u0005\u000f\u1409\u000b", new Object[] { "b", "c", "d", "e", "q", "k", "f", "g", "h", "i", "j", "o", "n", "m", "p" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
