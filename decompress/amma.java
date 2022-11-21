import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amma extends ahcz implements aheo
{
    public static final amma a;
    private static volatile ahev b;
    private int c;
    private amme d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amma.class, a = new amma());
    }
    
    private amma() {
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
                if ((b = amma.b) == null) {
                    synchronized (amma.class) {
                        if (amma.b == null) {
                            amma.b = (ahev)new ahcs((ahcz)amma.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amma.a;
            }
            case 4: {
                return new ahcr((ahcz)amma.a);
            }
            case 3: {
                return new amma();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amma.a, "\u0001\u0001\u0000\u0001\ufb1d\u4447\ufb1d\u4447\u0001\u0000\u0000\u0001\ufb1d\u4447\u1409\u0000", new Object[] { "c", "d" });
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
