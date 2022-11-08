import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajoy extends agzi implements ahax
{
    public static final agzr a;
    private static volatile ahbe aC;
    public static final ajoy b;
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public boolean L;
    public boolean M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public agzy R;
    public boolean S;
    public long T;
    public boolean U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aA;
    public boolean aB;
    private int aD;
    private int aE;
    private int aF;
    public boolean aa;
    public int ab;
    public agzq ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public int ag;
    public float ah;
    public int ai;
    public int aj;
    public boolean ak;
    public int al;
    public boolean am;
    public int an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public boolean ax;
    public String ay;
    public float az;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public agzq m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    
    static {
        a = (agzr)new prz(18);
        agzi.registerDefaultInstance((Class)ajoy.class, (agzi)(b = new ajoy()));
    }
    
    private ajoy() {
        this.m = emptyIntList();
        emptyIntList();
        this.R = agzi.emptyProtobufList();
        emptyIntList();
        this.ac = emptyIntList();
        this.ay = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe ac;
                if ((ac = ajoy.aC) == null) {
                    synchronized (ajoy.class) {
                        if (ajoy.aC == null) {
                            ajoy.aC = (ahbe)new agzb((agzi)ajoy.b);
                        }
                    }
                }
                return ac;
            }
            case 5: {
                return ajoy.b;
            }
            case 4: {
                return new agza((agzi)ajoy.b);
            }
            case 3: {
                return new ajoy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajoy.b, "\u0001M\u0000\u0004\u0001\u0089M\u0000\u0003\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u000b\u1004\n\u0011\u1007\u0010\u0018\u1004\u0017\u001a\u1004\u0019\u001b\u1004\u001a\u001f\u100c\u001e \u1007\u001f!\u001e#\u1007!$\u1007\"%\u1007#&\u1007$'\u1007%*\u1004*,\u1007,0\u100701\u100712\u100423\u100434\u100c55\u100766\u100777\u100488\u10079:\u1007;;\u1002<>\u1007=A\u1007AC\u1007BD\u1002CE\u1007DF\u1007EG\u1007FI\u1002HM\u1007IO\u1007KT\u1007OU\u001aV\u1007PX\u1002Q\\\u1007U]\u1007V^\u1002W_\u1007X`\u1007Ya\u1007Zb\u1007[c\u1004]d\u0016e\u1007^f\u1007_g\u1007`h\u1004ai\u1001bj\u1004ck\u1004dl\u1007em\u1004fs\u1007lv\u1007)w\u1004mx\u1007nz\u1007p{\u1007q|\u1007r}\u1007s\u007f\u1007u\u0080\u1007v\u0081\u1007w\u0082\u1007x\u0083\u1007y\u0086\u1008{\u0087\u1001|\u0088\u1007}\u0089\u1007~", new Object[] { "aD", "aE", "aF", "c", "d", "e", "f", "g", "h", "i", "j", "k", ahse.i, "l", "m", ajow.a(), "n", "o", "p", "q", "r", "t", "u", "v", "w", "x", "y", "z", ajoa.n, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "s", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "ax", "ay", "az", "aA", "aB" });
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
