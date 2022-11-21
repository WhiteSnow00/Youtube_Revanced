import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprv extends ahcz implements aheo
{
    public static final aprv a;
    private static volatile ahev l;
    public int b;
    public String c;
    public ajws d;
    public int e;
    public ajws f;
    public int g;
    public ajws h;
    public String i;
    public ajws j;
    public int k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aprv.class, a = new aprv());
    }
    
    private aprv() {
        this.m = 2;
        this.c = "";
        this.i = "";
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
                final ahev l;
                if ((l = aprv.l) == null) {
                    synchronized (aprv.class) {
                        if (aprv.l == null) {
                            aprv.l = (ahev)new ahcs((ahcz)aprv.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aprv.a;
            }
            case 4: {
                return new ahcr((ahcz)aprv.a);
            }
            case 3: {
                return new aprv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprv.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1008\u0006\u0006\u1409\u0007\u0007\u100b\u0002\b\u100b\u0004\t\u100b\b", new Object[] { "b", "c", "d", "f", "h", "i", "j", "e", "g", "k" });
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
