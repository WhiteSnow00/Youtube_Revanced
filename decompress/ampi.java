import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampi extends ahcz implements aheo
{
    public static final ampi a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private amiy g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(ampi.class, a = new ampi());
    }
    
    private ampi() {
        this.i = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ampi.b) == null) {
                    synchronized (ampi.class) {
                        if (ampi.b == null) {
                            ampi.b = (ahev)new ahcs((ahcz)ampi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampi.a;
            }
            case 4: {
                return new ahcr((ahcz)ampi.a);
            }
            case 3: {
                return new ampi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampi.a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0007\b\u1409\u0006", new Object[] { "c", "d", "e", "f", "h", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
