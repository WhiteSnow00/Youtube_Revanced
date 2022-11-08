import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxs extends agzd implements agze
{
    private static volatile ahbe A;
    public static final ajxs a;
    private ajsq B;
    private ajsq C;
    private aioe D;
    private aioe E;
    private ajuy F;
    private ahfw G;
    private byte H;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsm f;
    public aorm g;
    public ajsq h;
    public ajsq i;
    public ajsq j;
    public ajsq k;
    public aioe m;
    public apdo n;
    public agzy o;
    public agzy p;
    public ahyq q;
    public ahyq r;
    public ahyq s;
    public ajxr t;
    public boolean u;
    public agzy v;
    public amer w;
    public alvq x;
    public apin y;
    public agyc z;
    
    static {
        agzi.registerDefaultInstance((Class)ajxs.class, (agzi)(a = new ajxs()));
    }
    
    private ajxs() {
        this.H = 2;
        this.o = emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.v = emptyProtobufList();
        emptyProtobufList();
        this.z = agyc.b;
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
                final ahbe a2;
                if ((a2 = ajxs.A) == null) {
                    synchronized (ajxs.class) {
                        if (ajxs.A == null) {
                            ajxs.A = (ahbe)new agzb((agzi)ajxs.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return ajxs.a;
            }
            case 4: {
                return new agzc(ajxs.a);
            }
            case 3: {
                return new ajxs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxs.a, "\u0001\u001d\u0000\u0001\u0002'\u001d\u0000\u0003\u0018\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0007\u0006\u1409\b\u0007\u1409\n\b\u1409\f\n\u1409\u0004\u000b\u1409\u001c\f\u1409\u000e\r\u041b\u000e\u1409\u0006\u000f\u041b\u0011\u100a\u001e\u0014\u1409\u0013\u0016\u1409\t\u0017\u1007\u0015\u0018\u1409\u0017\u0019\u1409\u0010\u001a\u1409\u0018\u001c\u041b\u001d\u1409\u000f\u001e\u1409\u0011\u001f\u1409\u0012\"\u1009\u001a$\u1009\u0005%\u1009\u001b&\u1409\r'\u1409\u000b", new Object[] { "b", "c", "d", "B", "h", "i", "k", "m", "e", "G", "n", "o", ahyg.class, "g", "p", ahyg.class, "z", "t", "j", "u", "w", "r", "F", "v", aora.class, "q", "s", "E", "x", "f", "y", "D", "C" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.H = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.H;
            }
        }
    }
}
