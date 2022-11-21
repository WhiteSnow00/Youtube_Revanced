import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjw extends ahcz implements aheo
{
    public static final amjw a;
    private static volatile ahev d;
    public int b;
    public ameu c;
    private amei e;
    private amej f;
    private aicn g;
    private amfa h;
    private amep i;
    private ameo j;
    private amfb k;
    private amem l;
    private amed m;
    private amel n;
    private ameg o;
    private ameh p;
    private amen q;
    private amee r;
    private amey s;
    private amet t;
    private amer u;
    private amjl v;
    private alxg w;
    private amef x;
    private amex y;
    private byte z;
    
    static {
        ahcz.registerDefaultInstance(amjw.class, a = new amjw());
    }
    
    private amjw() {
        this.z = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte z = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amjw.d) == null) {
                    synchronized (amjw.class) {
                        if (amjw.d == null) {
                            amjw.d = (ahev)new ahcs((ahcz)amjw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjw.a;
            }
            case 4: {
                return new ahcr((ahcz)amjw.a);
            }
            case 3: {
                return new amjw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjw.a, "\u0001\u0016\u0000\u0001\ue5d8\u1848\uf6f5\u7219\u0016\u0000\u0000\u0016\ue5d8\u1848\u1409\u0002\ue592\u1be6\u1409\u0014\ufd5d\u1fc8\u1409\u0006\ufd7e\u1fc8\u1409\u0007\uf26c\u209e\u1409\b\uf8db\u20a9\u1409\u000b\uf181\u20af\u1409\f\uf433\u20af\u1409\u000e\uf436\u20af\u1409\u000f\uf442\u20af\u1409\u0010\ue57e\u210e\u1409\u0000\uf47f\u255b\u1409\u0003\ue72f\u2bc7\u1409\u0017\uef36\u2bcc\u1409\u0012\uf426\u2d62\u1409\u001b\uf620\u2f4f\u1409\u0013\uf1e4\u2f50\u1409\t\uf219\u3021\u1409\u0001\ue8ea\u3641\u1409\u0004\uf033\u3688\u1409\u0005\ufa9b\u48a4\u1409\u0015\uf6f5\u7219\u1409\u0011", new Object[] { "b", "g", "v", "k", "l", "c", "n", "o", "p", "q", "r", "e", "h", "x", "t", "y", "u", "m", "f", "i", "j", "w", "s" });
            }
            case 1: {
                if (o == null) {
                    z = 0;
                }
                this.z = z;
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
