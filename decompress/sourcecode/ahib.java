import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahib extends agzi implements ahax
{
    public static final ahib a;
    private static volatile ahbe p;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aorm f;
    public ajsq g;
    public anss h;
    public aioe i;
    public agzy j;
    public anss k;
    public anss l;
    public anss m;
    public anss n;
    public agyc o;
    private aioe q;
    private aioe r;
    private aioe s;
    private ahia t;
    private ahfw u;
    private byte v;
    
    static {
        agzi.registerDefaultInstance(ahib.class, a = new ahib());
    }
    
    private ahib() {
        this.v = 2;
        this.j = agzi.emptyProtobufList();
        this.o = agyc.b;
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
                final ahbe p3;
                if ((p3 = ahib.p) == null) {
                    synchronized (ahib.class) {
                        if (ahib.p == null) {
                            ahib.p = (ahbe)new agzb((agzi)ahib.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahib.a;
            }
            case 4: {
                return new agza((agzi)ahib.a);
            }
            case 3: {
                return new ahib();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahib.a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0011\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\u000b\u0007\u041b\b\u1409\t\t\u1409\u0001\n\u1409\n\u000b\u1409\u0005\r\u1409\f\u000e\u1409\r\u000f\u1409\u000f\u0010\u1409\u0010\u0011\u100a\u0011\u0012\u1409\u0006\u0013\u1409\u000e\u0014\u1409\u0002", new Object[] { "b", "c", "f", "q", "r", "t", "j", ajsq.class, "i", "d", "s", "g", "k", "l", "n", "u", "o", "h", "m", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.v = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
