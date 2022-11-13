import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoht extends ahbh implements ahcw
{
    public static final aoht a;
    private static volatile ahdd g;
    public int b;
    public aohu c;
    public ahnk d;
    public ahab e;
    public aoxg f;
    private ahhu h;
    private ahmr i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aoht.class, (ahbh)(a = new aoht()));
    }
    
    private aoht() {
        this.j = 2;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aoht.g) == null) {
                    synchronized (aoht.class) {
                        if (aoht.g == null) {
                            aoht.g = (ahdd)new ahba((ahbh)aoht.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoht.a;
            }
            case 4: {
                return new ahaz((ahbh)aoht.a);
            }
            case 3: {
                return new aoht();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoht.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0003\u0001\u1009\u0000\u0002\u1409\u0001\u0005\u1409\u0002\u0006\u100a\u0003\b\u1009\u0004\t\u1409\u0005", new Object[] { "b", "c", "d", "h", "e", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
