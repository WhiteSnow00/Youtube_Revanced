import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplc extends agzd implements agze
{
    public static final aplc a;
    private static volatile ahbe k;
    private ajsq A;
    private ajsq B;
    private ajsq C;
    private ajsq D;
    private aibi E;
    private apkz F;
    private ajsq G;
    private ahfw H;
    private aple I;
    private apla J;
    private apld K;
    private aioe L;
    private byte M;
    public int b;
    public int c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public boolean g;
    public boolean h;
    public ajsq i;
    public ally j;
    private ahyq m;
    private ahyq n;
    private ajsq o;
    private aplf p;
    private ajsq q;
    private ajsq r;
    private aplb s;
    private ajsq t;
    private ajsq u;
    private ajsq v;
    private ajsq w;
    private ajsq x;
    private ajsq y;
    private ajsq z;
    
    static {
        agzi.registerDefaultInstance(aplc.class, (agzi)(a = new aplc()));
    }
    
    private aplc() {
        this.M = 2;
        this.g = true;
        this.h = true;
        emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe k;
                if ((k = aplc.k) == null) {
                    synchronized (aplc.class) {
                        if (aplc.k == null) {
                            aplc.k = (ahbe)new agzb((agzi)aplc.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aplc.a;
            }
            case 4: {
                return new agzc((agzd)aplc.a);
            }
            case 3: {
                return new aplc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aplc.a, "\u0001!\u0000\u0002\u00015!\u0000\u0000\u001f\u0001\u1409\u0002\u0002\u1409\u0004\u0003\u1409\u0007\u0004\u1409\u000b\u0005\u1409\r\u0006\u1409\n\u0007\u1409\f\b\u1007\u001a\t\u1007\u001b\n\u1409\u001c\r\u1409 \u000f\u1409'\u0011\u1409&\u0012\u1409\u0006\u0014\u1409)\u0015\u1409*\u0016\u1409\u0005\u0019\u1409,\u001e\u1409!\u001f\u1409$!\u1409\u0003\"\u1409\u0000#\u1409\u0001%\u1409\u000f)\u1409.*\u1409\b-\u1409\u001d.\u1409\u0010/\u1409\u00122\u1409\u00163\u1409\u00134\u1409\u00175\u1409\u0018", new Object[] { "b", "c", "d", "e", "r", "u", "f", "t", "v", "g", "h", "i", "j", "H", "G", "q", "I", "J", "p", "K", "E", "F", "o", "m", "n", "w", "L", "s", "D", "x", "y", "A", "z", "B", "C" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.M = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.M;
            }
        }
    }
}
