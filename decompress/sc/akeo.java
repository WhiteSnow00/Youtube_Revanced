import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akeo extends ahbh implements ahcw
{
    public static final akeo a;
    private static volatile ahdd h;
    public int b;
    public akfa c;
    public akfc d;
    public akex e;
    public akek f;
    public akey g;
    private akev i;
    private akel j;
    private anlc k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)akeo.class, (ahbh)(a = new akeo()));
    }
    
    private akeo() {
        this.l = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = akeo.h) == null) {
                    synchronized (akeo.class) {
                        if (akeo.h == null) {
                            akeo.h = (ahdd)new ahba((ahbh)akeo.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akeo.a;
            }
            case 4: {
                return new ahaz((ahbh)akeo.a);
            }
            case 3: {
                return new akeo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akeo.a, "\u0001\b\u0000\u0001\ufb2e\u1d96\ue9cd\u3275\b\u0000\u0000\b\ufb2e\u1d96\u1409\u0000\uf743\u21b8\u1409\u0004\ue4d2\u21cb\u1409\u0002\ue5e4\u21f9\u1409\u0001\ueda2\u29ee\u1409\u0003\ue6f1\u2f4a\u1409\u0005\uf696\u2f64\u1409\u0006\ue9cd\u3275\u1409\u0007", new Object[] { "b", "c", "i", "e", "d", "f", "j", "k", "g" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
