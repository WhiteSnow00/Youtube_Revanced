import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amow extends ahcz implements aheo
{
    public static final amow a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amow.class, a = new amow());
    }
    
    private amow() {
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
                if ((b = amow.b) == null) {
                    synchronized (amow.class) {
                        if (amow.b == null) {
                            amow.b = (ahev)new ahcs((ahcz)amow.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amow.a;
            }
            case 4: {
                return new ahcr((ahcz)amow.a);
            }
            case 3: {
                return new amow();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amow.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0005\u1409\u0003\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
