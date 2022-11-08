import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aith extends agzi implements ahax
{
    public static final aith a;
    private static volatile ahbe s;
    private ahyq A;
    private ahyq B;
    private ahfw C;
    private byte D;
    public int b;
    public aorm c;
    public ajsq d;
    public agzy e;
    public ajsq f;
    public ajsq g;
    public agzy h;
    public ajsq i;
    public agzy j;
    public aibc k;
    public agzy l;
    public ajsq m;
    public aioe n;
    public amer o;
    public alvn p;
    public agyc q;
    public boolean r;
    private ajsq t;
    private ajsq u;
    private ajsq v;
    private ajsq w;
    private ajsq x;
    private ajsq y;
    private ahyq z;
    
    static {
        agzi.registerDefaultInstance(aith.class, a = new aith());
    }
    
    private aith() {
        this.D = 2;
        this.e = agzi.emptyProtobufList();
        this.h = agzi.emptyProtobufList();
        this.j = agzi.emptyProtobufList();
        this.l = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = agyc.b;
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
                final ahbe s;
                if ((s = aith.s) == null) {
                    synchronized (aith.class) {
                        if (aith.s == null) {
                            aith.s = (ahbe)new agzb((agzi)aith.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aith.a;
            }
            case 4: {
                return new agza((agzi)aith.a);
            }
            case 3: {
                return new aith();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aith.a, "\u0001\u001a\u0000\u0001\u0002\"\u001a\u0000\u0004\u0017\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\t\u0005\u1409\n\u0007\u1409\f\b\u1409\r\t\u1409\u0010\n\u1409\u0011\u000e\u1409\u0018\u0010\u100a\u0019\u0012\u1409\u000e\u0013\u1409\u0015\u0014\u1409\u0013\u0015\u1409\u0012\u0016\u1409\u0014\u0017\u1009\u0016\u0018\u041b\u0019\u1409\u0004\u001a\u1409\u0005\u001b\u1409\u0006\u001c\u041b\u001d\u1007\u001a\u001e\u041b\u001f\u041b \u1409\u000f\"\u1409\b", new Object[] { "b", "c", "d", "t", "u", "v", "w", "m", "n", "C", "q", "x", "o", "A", "z", "B", "p", "e", ahyq.class, "f", "g", "i", "l", ahyq.class, "r", "h", ajsq.class, "j", ajsq.class, "y", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.D = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
