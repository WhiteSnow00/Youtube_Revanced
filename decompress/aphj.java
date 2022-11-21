import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphj extends ahcz implements aheo
{
    public static final aphj a;
    private static volatile ahev b;
    private int c;
    private aooo d;
    private ajmu e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aphj.class, a = new aphj());
    }
    
    private aphj() {
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
                if ((b = aphj.b) == null) {
                    synchronized (aphj.class) {
                        if (aphj.b == null) {
                            aphj.b = (ahev)new ahcs((ahcz)aphj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphj.a;
            }
            case 4: {
                return new ahcr((ahcz)aphj.a);
            }
            case 3: {
                return new aphj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphj.a, "\u0001\u0002\u0000\u0001\ue2d9\u1a6d\uf470\u39db\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u1409\u0000\uf470\u39db\u1409\u0001", new Object[] { "c", "d", "e" });
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
