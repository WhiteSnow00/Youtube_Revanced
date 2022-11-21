import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akow extends ahcz implements aheo
{
    public static final akow a;
    private static volatile ahev d;
    public aknj b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akow.class, a = new akow());
    }
    
    private akow() {
        this.f = 2;
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
                if ((d = akow.d) == null) {
                    synchronized (akow.class) {
                        if (akow.d == null) {
                            akow.d = (ahev)new ahcs((ahcz)akow.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akow.a;
            }
            case 4: {
                return new ahcr((ahcz)akow.a);
            }
            case 3: {
                return new akow();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akow.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", "c", ansp.q });
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
