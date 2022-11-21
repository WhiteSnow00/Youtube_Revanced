import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amks extends ahcz implements aheo
{
    public static final amks a;
    private static volatile ahev i;
    public int b;
    public amkp c;
    public amkp d;
    public amku e;
    public amkp f;
    public ajws g;
    public amkp h;
    private amkr j;
    private amkp k;
    private anxb l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(amks.class, a = new amks());
    }
    
    private amks() {
        this.m = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = amks.i) == null) {
                    synchronized (amks.class) {
                        if (amks.i == null) {
                            amks.i = (ahev)new ahcs((ahcz)amks.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amks.a;
            }
            case 4: {
                return new ahcr((ahcz)amks.a);
            }
            case 3: {
                return new amks();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amks.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "b", "j", "c", "k", "d", "e", "f", "l", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
