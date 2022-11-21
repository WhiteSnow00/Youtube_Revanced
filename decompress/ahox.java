import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahox extends ahcz implements aheo
{
    public static final ahox a;
    private static volatile ahev b;
    private int c;
    private ahoy d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahox.class, a = new ahox());
    }
    
    private ahox() {
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
                if ((b = ahox.b) == null) {
                    synchronized (ahox.class) {
                        if (ahox.b == null) {
                            ahox.b = (ahev)new ahcs((ahcz)ahox.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahox.a;
            }
            case 4: {
                return new ahcr((ahcz)ahox.a);
            }
            case 3: {
                return new ahox();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahox.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
