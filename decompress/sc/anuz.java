import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuz extends ahbh implements ahcw
{
    private static volatile ahdd N;
    public static final anuz a;
    public int A;
    public boolean B;
    public float C;
    public String D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public float K;
    public boolean L;
    public boolean M;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public String h;
    public boolean i;
    public String j;
    public anuy k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public float v;
    public boolean w;
    public anuw x;
    public boolean y;
    public boolean z;
    
    static {
        ahbh.registerDefaultInstance((Class)anuz.class, (ahbh)(a = new anuz()));
    }
    
    private anuz() {
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
        this.h = "";
        this.j = "";
        this.D = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = anuz.N) == null) {
                    synchronized (anuz.class) {
                        if (anuz.N == null) {
                            anuz.N = (ahdd)new ahba((ahbh)anuz.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return anuz.a;
            }
            case 4: {
                return new ahaz((ahbh)anuz.a);
            }
            case 3: {
                return new anuz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuz.a, "\u0001!\u0000\u0005\u0012£!\u0000\u0000\u0000\u0012\u1001\n\u0016\u1008\u000e,\u1007\u001d/\u1008\u001f6\u1009$L\u10079M\u1007:O\u1004;R\u1007=X\u1007C^\u1007H`\u1007Jk\u1007Ul\u1007Vn\u1007Wr\u1001[t\u1007]\u0080\u1009g\u0088\u1007o\u008f\u1007v\u0090\u1004w\u0091\u1007x\u0092\u1001y\u0093\u1008z\u0096\u1001|\u0097\u1007}\u0098\u1007~\u0099\u1004\u007f\u009c\u1007\u0082\u009d\u1007\u0083\u009f\u1001\u0085 \u1007\u0086£\u1007\u0089", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M" });
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
