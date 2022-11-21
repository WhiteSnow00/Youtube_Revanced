import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amoy extends ahcz implements aheo
{
    public static final amoy a;
    private static volatile ahev b;
    private int c;
    private ajhb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amoy.class, a = new amoy());
    }
    
    private amoy() {
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
                if ((b = amoy.b) == null) {
                    synchronized (amoy.class) {
                        if (amoy.b == null) {
                            amoy.b = (ahev)new ahcs((ahcz)amoy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amoy.a;
            }
            case 4: {
                return new ahcr((ahcz)amoy.a);
            }
            case 3: {
                return new amoy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amoy.a, "\u0001\u0001\u0000\u0001\ufa55\u30cf\ufa55\u30cf\u0001\u0000\u0000\u0001\ufa55\u30cf\u1409\u0000", new Object[] { "c", "d" });
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
