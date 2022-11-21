import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amoh extends ahcz implements aheo
{
    public static final amoh a;
    private static volatile ahev b;
    private int c;
    private amof d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amoh.class, a = new amoh());
    }
    
    private amoh() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amoh.b) == null) {
                    synchronized (amoh.class) {
                        if (amoh.b == null) {
                            amoh.b = (ahev)new ahcs((ahcz)amoh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amoh.a;
            }
            case 4: {
                return new ahcr((ahcz)amoh.a);
            }
            case 3: {
                return new amoh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amoh.a, "\u0001\u0001\u0000\u0001\uf898\u255b\uf898\u255b\u0001\u0000\u0000\u0001\uf898\u255b\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
