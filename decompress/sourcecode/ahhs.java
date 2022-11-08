import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhs extends agzi implements ahax
{
    public static final ahhs a;
    private static volatile ahbe n;
    public int b;
    public agyc c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public aorm g;
    public anss h;
    public boolean i;
    public boolean j;
    public aioe k;
    public int l;
    public aorm m;
    private ahfw o;
    private ajsq p;
    private ajsq q;
    private ahic r;
    private ajsq s;
    private ahhq t;
    private byte u;
    
    static {
        agzi.registerDefaultInstance(ahhs.class, a = new ahhs());
    }
    
    private ahhs() {
        this.u = 2;
        this.c = agyc.b;
        emptyProtobufList();
        emptyIntList();
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
                final ahbe n;
                if ((n = ahhs.n) == null) {
                    synchronized (ahhs.class) {
                        if (ahhs.n == null) {
                            ahhs.n = (ahbe)new agzb((agzi)ahhs.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ahhs.a;
            }
            case 4: {
                return new agza((agzi)ahhs.a);
            }
            case 3: {
                return new ahhs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhs.a, "\u0001\u0011\u0000\u0001\u0001\u001a\u0011\u0000\u0000\r\u0001\u1409\u0000\u0002\u100a\u0001\u0004\u1409\u0002\u0005\u1409\u0015\u0006\u1409\u0006\u0007\u1007\b\b\u1007\t\t\u1409\u0016\f\u1409\n\r\u1409\u0005\u000f\u1409\f\u0010\u100c\r\u0011\u1409\u000e\u0013\u1409\u0007\u0015\u1409\u0011\u0019\u1409\u0003\u001a\u1409\u0004", new Object[] { "b", "o", "c", "d", "t", "g", "i", "j", "m", "k", "f", "q", "l", akbe.a(), "r", "h", "s", "p", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.u = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
