import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alah extends ahcz implements aheo
{
    public static final alah a;
    private static volatile ahev d;
    public aknj b;
    public alai c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alah.class, a = new alah());
    }
    
    private alah() {
        this.g = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = alah.d) == null) {
                    synchronized (alah.class) {
                        if (alah.d == null) {
                            alah.d = (ahev)new ahcs((ahcz)alah.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alah.a;
            }
            case 4: {
                return new ahcr((ahcz)alah.a);
            }
            case 3: {
                return new alah();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alah.a, "\u0001\u0003\u0000\u0001\u0001\uec40\u34f7\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0002\uec40\u34f7\u1409\u0001", new Object[] { "e", "b", "f", "c" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
