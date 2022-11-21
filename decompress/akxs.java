import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxs extends ahcz implements aheo
{
    public static final akxs a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akxs.class, a = new akxs());
    }
    
    private akxs() {
        this.f = 2;
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akxs.d) == null) {
                    synchronized (akxs.class) {
                        if (akxs.d == null) {
                            akxs.d = (ahev)new ahcs((ahcz)akxs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akxs.a;
            }
            case 4: {
                return new ahcr((ahcz)akxs.a);
            }
            case 3: {
                return new akxs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b", new Object[] { "e", "b", "c", aisc.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
