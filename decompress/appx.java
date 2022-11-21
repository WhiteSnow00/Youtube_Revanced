import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appx extends ahcz implements aheo
{
    public static final appx a;
    private static volatile ahev b;
    private int c;
    private aooo d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(appx.class, a = new appx());
    }
    
    private appx() {
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
                if ((b = appx.b) == null) {
                    synchronized (appx.class) {
                        if (appx.b == null) {
                            appx.b = (ahev)new ahcs((ahcz)appx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appx.a;
            }
            case 4: {
                return new ahcr((ahcz)appx.a);
            }
            case 3: {
                return new appx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appx.a, "\u0001\u0001\u0000\u0001\ue2d9\u1a6d\ue2d9\u1a6d\u0001\u0000\u0000\u0001\ue2d9\u1a6d\u1409\u0000", new Object[] { "c", "d" });
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
