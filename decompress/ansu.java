import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansu extends ahcz implements aheo
{
    public static final ansu a;
    private static volatile ahev b;
    private int c;
    private amzj d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ansu.class, a = new ansu());
    }
    
    private ansu() {
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
                if ((b = ansu.b) == null) {
                    synchronized (ansu.class) {
                        if (ansu.b == null) {
                            ansu.b = (ahev)new ahcs((ahcz)ansu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ansu.a;
            }
            case 4: {
                return new ahcr((ahcz)ansu.a);
            }
            case 3: {
                return new ansu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansu.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "c", "d" });
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
