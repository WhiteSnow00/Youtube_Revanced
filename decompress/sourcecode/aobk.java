import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobk extends agzd implements agze
{
    public static final aobk a;
    private static volatile ahbe w;
    private anss A;
    private aokb B;
    private aobl C;
    private ajqn D;
    private aioe E;
    private ahfw F;
    private aobj G;
    private ajuy H;
    private byte I;
    public int b;
    public int c;
    public int d;
    public Object e;
    public ajsq f;
    public ajsq g;
    public aobg h;
    public anss i;
    public ajsq j;
    public aorm k;
    public boolean m;
    public aobb n;
    public aioe o;
    public aobh p;
    public agzy q;
    public aobm r;
    public int s;
    public agzy t;
    public agyc u;
    public ajkm v;
    private ajsq x;
    private aioe y;
    private aobi z;
    
    static {
        agzi.registerDefaultInstance(aobk.class, (agzi)(a = new aobk()));
    }
    
    private aobk() {
        this.d = 0;
        this.I = 2;
        this.q = emptyProtobufList();
        emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = agyc.b;
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
                final ahbe w;
                if ((w = aobk.w) == null) {
                    synchronized (aobk.class) {
                        if (aobk.w == null) {
                            aobk.w = (ahbe)new agzb((agzi)aobk.a);
                        }
                    }
                }
                return w;
            }
            case 5: {
                return aobk.a;
            }
            case 4: {
                return new agzc((agzd)aobk.a);
            }
            case 3: {
                return new aobk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aobk.a, "\u0001\u001e\u0001\u0002\u00010\u001e\u0000\u0002\u0016\u0001\u1409\u0000\u0002\u1409\u0006\u0003\u1409\r\u0004\u1409\u000e\u0005\u1409\u0016\u0006\u1409\u0011\t\u1409\u0005\u000b\u1409\u001a\f\u1409\u0001\u000e\u1409\u0004\u000f\u100a\u001b\u0011\u1409\u0019\u0013\u1409\u0015\u0015\u1409\u0014\u0017\u1007\n\u0018\u1409\u001e\u0019\u1409\u001f\u001a\u041b\u001b\u1009\u0002\u001c\u041b\u001d\u1409\u0012\u001e\u1409\f\u001f\u1409\u000f$\u1409\u0003'\u1409\u0010)\u1009%+\u100c\u0017-\u103e\u0000.\u103e\u00000\u103c\u0000", new Object[] { "e", "d", "b", "c", "f", "k", "o", "y", "r", "B", "j", "F", "g", "x", "u", "E", "p", "D", "m", "G", "H", "q", aobc.class, "h", "t", aioe.class, "C", "n", "z", "i", "A", "v", "s", anvq.r, aobo.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.I = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.I;
            }
        }
    }
}
