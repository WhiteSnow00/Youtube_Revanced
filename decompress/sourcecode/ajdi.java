import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdi extends agzi implements ahax
{
    private static volatile ahbe C;
    public static final ajdi a;
    public String A;
    public agyc B;
    private int D;
    private ajsq E;
    private ajsq F;
    private ajsq G;
    private ajsq H;
    private ajsq I;
    private ajsq J;
    private ahfw K;
    private byte L;
    public int b;
    public int c;
    public int d;
    public ajsq e;
    public ajsq f;
    public aorm g;
    public aibc h;
    public float i;
    public ajsq j;
    public ajsq k;
    public ajsq l;
    public ajsq m;
    public aibc n;
    public ajsq o;
    public ajsq p;
    public ajsq q;
    public agzy r;
    public agzy s;
    public ajsq t;
    public ajsq u;
    public long v;
    public long w;
    public ajsq x;
    public ajsq y;
    public boolean z;
    
    static {
        agzi.registerDefaultInstance(ajdi.class, a = new ajdi());
    }
    
    private ajdi() {
        this.L = 2;
        this.r = agzi.emptyProtobufList();
        this.s = agzi.emptyProtobufList();
        this.A = "";
        this.B = agyc.b;
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
                final ahbe c;
                if ((c = ajdi.C) == null) {
                    synchronized (ajdi.class) {
                        if (ajdi.C == null) {
                            ajdi.C = (ahbe)new agzb((agzi)ajdi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajdi.a;
            }
            case 4: {
                return new agza((agzi)ajdi.a);
            }
            case 3: {
                return new ajdi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdi.a, "\u0001!\u0000\u0002\u0001'!\u0000\u0002\u0019\u0001\u1409\u0006\u0002\u1409\u0007\u0003\u1409\b\u0004\u1409\n\u0005\u1001\u000b\u0006\u1409\f\u0007\u1409\r\b\u1409\u0010\t\u1409 \n\u100a!\f\u1409\u0014\r\u1409\t\u000e\u1409\u0011\u000f\u1409\u0012\u0010\u1409\u0013\u0013\u1409\u0015\u0014\u1409\u0016\u0015\u041b\u0016\u041b\u0017\u1409\u0017\u0018\u1409\u0018\u0019\u1002\u0019\u001a\u1002\u001a\u001b\u1409\u001b\u001c\u1409\u001c\u001d\u1409\u000e\u001f\u1409\u0001\"\u1409\u000f#\u1008\u001f$\u1409\u001d%\u1007\u001e&\u100b\u0004'\u100b\u0005", new Object[] { "b", "D", "e", "f", "g", "h", "i", "j", "k", "n", "K", "B", "G", "F", "o", "p", "q", "H", "I", "s", ajdk.class, "r", ajdg.class, "t", "u", "v", "w", "x", "J", "l", "E", "m", "A", "y", "z", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.L = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.L;
            }
        }
    }
}
