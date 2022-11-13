import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvg extends ahbh implements ahcw
{
    public static final anvg a;
    private static volatile ahdd j;
    public int b;
    public amsn c;
    public amrw d;
    public amgu e;
    public amgq f;
    public aiht g;
    public akgk h;
    public ansg i;
    private amhi k;
    private akcf l;
    private akoa m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)anvg.class, (ahbh)(a = new anvg()));
    }
    
    private anvg() {
        this.n = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = anvg.j) == null) {
                    synchronized (anvg.class) {
                        if (anvg.j == null) {
                            anvg.j = (ahdd)new ahba((ahbh)anvg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anvg.a;
            }
            case 4: {
                return new ahaz((ahbh)anvg.a);
            }
            case 3: {
                return new anvg();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvg.a, "\u0001\n\u0000\u0001\ue46d\u1738\uf367\uaf7e\n\u0000\u0000\n\ue46d\u1738\u1409\u0004\ue592\u1be6\u1409\u0006\uef94\u1fae\u1409\u0003\uefc3\u1fae\u1409\u0002\ufe1a\u2336\u1409\u0000\uf74f\u2a6b\u1409\u0007\ued00\u32da\u1409\b\uec26\u3a7b\u1409\u0001\uf3df\u3ba7\u1409\u0005\uf367\uaf7e\u1409\t", new Object[] { "b", "g", "k", "f", "e", "c", "l", "m", "d", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
