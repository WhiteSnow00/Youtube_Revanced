import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algs extends ahcz implements aheo
{
    public static final algs a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private anxb f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(algs.class, a = new algs());
    }
    
    private algs() {
        this.h = 2;
        this.c = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = algs.d) == null) {
                    synchronized (algs.class) {
                        if (algs.d == null) {
                            algs.d = (ahev)new ahcs((ahcz)algs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algs.a;
            }
            case 4: {
                return new ahcr((ahcz)algs.a);
            }
            case 3: {
                return new algs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algs.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0004\u1409\u0001\u0005\u1409\u0003", new Object[] { "e", "b", "c", aisc.class, "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
