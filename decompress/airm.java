import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airm extends ahcz implements aheo
{
    public static final airm a;
    private static volatile ahev i;
    public int b;
    public String c;
    public akfj d;
    public ajws e;
    public ajws f;
    public ajws g;
    public ajws h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(airm.class, a = new airm());
    }
    
    private airm() {
        this.j = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = airm.i) == null) {
                    synchronized (airm.class) {
                        if (airm.i == null) {
                            airm.i = (ahev)new ahcs((ahcz)airm.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return airm.a;
            }
            case 4: {
                return new ahcr((ahcz)airm.a);
            }
            case 3: {
                return new airm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
