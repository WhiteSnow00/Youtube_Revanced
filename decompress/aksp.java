import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksp extends ahcz implements aheo
{
    public static final aksp a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aksp.class, a = new aksp());
    }
    
    private aksp() {
        this.f = 2;
        final ahbt b = ahbt.b;
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
                if ((d = aksp.d) == null) {
                    synchronized (aksp.class) {
                        if (aksp.d == null) {
                            aksp.d = (ahev)new ahcs((ahcz)aksp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aksp.a;
            }
            case 4: {
                return new ahcr((ahcz)aksp.a);
            }
            case 3: {
                return new aksp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksp.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "b", "c", "e" });
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
