import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwy extends agzi implements ahax
{
    public static final ajwy a;
    private static volatile ahbe n;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public aioe i;
    public ajwz j;
    public agzy k;
    public amer l;
    public agyc m;
    private ajuy o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(ajwy.class, a = new ajwy());
    }
    
    private ajwy() {
        this.q = 2;
        this.k = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.m = agyc.b;
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
                if ((n = ajwy.n) == null) {
                    synchronized (ajwy.class) {
                        if (ajwy.n == null) {
                            ajwy.n = (ahbe)new agzb((agzi)ajwy.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajwy.a;
            }
            case 4: {
                return new agza((agzi)ajwy.a);
            }
            case 3: {
                return new ajwy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwy.a, "\u0001\r\u0000\u0001\u0002\u0015\r\u0000\u0001\f\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0007\t\u1409\u0002\n\u1409\r\u000b\u1409\b\f\u041b\u000e\u100a\u000e\u0010\u1409\t\u0011\u1409\n\u0014\u1409\u0005\u0015\u1409\u0006", new Object[] { "b", "c", "e", "f", "i", "d", "p", "j", "k", ahyg.class, "m", "l", "o", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
