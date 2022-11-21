import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amko extends ahcz implements aheo
{
    public static final amko a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ahjl f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amko.class, a = new amko());
    }
    
    private amko() {
        this.h = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
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
                if ((b = amko.b) == null) {
                    synchronized (amko.class) {
                        if (amko.b == null) {
                            amko.b = (ahev)new ahcs((ahcz)amko.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amko.a;
            }
            case 4: {
                return new ahcr((ahcz)amko.a);
            }
            case 3: {
                return new amko();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amko.a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0006\u1409\u0004\n\u1409\u0001", new Object[] { "c", "d", "f", "g", "e" });
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
