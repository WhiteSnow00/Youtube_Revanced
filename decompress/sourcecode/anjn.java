import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjn extends agzd implements agze
{
    public static final anjn a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private ahfw e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(anjn.class, (agzi)(a = new anjn()));
    }
    
    private anjn() {
        this.g = 2;
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
                if ((b2 = anjn.b) == null) {
                    synchronized (anjn.class) {
                        if (anjn.b == null) {
                            anjn.b = (ahbe)new agzb((agzi)anjn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anjn.a;
            }
            case 4: {
                return new agzc((agzd)anjn.a);
            }
            case 3: {
                return new anjn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anjn.a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
