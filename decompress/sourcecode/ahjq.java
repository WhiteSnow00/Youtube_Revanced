import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjq extends agzi implements ahax
{
    public static final ahjq a;
    private static volatile ahbe j;
    public int b;
    public aorm c;
    public aorm d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public aioe h;
    public agyc i;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)ahjq.class, (agzi)(a = new ahjq()));
    }
    
    private ahjq() {
        this.l = 2;
        this.i = agyc.b;
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
                final ahbe j;
                if ((j = ahjq.j) == null) {
                    synchronized (ahjq.class) {
                        if (ahjq.j == null) {
                            ahjq.j = (ahbe)new agzb((agzi)ahjq.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahjq.a;
            }
            case 4: {
                return new agza((agzi)ahjq.a);
            }
            case 3: {
                return new ahjq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjq.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
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
