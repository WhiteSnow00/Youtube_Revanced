import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprm extends ahcz implements aheo
{
    public static final aprm a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public ajws d;
    private ajws f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aprm.class, a = new aprm());
    }
    
    private aprm() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aprm.e) == null) {
                    synchronized (aprm.class) {
                        if (aprm.e == null) {
                            aprm.e = (ahev)new ahcs((ahcz)aprm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aprm.a;
            }
            case 4: {
                return new ahcr((ahcz)aprm.a);
            }
            case 3: {
                return new aprm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprm.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1409\u0001\u0005\u1409\u0002", new Object[] { "b", "c", "g", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
