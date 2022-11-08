import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankq extends agzi implements ahax
{
    public static final ankq a;
    private static volatile ahbe l;
    public int b;
    public ajsq c;
    public aorm d;
    public aioe e;
    public int f;
    public int g;
    public anss h;
    public ajsq i;
    public agyc j;
    public agzy k;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(ankq.class, a = new ankq());
    }
    
    private ankq() {
        this.n = 2;
        this.j = agyc.b;
        this.k = agzi.emptyProtobufList();
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
                final ahbe l;
                if ((l = ankq.l) == null) {
                    synchronized (ankq.class) {
                        if (ankq.l == null) {
                            ankq.l = (ahbe)new agzb((agzi)ankq.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ankq.a;
            }
            case 4: {
                return new agza((agzi)ankq.a);
            }
            case 3: {
                return new ankq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankq.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u100a\b\n\u041b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "k", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
