import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonn extends agzi implements ahax
{
    public static final aonn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private anss f;
    private aioe g;
    private aioe h;
    private aioe i;
    private ajsq j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aonn.class, (agzi)(a = new aonn()));
    }
    
    private aonn() {
        this.l = 2;
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aonn.b) == null) {
                    synchronized (aonn.class) {
                        if (aonn.b == null) {
                            aonn.b = (ahbe)new agzb((agzi)aonn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aonn.a;
            }
            case 4: {
                return new agza((agzi)aonn.a);
            }
            case 3: {
                return new aonn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonn.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
