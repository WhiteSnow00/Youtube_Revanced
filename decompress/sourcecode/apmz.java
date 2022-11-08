import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmz extends agzd implements agze
{
    private static volatile ahbe B;
    public static final apmz a;
    public anss A;
    private aioe C;
    private ahfw D;
    private ahyq E;
    private aioe F;
    private byte G;
    public int b;
    public ajsq c;
    public ajsq d;
    public aorm e;
    public ajsq f;
    public aiib g;
    public ajsq h;
    public ajsq i;
    public ajsq j;
    public aioe k;
    public apmy m;
    public amer n;
    public boolean o;
    public agzy p;
    public agyc q;
    public String r;
    public ahyq s;
    public ahyq t;
    public ajsq u;
    public apdo v;
    public agzy w;
    public apna x;
    public apin y;
    public anss z;
    
    static {
        agzi.registerDefaultInstance((Class)apmz.class, (agzi)(a = new apmz()));
    }
    
    private apmz() {
        this.G = 2;
        this.p = emptyProtobufList();
        this.q = agyc.b;
        this.r = "";
        this.w = emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = apmz.B) == null) {
                    synchronized (apmz.class) {
                        if (apmz.B == null) {
                            apmz.B = (ahbe)new agzb((agzi)apmz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apmz.a;
            }
            case 4: {
                return new agzc(apmz.a);
            }
            case 3: {
                return new apmz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmz.a, "\u0001\u001c\u0000\u0001\u0001\"\u001c\u0000\u0002\u0017\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\t\b\u1409\n\t\u1409\u000b\n\u1007\f\f\u1409\u0010\r\u100a\u0012\u000e\u1008\u0013\u000f\u041b\u0010\u1409\u0005\u0011\u1409\u0014\u0012\u1409\u0015\u0013\u1409\u0016\u0014\u1409\u0017\u0015\u1409\b\u0017\u1409\u0018\u0019\u041b\u001a\u1009\u001a\u001b\u1009\u001b\u001d\u1409\u001c\u001f\u1409\u001e \u1409\u001f\"\u1409\u000e", new Object[] { "b", "c", "d", "e", "f", "h", "i", "k", "m", "n", "o", "D", "q", "r", "p", aora.class, "g", "E", "s", "t", "u", "j", "v", "w", ahyg.class, "x", "y", "z", "F", "A", "C" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.G = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.G;
            }
        }
    }
}
