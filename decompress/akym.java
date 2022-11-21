import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akym extends ahcz implements aheo
{
    public static final akym a;
    private static volatile ahev d;
    public amxq b;
    public ahdp c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akym.class, a = new akym());
    }
    
    private akym() {
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
                if ((d = akym.d) == null) {
                    synchronized (akym.class) {
                        if (akym.d == null) {
                            akym.d = (ahev)new ahcs((ahcz)akym.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akym.a;
            }
            case 4: {
                return new ahcr((ahcz)akym.a);
            }
            case 3: {
                return new akym();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akym.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", akyn.class });
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
