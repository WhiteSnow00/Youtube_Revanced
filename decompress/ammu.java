import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammu extends ahcz implements aheo
{
    public static final ammu a;
    private static volatile ahev e;
    public ajws b;
    public ajws c;
    public aiet d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ammu.class, a = new ammu());
    }
    
    private ammu() {
        this.g = 2;
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
                final ahev e;
                if ((e = ammu.e) == null) {
                    synchronized (ammu.class) {
                        if (ammu.e == null) {
                            ammu.e = (ahev)new ahcs((ahcz)ammu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ammu.a;
            }
            case 4: {
                return new ahcr((ahcz)ammu.a);
            }
            case 3: {
                return new ammu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
