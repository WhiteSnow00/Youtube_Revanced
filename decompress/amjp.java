import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjp extends ahcz implements aheo
{
    public static final amjp a;
    private static volatile ahev e;
    public aowb b;
    public int c;
    public int d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amjp.class, a = new amjp());
    }
    
    private amjp() {
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
                if ((e = amjp.e) == null) {
                    synchronized (amjp.class) {
                        if (amjp.e == null) {
                            amjp.e = (ahev)new ahcs((ahcz)amjp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amjp.a;
            }
            case 4: {
                return new ahcr((ahcz)amjp.a);
            }
            case 3: {
                return new amjp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
