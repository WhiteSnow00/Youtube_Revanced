import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlb extends ahcz implements aheo
{
    public static final amlb a;
    private static volatile ahev g;
    public int b;
    public anxb c;
    public anxb d;
    public anxb e;
    public anxb f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amlb.class, a = new amlb());
    }
    
    private amlb() {
        this.h = 2;
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
                final ahev g;
                if ((g = amlb.g) == null) {
                    synchronized (amlb.class) {
                        if (amlb.g == null) {
                            amlb.g = (ahev)new ahcs((ahcz)amlb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amlb.a;
            }
            case 4: {
                return new ahcr((short[])null, (int[])null);
            }
            case 3: {
                return new amlb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
