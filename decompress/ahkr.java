import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkr extends ahcz implements aheo
{
    public static final ahkr a;
    private static volatile ahev f;
    public ajws b;
    public ajws c;
    public ajws d;
    public ajws e;
    private int g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(ahkr.class, a = new ahkr());
    }
    
    private ahkr() {
        this.i = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahkr.f) == null) {
                    synchronized (ahkr.class) {
                        if (ahkr.f == null) {
                            ahkr.f = (ahev)new ahcs((ahcz)ahkr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahkr.a;
            }
            case 4: {
                return new ahcr((ahcz)ahkr.a);
            }
            case 3: {
                return new ahkr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahkr.a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004\u1409\u0000\u0005\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003\t\u1409\u0004", new Object[] { "g", "b", "c", "d", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
