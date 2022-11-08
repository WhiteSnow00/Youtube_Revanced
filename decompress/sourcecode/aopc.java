import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopc extends agzi implements ahax
{
    public static final aopc a;
    private static volatile ahbe e;
    private byte A;
    public int b;
    public anws c;
    public ajkj d;
    private alib f;
    private aopj g;
    private ajog h;
    private angx i;
    private aiwi j;
    private aozv k;
    private ajvj l;
    private amfe m;
    private aovu n;
    private anxt o;
    private anxs p;
    private anxl q;
    private anym r;
    private anxm s;
    private anxr t;
    private anye u;
    private anyf v;
    private anyi w;
    private antu x;
    private ammi y;
    private ammv z;
    
    static {
        agzi.registerDefaultInstance((Class)aopc.class, (agzi)(a = new aopc()));
    }
    
    private aopc() {
        this.A = 2;
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
                final ahbe e;
                if ((e = aopc.e) == null) {
                    synchronized (aopc.class) {
                        if (aopc.e == null) {
                            aopc.e = (ahbe)new agzb((agzi)aopc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aopc.a;
            }
            case 4: {
                return new agza((agzi)aopc.a);
            }
            case 3: {
                return new aopc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopc.a, "\u0001\u0017\u0000\u0001\ue824\u174c\uf0b9\ud1ab\u0017\u0000\u0000\u0017\ue824\u174c\u1409\u0002\ue7f5\u178e\u1409\u0000\uec06\u17ef\u1409\u0001\uf158\u1824\u1409\u0004\ue592\u1be6\u1409\n\uf004\u1d3d\u1409\u0013\uf7d8\u1d3e\u1409\r\ufbbc\u1f4f\u1409\t\ue6c6\u1fea\u1409\f\uf415\u2231\u1409\u0011\uec84\u23b5\u1409\u0005\uf1de\u24a9\u1409\u0012\uf11e\u2817\u1409\u0003\ue0df\u389a\u1409\u0006\uf492\u4933\u1409\u0018\uee53\u4d1d\u1409\u000b\ue334\u5115\u1409\u000e\ufe3b\u5124\u1409\u000f\ue463\u5127\u1409\u0010\ufa19\u79a0\u1409\u0015\ue7f2\u84eb\u1409\u0016\uecdd\ucb84\u1409\u0017\uf0b9\ud1ab\u1409\u0014", new Object[] { "b", "g", "c", "f", "i", "m", "v", "p", "l", "o", "t", "j", "u", "h", "k", "d", "n", "q", "r", "s", "x", "y", "z", "w" });
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
