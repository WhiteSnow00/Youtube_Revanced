import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appn extends ahcz implements aheo
{
    public static final appn a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(appn.class, a = new appn());
    }
    
    private appn() {
        this.f = 2;
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
                if ((b = appn.b) == null) {
                    synchronized (appn.class) {
                        if (appn.b == null) {
                            appn.b = (ahev)new ahcs((ahcz)appn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appn.a;
            }
            case 4: {
                return new ahcr((ahcz)appn.a);
            }
            case 3: {
                return new appn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appn.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
