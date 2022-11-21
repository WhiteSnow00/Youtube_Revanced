import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfu extends ahcz implements aheo
{
    public static final alfu a;
    private static volatile ahev c;
    public aknj b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alfu.class, a = new alfu());
    }
    
    private alfu() {
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
                final ahev c;
                if ((c = alfu.c) == null) {
                    synchronized (alfu.class) {
                        if (alfu.c == null) {
                            alfu.c = (ahev)new ahcs((ahcz)alfu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alfu.a;
            }
            case 4: {
                return new ahcr((ahcz)alfu.a);
            }
            case 3: {
                return new alfu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
