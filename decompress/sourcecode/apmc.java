import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmc extends agzd implements agze
{
    private static volatile ahbe F;
    public static final apmc a;
    public aplz A;
    public aplz B;
    public aplz C;
    public apin D;
    public agyc E;
    private ajsq G;
    private ajsq H;
    private ajsq I;
    private anss J;
    private ajsq K;
    private ajsq L;
    private aioe M;
    private ahpg N;
    private alim O;
    private aioe P;
    private anss Q;
    private apma R;
    private aioe S;
    private ahfw T;
    private byte U;
    public int b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public aorm g;
    public ajsq h;
    public ajsq i;
    public ajsq j;
    public ajsq k;
    public ajsq m;
    public ajsq n;
    public aioe o;
    public agzy p;
    public ahyq q;
    public ahyq r;
    public ahyq s;
    public apdo t;
    public apmb u;
    public amer v;
    public boolean w;
    public agzy x;
    public apmd y;
    public aplz z;
    
    static {
        agzi.registerDefaultInstance(apmc.class, (agzi)(a = new apmc()));
    }
    
    private apmc() {
        this.d = 0;
        this.U = 2;
        this.f = "";
        emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.E = agyc.b;
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
                final ahbe f;
                if ((f = apmc.F) == null) {
                    synchronized (apmc.class) {
                        if (apmc.F == null) {
                            apmc.F = (ahbe)new agzb((agzi)apmc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apmc.a;
            }
            case 4: {
                return new agzc((agzd)apmc.a);
            }
            case 3: {
                return new apmc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmc.a, "\u0001)\u0001\u0002\u00018)\u0000\u0002$\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1409\t\u0006\u1409\u000e\u0007\u1409\u000f\b\u1409\u0010\t\u1409\u0012\n\u041b\r\u1409\u0017\u000f\u1409\f\u0010\u1409+\u0011\u1409\u0019\u0012\u1409\r\u0013\u143c\u0000\u0014\u1409\u001a\u0015\u100a-\u0016\u1409\u0018\u001a\u1409\u0011\u001b\u1007\u001e\u001c\u1409\u001c\u001d\u1409! \u1409\u0015!\u143c\u0000\"\u041b#\u1409\u0014$\u1409\u0016&\u1009\"'\u1409#(\u1409$)\u1409%*\u1409&-\u1009(.\u1409\u001b2\u1409)3\u1409\u001f4\u1409\u00075\u1409\u00046\u1409\u00138\u1409\u0006", new Object[] { "e", "d", "b", "c", "f", "g", "h", "H", "K", "j", "k", "m", "o", "p", ahyg.class, "N", "L", "T", "t", "i", aorm.class, "u", "E", "O", "n", "w", "v", "R", "r", aiib.class, "x", aora.class, "q", "s", "y", "z", "A", "B", "C", "D", "P", "S", "Q", "J", "G", "M", "I" });
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
