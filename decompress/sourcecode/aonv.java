import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonv extends agzi implements ahax
{
    public static final aonv a;
    private static volatile ahbe k;
    public int b;
    public int c;
    public ajsq d;
    public agzy e;
    public agzy f;
    public agzy g;
    public anss h;
    public aorm i;
    public anss j;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)aonv.class, (agzi)(a = new aonv()));
    }
    
    private aonv() {
        this.m = 2;
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
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
                final ahbe k;
                if ((k = aonv.k) == null) {
                    synchronized (aonv.class) {
                        if (aonv.k == null) {
                            aonv.k = (ahbe)new agzb((agzi)aonv.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aonv.a;
            }
            case 4: {
                return new agza((agzi)aonv.a);
            }
            case 3: {
                return new aonv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonv.a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\b\u0001\u100b\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u041b\u0005\u041b\u0006\u1409\u0002\u0007\u1409\u0003\t\u1409\u0005\f\u1409\b", new Object[] { "b", "c", "d", "e", aioe.class, "f", aioe.class, "g", aioe.class, "h", "i", "j", "l" });
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
