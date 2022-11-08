import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivb extends agzi implements ahax
{
    public static final aivb a;
    private static volatile ahbe j;
    public ajsq b;
    public aorm c;
    public akbf d;
    public ajsq e;
    public ajsq f;
    public agzy g;
    public aibc h;
    public aibc i;
    private int k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(aivb.class, a = new aivb());
    }
    
    private aivb() {
        this.m = 2;
        this.g = agzi.emptyProtobufList();
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
                final ahbe j;
                if ((j = aivb.j) == null) {
                    synchronized (aivb.class) {
                        if (aivb.j == null) {
                            aivb.j = (ahbe)new agzb((agzi)aivb.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aivb.a;
            }
            case 4: {
                return new agza((agzi)aivb.a);
            }
            case 3: {
                return new aivb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivb.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u1409\u0006\n\u1409\b", new Object[] { "k", "b", "c", "d", "e", "f", "g", ajsq.class, "h", "i", "l" });
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
