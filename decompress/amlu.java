import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlu extends ahcz implements aheo
{
    public static final amlu a;
    private static volatile ahev g;
    public int b;
    public String c;
    public ajws d;
    public ajws e;
    public aisc f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amlu.class, a = new amlu());
    }
    
    private amlu() {
        this.h = 2;
        this.c = "";
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
                if ((g = amlu.g) == null) {
                    synchronized (amlu.class) {
                        if (amlu.g == null) {
                            amlu.g = (ahev)new ahcs((ahcz)amlu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amlu.a;
            }
            case 4: {
                return new ahcr((ahcz)amlu.a);
            }
            case 3: {
                return new amlu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
