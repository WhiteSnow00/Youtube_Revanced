import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antp extends ahcz implements aheo
{
    public static final antp a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(antp.class, a = new antp());
    }
    
    private antp() {
        this.e = 2;
        final ahbt b = ahbt.b;
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
                if ((b = antp.b) == null) {
                    synchronized (antp.class) {
                        if (antp.b == null) {
                            antp.b = (ahev)new ahcs((ahcz)antp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antp.a;
            }
            case 4: {
                return new ahcr((ahcz)antp.a);
            }
            case 3: {
                return new antp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antp.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
