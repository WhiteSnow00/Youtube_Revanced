import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkt extends ahcz implements aheo
{
    public static final amkt a;
    private static volatile ahev f;
    public amkp b;
    public amkq c;
    public amkp d;
    public amkq e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amkt.class, a = new amkt());
    }
    
    private amkt() {
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
                final ahev f;
                if ((f = amkt.f) == null) {
                    synchronized (amkt.class) {
                        if (amkt.f == null) {
                            amkt.f = (ahev)new ahcs((ahcz)amkt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amkt.a;
            }
            case 4: {
                return new ahcr((ahcz)amkt.a);
            }
            case 3: {
                return new amkt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkt.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
