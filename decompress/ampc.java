import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampc extends ahcz implements aheo
{
    public static final ampc a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private anxb f;
    private anxb g;
    private anxb h;
    private anxb i;
    private anxb j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(ampc.class, a = new ampc());
    }
    
    private ampc() {
        this.l = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ampc.b) == null) {
                    synchronized (ampc.class) {
                        if (ampc.b == null) {
                            ampc.b = (ahev)new ahcs((ahcz)ampc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampc.a;
            }
            case 4: {
                return new ahcr((ahcz)ampc.a);
            }
            case 3: {
                return new ampc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampc.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\b\u1409\u0005\t\u1409\u0006\n\u1409\u0007", new Object[] { "c", "d", "f", "e", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
