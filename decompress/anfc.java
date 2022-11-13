import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfc extends ahbh implements ahcw
{
    private static volatile ahdd U;
    public static final anfc a;
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
    private int V;
    private int W;
    private int X;
    private int Y;
    public int b;
    public ahtj c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public anhd q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    static {
        ahbh.registerDefaultInstance((Class)anfc.class, (ahbh)(a = new anfc()));
    }
    
    private anfc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd u;
                if ((u = anfc.U) == null) {
                    synchronized (anfc.class) {
                        if (anfc.U == null) {
                            anfc.U = (ahdd)new ahba((ahbh)anfc.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return anfc.a;
            }
            case 4: {
                return new ahaz((ahbh)anfc.a);
            }
            case 3: {
                return new anfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfc.a, "\u0001,\u0000\u0005\f\uf393\u58b7,\u0000\u0000\u0000\f\u1007)\u000f\u1009+\u001b\u10072\u001e\u10044'\u1007@)\u1007BH\u1007[I\u1007:K\u1007\\L\u1007]Q\u1007bR\u1007cX\u1007h[\u1007k\\\u1007\u001fj\u1007yk\u1007zl\u1007{n\u1007}o\u1007~p\u1007\u007ft\u1007=u\u1007<v\u1007\u0083~\u1007\u008a\u007f\u1007\u008b\u0080\u1007\u008c\u0084\u1007\u0090\u0085\u1007\u0092\u0089\u1007\u0095\u008a\u1007\u0096\u008b\u1007\u0097\ued7c\u0b4d\u1007\u0017\ufb80\u423f\u1009\u0000\ue156\u43a3\u1007\u0007\ufc65\u4518\u1007\n\uf4e1\u4534\u1007\b\uf336\u4892\u1007\u0012\uf337\u4892\u1004\u0013\ufa1d\u4dd9\u1007\u0014\ueb3f\u5399\u1004\u0005\ue0e9\u56eb\u1007\u001e\uecbc\u58b6\u1007#\uf393\u58b7\u1007$", new Object[] { "b", "V", "W", "X", "Y", "p", "q", "r", "s", "w", "x", "y", "t", "z", "A", "B", "C", "D", "E", "m", "F", "G", "H", "I", "J", "K", "v", "u", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "k", "c", "e", "g", "f", "h", "i", "j", "d", "l", "n", "o" });
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
