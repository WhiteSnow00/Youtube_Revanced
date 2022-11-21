import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amoa extends ahcz implements aheo
{
    public static final amoa a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private aisc f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amoa.class, a = new amoa());
    }
    
    private amoa() {
        this.h = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = amoa.b) == null) {
                    synchronized (amoa.class) {
                        if (amoa.b == null) {
                            amoa.b = (ahev)new ahcs((ahcz)amoa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amoa.a;
            }
            case 4: {
                return new ahcr((ahcz)amoa.a);
            }
            case 3: {
                return new amoa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amoa.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0004\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
