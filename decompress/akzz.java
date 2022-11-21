import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzz extends ahcz implements aheo
{
    public static final akzz a;
    private static volatile ahev c;
    public aknj b;
    private int d;
    private aisc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akzz.class, a = new akzz());
    }
    
    private akzz() {
        this.f = 2;
        emptyProtobufList();
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
                final ahev c;
                if ((c = akzz.c) == null) {
                    synchronized (akzz.class) {
                        if (akzz.c == null) {
                            akzz.c = (ahev)new ahcs((ahcz)akzz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akzz.a;
            }
            case 4: {
                return new ahcr((ahcz)akzz.a);
            }
            case 3: {
                return new akzz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzz.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0004\u1409\u0001", new Object[] { "d", "b", "e" });
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
