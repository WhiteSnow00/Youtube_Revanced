import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amoo extends ahcz implements aheo
{
    public static final amoo a;
    private static volatile ahev b;
    private int c;
    private amom d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amoo.class, a = new amoo());
    }
    
    private amoo() {
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
                if ((b = amoo.b) == null) {
                    synchronized (amoo.class) {
                        if (amoo.b == null) {
                            amoo.b = (ahev)new ahcs((ahcz)amoo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amoo.a;
            }
            case 4: {
                return new ahcr((ahcz)amoo.a);
            }
            case 3: {
                return new amoo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amoo.a, "\u0001\u0001\u0000\u0001\uef1f\u4118\uef1f\u4118\u0001\u0000\u0000\u0001\uef1f\u4118\u1409\u0000", new Object[] { "c", "d" });
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
