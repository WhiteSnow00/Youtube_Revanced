import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alna extends ahcz implements aheo
{
    public static final alna a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alna.class, a = new alna());
    }
    
    private alna() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alna.b) == null) {
                    synchronized (alna.class) {
                        if (alna.b == null) {
                            alna.b = (ahev)new ahcs((ahcz)alna.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alna.a;
            }
            case 4: {
                return new ahcr((ahcz)alna.a);
            }
            case 3: {
                return new alna();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alna.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
