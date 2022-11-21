import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuc extends ahcz implements aheo
{
    public static final anuc a;
    private static volatile ahev b;
    private int c;
    private amzj d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(anuc.class, a = new anuc());
    }
    
    private anuc() {
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
                if ((b = anuc.b) == null) {
                    synchronized (anuc.class) {
                        if (anuc.b == null) {
                            anuc.b = (ahev)new ahcs((ahcz)anuc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anuc.a;
            }
            case 4: {
                return new ahcr((ahcz)anuc.a);
            }
            case 3: {
                return new anuc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuc.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "c", "d" });
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
