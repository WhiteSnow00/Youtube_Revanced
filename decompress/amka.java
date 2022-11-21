import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amka extends ahcz implements aheo
{
    public static final amka a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amka.class, a = new amka());
    }
    
    private amka() {
        this.e = 2;
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
                if ((b = amka.b) == null) {
                    synchronized (amka.class) {
                        if (amka.b == null) {
                            amka.b = (ahev)new ahcs((ahcz)amka.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amka.a;
            }
            case 4: {
                return new ahcr((ahcz)amka.a);
            }
            case 3: {
                return new amka();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amka.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
