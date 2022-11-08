import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyg extends agzi implements ahax
{
    public static final ahyg a;
    private static volatile ahbe i;
    private byte A;
    public int b;
    public ahyw c;
    public ahyj d;
    public ahyp e;
    public amfl f;
    public ahyh g;
    public ahyy h;
    private ahzb j;
    private ahzc k;
    private ahzd l;
    private ahym m;
    private ahza n;
    private ahyi o;
    private ahyf p;
    private aozb q;
    private apcw r;
    private ahyn s;
    private ahye t;
    private amny u;
    private aljj v;
    private aliw w;
    private amkx x;
    private ahyk y;
    private ahyo z;
    
    static {
        agzi.registerDefaultInstance(ahyg.class, a = new ahyg());
    }
    
    private ahyg() {
        this.A = 2;
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
                final ahbe i;
                if ((i = ahyg.i) == null) {
                    synchronized (ahyg.class) {
                        if (ahyg.i == null) {
                            ahyg.i = (ahbe)new agzb((agzi)ahyg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahyg.a;
            }
            case 4: {
                return new agza((agzi)ahyg.a);
            }
            case 3: {
                return new ahyg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyg.a, "\u0001\u0017\u0000\u0001\uedbb\u1842\uf23c\u98cf\u0017\u0000\u0000\u0015\uedbb\u1842\u1409\u0004\ue7d2\u1846\u1409\u0003\uffc6\u1847\u1409\u0001\ue5d8\u1848\u1409\u0000\ue5f3\u1849\u1409\u0002\ue14a\u1cb1\u1409\u0007\ue1ac\u1e6f\u1009\b\ue859\u1f00\u1409\u000f\uffdc\u268c\u1409\t\ue425\u2a77\u1409\n\uf6ea\u2a97\u1409\u000b\ufee0\u2de1\u1409\r\ue384\u3020\u1409\u0010\ue496\u3d35\u1409\u0011\uef0d\u4116\u1409\u000e\uffca\u4215\u1409\u0012\uead0\u4ad3\u1409\u0013\uf547\u5075\u1409\u0014\uee97\u516b\u1409\u0015\uf682\u55ee\u1409\u0017\ue16b\u84c9\u1009\u0018\ue16c\u84c9\u1409\u0019\uf23c\u98cf\u1409\u001a", new Object[] { "b", "l", "k", "d", "c", "j", "m", "e", "s", "n", "o", "p", "q", "t", "f", "r", "u", "g", "v", "w", "x", "h", "y", "z" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.A = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.A;
            }
        }
    }
}
