import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampe extends ahcz implements aheo
{
    public static final ampe a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ampe.class, a = new ampe());
    }
    
    private ampe() {
        this.g = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = ampe.b) == null) {
                    synchronized (ampe.class) {
                        if (ampe.b == null) {
                            ampe.b = (ahev)new ahcs((ahcz)ampe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampe.a;
            }
            case 4: {
                return new ahcr((ahcz)ampe.a);
            }
            case 3: {
                return new ampe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampe.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
