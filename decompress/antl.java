import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antl extends ahcz implements aheo
{
    public static final antl a;
    private static volatile ahev m;
    public int b;
    public aiet c;
    public ajws d;
    public ajws e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aiet l;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(antl.class, a = new antl());
    }
    
    private antl() {
        this.n = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = antl.m) == null) {
                    synchronized (antl.class) {
                        if (antl.m == null) {
                            antl.m = (ahev)new ahcs((ahcz)antl.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return antl.a;
            }
            case 4: {
                return new ahcr((ahcz)antl.a);
            }
            case 3: {
                return new antl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antl.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1004\b\n\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
