import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahun extends agzi implements ahax
{
    public static final ahun a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public ajsq d;
    public int e;
    public aorm f;
    public apgo g;
    public ajsq h;
    public ajsq i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahun.class, a = new ahun());
    }
    
    private ahun() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = ahun.j) == null) {
                    synchronized (ahun.class) {
                        if (ahun.j == null) {
                            ahun.j = (ahbe)new agzb((agzi)ahun.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahun.a;
            }
            case 4: {
                return new agza((agzi)ahun.a);
            }
            case 3: {
                return new ahun();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahun.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1004\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
