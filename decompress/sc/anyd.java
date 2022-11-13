import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anyd extends ahbh implements ahcw
{
    public static final anyd a;
    private static volatile ahdd o;
    public int b;
    public ajwd c;
    public anyb d;
    public ajqh e;
    public akbr f;
    public ampg g;
    public amop h;
    public ammg i;
    public amot j;
    public apcz k;
    public aorx l;
    public ajmo m;
    public anmo n;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)anyd.class, (ahbh)(a = new anyd()));
    }
    
    private anyd() {
        this.p = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = anyd.o) == null) {
                    synchronized (anyd.class) {
                        if (anyd.o == null) {
                            anyd.o = (ahdd)new ahba((ahbh)anyd.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return anyd.a;
            }
            case 4: {
                return new ahaz((ahbh)anyd.a);
            }
            case 3: {
                return new anyd();
            }
            case 2: {
                return newMessageInfo((MessageLite)anyd.a, "\u0001\f\u0000\u0001\ufe68\u2962\uf860\ud5ae\f\u0000\u0000\f\ufe68\u2962\u1409\u0000\ue930\u298a\u1409\u0001\uefc0\u2b89\u1409\u0007\ue17d\u2f93\u1409\u0002\uf9c5\u38e7\u1409\t\uf5da\u3d48\u1409\u0003\uf492\u4933\u1409\n\uf124\u4cde\u1409\u0006\uf85b\u4cf9\u1409\u0004\ue675\u5339\u1409\b\uf28e\u5712\u1409\u0005\uf860\ud5ae\u1409\u000b", new Object[] { "b", "c", "d", "j", "e", "l", "f", "m", "i", "g", "k", "h", "n" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
