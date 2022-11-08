import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahox extends agzi implements ahax
{
    public static final ahox a;
    private static volatile ahbe ae;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    static {
        agzi.registerDefaultInstance(ahox.class, a = new ahox());
    }
    
    private ahox() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe ae;
                if ((ae = ahox.ae) == null) {
                    synchronized (ahox.class) {
                        if (ahox.ae == null) {
                            ahox.ae = (ahbe)new agzb((agzi)ahox.a);
                        }
                    }
                }
                return ae;
            }
            case 5: {
                return ahox.a;
            }
            case 4: {
                return new agza((agzi)ahox.a);
            }
            case 3: {
                return new ahox();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahox.a, "\u00017\u0000\u00063\u01107\u0000\u0000\u00003\u1007\u00104\u1007\u0011q\u1007!|\u1007+\u0080\u10070\u0087\u10076\u0088\u10077\u008c\u1007;\u008d\u1007<\u0091\u1007?\u0092\u1007@\u0094\u1007B\u0096\u1007D\u009c\u1007Mª\u1007\\«\u1007N¬\u1007]²\u1007O´\u1007hµ\u1007i¶\u1007jº\u1007I¼\u1007o¿\u1007r\u00c3\u1007t\u00c4\u1007u\u00c5\u1007v\u00d2\u1007\u0080\u00d3\u1007\u0081\u00d6\u1007J\u00dd\u1007\u008d\u00ea\u1007\u0096\u00eb\u1007\u0097\u00ec\u1007\u0098\u00f1\u1007¡\u00f2\u1007£\u00f5\u1007¦\u00f6\u1007§\u00f7\u1007¨\u00f8\u1007©\u00f9\u1007ª\u00fa\u1007\u0082\u00fb\u1007\u0083\u00fe\u1007®\u00ff\u1007¯\u0100\u1007°\u0102\u1007¢\u0104\u1007L\u0107\u1007\u009f\u0109\u1007³\u010b\u1007¬\u010c\u1007µ\u010d\u1007¶\u010f\u1007·\u0110\u1007K", new Object[] { "af", "ag", "ah", "ai", "aj", "ak", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "s", "v", "t", "w", "u", "x", "y", "z", "o", "A", "B", "C", "D", "E", "F", "G", "p", "J", "K", "L", "M", "O", "Q", "R", "S", "T", "U", "V", "H", "I", "X", "Y", "Z", "P", "r", "N", "aa", "W", "ab", "ac", "ad", "q" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
