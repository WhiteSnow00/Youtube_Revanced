import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkr extends ahcz implements aheo
{
    public static final amkr a;
    private static volatile ahev b;
    private int c;
    private alht d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amkr.class, a = new amkr());
    }
    
    private amkr() {
        this.e = 2;
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
                if ((b = amkr.b) == null) {
                    synchronized (amkr.class) {
                        if (amkr.b == null) {
                            amkr.b = (ahev)new ahcs((ahcz)amkr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkr.a;
            }
            case 4: {
                return new ahcr((ahcz)amkr.a);
            }
            case 3: {
                return new amkr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkr.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "c", "d" });
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
