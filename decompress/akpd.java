import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpd extends ahcz implements aheo
{
    public static final akpd a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akpd.class, a = new akpd());
    }
    
    private akpd() {
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
                if ((d = akpd.d) == null) {
                    synchronized (akpd.class) {
                        if (akpd.d == null) {
                            akpd.d = (ahev)new ahcs((ahcz)akpd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpd.a;
            }
            case 4: {
                return new ahcr((ahcz)akpd.a);
            }
            case 3: {
                return new akpd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", akpe.class });
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
