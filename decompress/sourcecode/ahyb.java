import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyb extends agzi implements ahax
{
    public static final ahyb a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public aorm e;
    public ajsq f;
    public ajsq g;
    public anss h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahyb.class, a = new ahyb());
    }
    
    private ahyb() {
        this.k = 2;
        final agyc b = agyc.b;
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
                final ahbe i;
                if ((i = ahyb.i) == null) {
                    synchronized (ahyb.class) {
                        if (ahyb.i == null) {
                            ahyb.i = (ahbe)new agzb((agzi)ahyb.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahyb.a;
            }
            case 4: {
                return new agza((agzi)ahyb.a);
            }
            case 3: {
                return new ahyb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyb.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j" });
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
