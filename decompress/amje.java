import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amje extends ahcz implements aheo
{
    public static final amje a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amje.class, a = new amje());
    }
    
    private amje() {
        this.f = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amje.b) == null) {
                    synchronized (amje.class) {
                        if (amje.b == null) {
                            amje.b = (ahev)new ahcs((ahcz)amje.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amje.a;
            }
            case 4: {
                return new ahcr((ahcz)amje.a);
            }
            case 3: {
                return new amje();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amje.a, "\u0001\u0002\u0000\u0001\b\u000b\u0002\u0000\u0000\u0002\b\u1409\r\u000b\u1409\u000b", new Object[] { "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
