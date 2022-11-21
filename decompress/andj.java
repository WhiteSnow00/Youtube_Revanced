import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andj extends ahcz implements aheo
{
    public static final andj a;
    private static volatile ahev b;
    private int c;
    private andi d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(andj.class, a = new andj());
    }
    
    private andj() {
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
                if ((b = andj.b) == null) {
                    synchronized (andj.class) {
                        if (andj.b == null) {
                            andj.b = (ahev)new ahcs((ahcz)andj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andj.a;
            }
            case 4: {
                return new ahcr((ahcz)andj.a);
            }
            case 3: {
                return new andj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)andj.a, "\u0001\u0001\u0000\u0001\uef4b\u3c9d\uef4b\u3c9d\u0001\u0000\u0000\u0001\uef4b\u3c9d\u1409\u0000", new Object[] { "c", "d" });
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
