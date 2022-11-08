import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqb extends agzi implements ahax
{
    public static final ajqb a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public aioe e;
    public aorm f;
    public ajqa g;
    public agyc h;
    private anss j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)ajqb.class, (agzi)(a = new ajqb()));
    }
    
    private ajqb() {
        this.l = 2;
        emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = ajqb.i) == null) {
                    synchronized (ajqb.class) {
                        if (ajqb.i == null) {
                            ajqb.i = (ahbe)new agzb((agzi)ajqb.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajqb.a;
            }
            case 4: {
                return new agza((agzi)ajqb.a);
            }
            case 3: {
                return new ajqb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajqb.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u100a\u0007\t\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "g", "k", "h", "j" });
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
