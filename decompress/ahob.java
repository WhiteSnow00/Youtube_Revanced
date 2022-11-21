import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahob extends ahcz implements aheo
{
    public static final ahob a;
    private static volatile ahev d;
    public int b;
    public aovw c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahob.class, a = new ahob());
    }
    
    private ahob() {
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
                final ahev d;
                if ((d = ahob.d) == null) {
                    synchronized (ahob.class) {
                        if (ahob.d == null) {
                            ahob.d = (ahev)new ahcs((ahcz)ahob.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahob.a;
            }
            case 4: {
                return new ahcr((ahcz)ahob.a);
            }
            case 3: {
                return new ahob();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahob.a, "\u0001\u0001\u0000\u0001\uede7\u287b\uede7\u287b\u0001\u0000\u0000\u0001\uede7\u287b\u1409\u0000", new Object[] { "b", "c" });
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
