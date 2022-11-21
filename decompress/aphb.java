import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphb extends ahcz implements aheo
{
    public static final aphb a;
    private static volatile ahev b;
    private int c;
    private aphf d;
    private amsh e;
    private aphf f;
    private amsh g;
    private amsh h;
    private amsh i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aphb.class, a = new aphb());
    }
    
    private aphb() {
        this.k = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphb.b) == null) {
                    synchronized (aphb.class) {
                        if (aphb.b == null) {
                            aphb.b = (ahev)new ahcs((ahcz)aphb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphb.a;
            }
            case 4: {
                return new ahcr((ahcz)aphb.a);
            }
            case 3: {
                return new aphb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphb.a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\t\u1409\b\n\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "i", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
