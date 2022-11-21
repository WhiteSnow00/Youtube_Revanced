import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampj extends ahcz implements aheo
{
    public static final ampj a;
    private static volatile ahev b;
    private int c;
    private amzj d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ampj.class, a = new ampj());
    }
    
    private ampj() {
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
                if ((b = ampj.b) == null) {
                    synchronized (ampj.class) {
                        if (ampj.b == null) {
                            ampj.b = (ahev)new ahcs((ahcz)ampj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampj.a;
            }
            case 4: {
                return new ahcr((ahcz)ampj.a);
            }
            case 3: {
                return new ampj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampj.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "c", "d" });
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
