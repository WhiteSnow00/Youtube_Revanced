import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amah extends ahcz implements aheo
{
    public static final amah a;
    private static volatile ahev d;
    public aknj b;
    public aisc c;
    private int e;
    private ajxn f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amah.class, a = new amah());
    }
    
    private amah() {
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
                final ahev d;
                if ((d = amah.d) == null) {
                    synchronized (amah.class) {
                        if (amah.d == null) {
                            amah.d = (ahev)new ahcs((ahcz)amah.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amah.a;
            }
            case 4: {
                return new ahcr((ahcz)amah.a);
            }
            case 3: {
                return new amah();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amah.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0309\u1409\u0003", new Object[] { "e", "b", "c", "f" });
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
