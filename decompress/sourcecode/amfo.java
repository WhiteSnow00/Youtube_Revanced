import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfo extends agzi implements ahax
{
    public static final amfo a;
    private static volatile ahbe d;
    public int b;
    public amap c;
    private amae e;
    private amaf f;
    private ahyw g;
    private amau h;
    private amak i;
    private amaj j;
    private amav k;
    private amah l;
    private alzz m;
    private amag n;
    private amac o;
    private amad p;
    private amai q;
    private amaa r;
    private amas s;
    private amao t;
    private amam u;
    private amfe v;
    private altc w;
    private amab x;
    private amar y;
    private byte z;
    
    static {
        agzi.registerDefaultInstance((Class)amfo.class, (agzi)(a = new amfo()));
    }
    
    private amfo() {
        this.z = 2;
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
                final ahbe d;
                if ((d = amfo.d) == null) {
                    synchronized (amfo.class) {
                        if (amfo.d == null) {
                            amfo.d = (ahbe)new agzb((agzi)amfo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfo.a;
            }
            case 4: {
                return new agza((agzi)amfo.a);
            }
            case 3: {
                return new amfo();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfo.a, "\u0001\u0016\u0000\u0001\ue5d8\u1848\uf6f5\u7219\u0016\u0000\u0000\u0016\ue5d8\u1848\u1409\u0002\ue592\u1be6\u1409\u0014\ufd5d\u1fc8\u1409\u0006\ufd7e\u1fc8\u1409\u0007\uf26c\u209e\u1409\b\uf8db\u20a9\u1409\u000b\uf181\u20af\u1409\f\uf433\u20af\u1409\u000e\uf436\u20af\u1409\u000f\uf442\u20af\u1409\u0010\ue57e\u210e\u1409\u0000\uf47f\u255b\u1409\u0003\ue72f\u2bc7\u1409\u0017\uef36\u2bcc\u1409\u0012\uf426\u2d62\u1409\u001b\uf620\u2f4f\u1409\u0013\uf1e4\u2f50\u1409\t\uf219\u3021\u1409\u0001\ue8ea\u3641\u1409\u0004\uf033\u3688\u1409\u0005\ufa9b\u48a4\u1409\u0015\uf6f5\u7219\u1409\u0011", new Object[] { "b", "g", "v", "k", "l", "c", "n", "o", "p", "q", "r", "e", "h", "x", "t", "y", "u", "m", "f", "i", "j", "w", "s" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.z = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
