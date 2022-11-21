import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopr extends ahcz implements aheo
{
    public static final aopr a;
    private static volatile ahev l;
    public int b;
    public int c;
    public Object d;
    public anxb e;
    public ahdp f;
    public ahdp g;
    public ajws h;
    public anxb i;
    public anxb j;
    public ahbt k;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(aopr.class, a = new aopr());
    }
    
    private aopr() {
        this.c = 0;
        this.n = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        this.k = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aopr.l) == null) {
                    synchronized (aopr.class) {
                        if (aopr.l == null) {
                            aopr.l = (ahev)new ahcs((ahcz)aopr.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aopr.a;
            }
            case 4: {
                return new ahcr((ahcz)aopr.a);
            }
            case 3: {
                return new aopr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopr.a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0002\t\u0001\u143c\u0000\u0002\u1409\u0003\u0003\u041b\u0004\u041b\u0005\u1409\u0005\u0006\u1409\u0007\u0007\u100a\b\b\u143c\u0000\t\u1409\u0004\n\u1409\u0006", new Object[] { "d", "c", "b", aowb.class, "e", "f", ajws.class, "g", ajws.class, "i", "m", "k", akfj.class, "h", "j" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
