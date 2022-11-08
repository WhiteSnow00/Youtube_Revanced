import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikl extends agzi implements ahax
{
    public static final aikl a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private aioe j;
    private aioe k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(aikl.class, a = new aikl());
    }
    
    private aikl() {
        this.m = 2;
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
                final ahbe b2;
                if ((b2 = aikl.b) == null) {
                    synchronized (aikl.class) {
                        if (aikl.b == null) {
                            aikl.b = (ahbe)new agzb((agzi)aikl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aikl.a;
            }
            case 4: {
                return new agza((agzi)aikl.a);
            }
            case 3: {
                return new aikl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikl.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\b\t\u1409\u0006\n\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "l", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
