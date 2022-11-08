import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqh extends agzi implements ahax
{
    public static final ajqh a;
    private static volatile ahbe g;
    public int b;
    public anhf c;
    public aoeq d;
    public apmc e;
    public akdz f;
    private aihj h;
    private amiv i;
    private amiu j;
    private anpf k;
    private apmz l;
    private aiso m;
    private aith n;
    private aitp o;
    private aitw p;
    private aitv q;
    private aiuh r;
    private aixw s;
    private ahvs t;
    private ajkj u;
    private byte v;
    
    static {
        agzi.registerDefaultInstance((Class)ajqh.class, (agzi)(a = new ajqh()));
    }
    
    private ajqh() {
        this.v = 2;
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
                final ahbe g;
                if ((g = ajqh.g) == null) {
                    synchronized (ajqh.class) {
                        if (ajqh.g == null) {
                            ajqh.g = (ahbe)new agzb((agzi)ajqh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajqh.a;
            }
            case 4: {
                return new agza((agzi)ajqh.a);
            }
            case 3: {
                return new ajqh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajqh.a, "\u0001\u0012\u0000\u0001\ue1d6\u181e\uf492\u4933\u0012\u0000\u0000\u0012\ue1d6\u181e\u1409\u0006\uf243\u181f\u1409\u0000\uf143\u1824\u1409\r\ufcf4\u1830\u1409\u0003\ue567\u1832\u1409\n\uef41\u1838\u1409\b\uf2b9\u195a\u1409\f\ue9c4\u1be3\u1409\u0001\uea1c\u1be3\u1409\t\uef20\u1e04\u1409\u0005\uee1d\u1f0d\u1409\u000f\uf55d\u1fbb\u1409\u0002\uec81\u27d5\u1409\u0010\uf127\u2a72\u1409\u0007\uf5b1\u2f1e\u1409\u000e\uf76d\u32f4\u1409\u000b\ufd9c\u3306\u1409\u0004\uf492\u4933\u1409\u0011", new Object[] { "b", "e", "h", "r", "c", "o", "m", "q", "i", "n", "k", "t", "j", "f", "l", "s", "p", "d", "u" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.v = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
