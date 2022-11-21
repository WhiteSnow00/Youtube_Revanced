import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amig extends ahcz implements aheo
{
    public static final amig a;
    private static volatile ahev o;
    public int b;
    public ahdp c;
    public aowb d;
    public aowb e;
    public akfj f;
    public ajws g;
    public ahdp h;
    public aiet i;
    public aiet j;
    public aowb k;
    public anxb l;
    public anxb m;
    public ahbt n;
    private ajws p;
    private aisc q;
    private ahjl r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(amig.class, a = new amig());
    }
    
    private amig() {
        this.s = 2;
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
        this.n = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = amig.o) == null) {
                    synchronized (amig.class) {
                        if (amig.o == null) {
                            amig.o = (ahev)new ahcs((ahcz)amig.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return amig.a;
            }
            case 4: {
                return new ahcr((ahcz)amig.a);
            }
            case 3: {
                return new amig();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amig.a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\u000e\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u000b\t\u100a\f\n\u1409\u0006\u000b\u041b\f\u041b\r\u1409\u0007\u000e\u1409\b\u000f\u1409\t\u0010\u1409\n", new Object[] { "b", "p", "d", "e", "f", "g", "i", "r", "n", "j", "c", ajws.class, "h", ajws.class, "k", "l", "m", "q" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
