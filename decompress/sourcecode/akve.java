import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akve extends agzd implements agze
{
    private static volatile ahbe R;
    public static final akve a;
    public agzy A;
    public ancc B;
    public akur C;
    public akuy D;
    public akcg E;
    public ahvy F;
    public agzy G;
    public agzy H;
    public anss I;
    public ainb J;
    public ahhb K;
    public akvf L;
    public agzy M;
    public anss N;
    public agzy O;
    public ajaz P;
    public ajtl Q;
    private ahfw S;
    private aonl T;
    private byte U;
    public int b;
    public int c;
    public akjf d;
    public ancd e;
    public akuv f;
    public akvk g;
    public akvi h;
    public akuo i;
    public akuw j;
    public amth k;
    public agzy m;
    public aicr n;
    public agzy o;
    public akvh p;
    public anss q;
    public akcr r;
    public akuk s;
    public akvl t;
    public agzy u;
    public agyc v;
    public String w;
    public String x;
    public ajna y;
    public agzy z;
    
    static {
        agzi.registerDefaultInstance((Class)akve.class, (agzi)(a = new akve()));
    }
    
    private akve() {
        this.U = 2;
        this.m = emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
        this.u = emptyProtobufList();
        this.v = agyc.b;
        this.w = "";
        this.x = "";
        this.z = emptyProtobufList();
        this.A = emptyProtobufList();
        this.G = emptyProtobufList();
        emptyProtobufList();
        this.H = emptyProtobufList();
        this.M = emptyProtobufList();
        this.O = emptyProtobufList();
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
                final ahbe r;
                if ((r = akve.R) == null) {
                    synchronized (akve.class) {
                        if (akve.R == null) {
                            akve.R = (ahbe)new agzb((agzi)akve.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return akve.a;
            }
            case 4: {
                return new agzc(akve.a);
            }
            case 3: {
                return new akve();
            }
            case 2: {
                return newMessageInfo((MessageLite)akve.a, "\u0001)\u0000\u0002\u0001\u0309)\u0000\t!\u0001\u1409\u0000\u0002\u1409\u0002\u0004\u1409\u0004\u0006\u1009\u0005\u0007\u041b\t\u1009\u0006\n\u1409\b\u000b\u1409\u0003\r\u041b\u000e\u1409\u0007\u000f\u1409\u0001\u0010\u1009\t\u0011\u1409\n\u0014\u1409\r\u0015\u100a\u0011\u0016\u1009\u000e\u0017\u1008\u0012\u0019\u1008\u0013\u001a\u1409\u000f\u001d\u1409\u0010\u001e\u041b \u1409\u0015#\u1409\u0017$\u041b&\u1409\u0018)\u1409\u001b*\u1409\u001c,\u1409\u001d.\u1409\u001e1\u041b3\u041b6\u1409!8\u1409#:\u1409$;\u1409%<\u041b=\u1409&>\u041b?\u041b@\u1009'\u0309\u1409(", new Object[] { "b", "c", "d", "f", "h", "i", "m", akux.class, "j", "n", "g", "o", ahsg.class, "k", "e", "p", "q", "r", "v", "s", "w", "x", "t", "S", "u", akva.class, "y", "T", "z", aioe.class, "B", "C", "D", "E", "F", "A", aioe.class, "G", algz.class, "I", "J", "K", "L", "M", anss.class, "N", "O", aizm.class, "H", aiwa.class, "P", "Q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.U = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.U;
            }
        }
    }
}
