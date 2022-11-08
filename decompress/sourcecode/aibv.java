import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibv extends agzi implements ahax
{
    public static final aibv a;
    private static volatile ahbe x;
    private aibu A;
    private ajsq B;
    private ahfw C;
    private aioe D;
    private aioe E;
    private anss F;
    private aioe G;
    private aioe H;
    private aibx I;
    private aiby J;
    private aioe K;
    private aioe L;
    private aioe M;
    private aibc N;
    private aioe O;
    private anss P;
    private byte Q;
    public int b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public ajsq g;
    public aibq h;
    public aorm i;
    public aioe j;
    public agzy k;
    public ajsq l;
    public aibs m;
    public boolean n;
    public aibw o;
    public agzy p;
    public aibz q;
    public ajsq r;
    public agyc s;
    public aioe t;
    public aibt u;
    public anss v;
    public anss w;
    private aioe y;
    private anss z;
    
    static {
        agzi.registerDefaultInstance((Class)aibv.class, (agzi)(a = new aibv()));
    }
    
    private aibv() {
        this.d = 0;
        this.Q = 2;
        this.f = "";
        this.k = emptyProtobufList();
        this.p = emptyProtobufList();
        this.s = agyc.b;
        emptyProtobufList();
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
                final ahbe x;
                if ((x = aibv.x) == null) {
                    synchronized (aibv.class) {
                        if (aibv.x == null) {
                            aibv.x = (ahbe)new agzb((agzi)aibv.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return aibv.a;
            }
            case 4: {
                return new agza((agzi)aibv.a);
            }
            case 3: {
                return new aibv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibv.a, "\u0001&\u0001\u0002\u0006>&\u0000\u0002!\u0006\u1008\u0002\u0007\u1409\u0004\t\u143c\u0000\r\u041b\u000f\u1409\u000f\u0012\u1409\u0012\u0014\u1009\u0014\u0015\u1409\u0013\u0016\u1409\u0015\u0019\u1409\n\u001a\u1409\u0017\u001b\u100a\u0018\u001c\u1409\u0019\u001d\u1409\u001c\u001e\u1409\u001e \u1409 !\u1409!\"\u1409\"#\u1409#$\u1409$%\u1409\r&\u1007\u0011'\u1409%(\u1409&)\u1409'.\u1009\u0005/\u1409*0\u041b2\u1409\u001a4\u1409\u001b5\u1409\f6\u1409+7\u143c\u00008\u1409,9\u1409-;\u1409\u0003=\u1409\u0016>\u1409\u000e", new Object[] { "e", "d", "b", "c", "f", "y", aorm.class, "k", ahyg.class, "m", "o", "q", "A", "r", "i", "C", "s", "D", "G", "H", "I", "J", "K", "L", "M", "l", "n", "t", "N", "O", "h", "u", "p", aibr.class, "E", "F", "j", "v", anss.class, "w", "P", "g", "B", "z" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.Q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.Q;
            }
        }
    }
}
