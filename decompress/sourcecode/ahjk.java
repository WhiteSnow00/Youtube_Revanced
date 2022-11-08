import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjk extends agzi implements ahax
{
    public static final ahjk a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    public agzy g;
    public ajsq h;
    public aioe i;
    private ajsq k;
    private anss l;
    private anss m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)ahjk.class, (agzi)(a = new ahjk()));
    }
    
    private ahjk() {
        this.o = 2;
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
                final ahbe j;
                if ((j = ahjk.j) == null) {
                    synchronized (ahjk.class) {
                        if (ahjk.j == null) {
                            ahjk.j = (ahbe)new agzb((agzi)ahjk.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahjk.a;
            }
            case 4: {
                return new agza((agzi)ahjk.a);
            }
            case 3: {
                return new ahjk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjk.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0005\u0007\u1409\u0003\b\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\u0007\r\u1409\u0004", new Object[] { "b", "c", "d", "e", "g", ahjj.class, "h", "f", "i", "m", "n", "l", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
