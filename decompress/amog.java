import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amog extends ahcz implements aheo
{
    public static final amog a;
    private static volatile ahev b;
    private int c;
    private amoh d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amog.class, a = new amog());
    }
    
    private amog() {
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
                if ((b = amog.b) == null) {
                    synchronized (amog.class) {
                        if (amog.b == null) {
                            amog.b = (ahev)new ahcs((ahcz)amog.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amog.a;
            }
            case 4: {
                return new ahcr((ahcz)amog.a);
            }
            case 3: {
                return new amog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amog.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
