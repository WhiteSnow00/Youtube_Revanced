import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxg extends agzi implements ahax
{
    public static final ajxg a;
    private static volatile ahbe o;
    public int b;
    public anig c;
    public aorm d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public aioe i;
    public agzy j;
    public amer k;
    public alvq l;
    public agyc m;
    public agzy n;
    private ajsq p;
    private ajsq q;
    private aioe r;
    private ajsq s;
    private ahfw t;
    private ajsq u;
    private ajxf v;
    private ally w;
    private ajuy x;
    private byte y;
    
    static {
        agzi.registerDefaultInstance(ajxg.class, a = new ajxg());
    }
    
    private ajxg() {
        this.y = 2;
        emptyProtobufList();
        emptyProtobufList();
        this.j = agzi.emptyProtobufList();
        emptyProtobufList();
        this.m = agyc.b;
        this.n = agzi.emptyProtobufList();
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
                final ahbe o3;
                if ((o3 = ajxg.o) == null) {
                    synchronized (ajxg.class) {
                        if (ajxg.o == null) {
                            ajxg.o = (ahbe)new agzb((agzi)ajxg.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajxg.a;
            }
            case 4: {
                return new agza((agzi)ajxg.a);
            }
            case 3: {
                return new ajxg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxg.a, "\u0001\u0015\u0000\u0001\u0002\u001a\u0015\u0000\u0002\u0013\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1409\u0007\u0006\u1409\t\b\u1409\u000b\t\u1409\b\n\u1409\u000f\u000b\u100a\u0010\u000e\u1409\u0011\u0010\u1409\u0001\u0011\u1409\u0006\u0012\u1409\f\u0013\u1409\u0012\u0014\u1409\u0013\u0015\u041b\u0016\u1409\u0014\u0017\u041b\u0018\u1009\r\u0019\u1409\n\u001a\u1409\u0004", new Object[] { "b", "d", "e", "f", "g", "i", "s", "h", "t", "m", "u", "c", "q", "k", "v", "w", "j", ahyg.class, "x", "n", aora.class, "l", "r", "p" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.y = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
