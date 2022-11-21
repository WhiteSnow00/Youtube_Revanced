import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlz extends ahcz implements aheo
{
    public static final ajlz a;
    private static volatile ahev f;
    public int b;
    public ajmb c;
    public ajmf d;
    public ajme e;
    private aoff g;
    private aofe h;
    private ajma i;
    private ajmg j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(ajlz.class, a = new ajlz());
    }
    
    private ajlz() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ajlz.f) == null) {
                    synchronized (ajlz.class) {
                        if (ajlz.f == null) {
                            ajlz.f = (ahev)new ahcs((ahcz)ajlz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajlz.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlz.a);
            }
            case 3: {
                return new ajlz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlz.a, "\u0001\u0007\u0000\u0001\uf85c\u21e7\uf22c\u9f20\u0007\u0000\u0000\u0007\uf85c\u21e7\u1409\u0000\ue9c1\u21e8\u1409\u0002\ueb8b\u2262\u1409\u0001\ufaac\u2515\u1409\u0003\uf79d\u2f1a\u1409\u0004\uecb5\u3a1e\u1409\u0005\uf22c\u9f20\u1409\u0006", new Object[] { "b", "g", "i", "h", "c", "d", "e", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
