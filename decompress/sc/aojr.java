import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojr extends ahbh implements ahcw
{
    public static final aojr a;
    private static volatile ahdd j;
    public int b;
    public ajut c;
    public aotp d;
    public ajut e;
    public anuv f;
    public anuv g;
    public boolean h;
    public boolean i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aojr.class, (ahbh)(a = new aojr()));
    }
    
    private aojr() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = aojr.j) == null) {
                    synchronized (aojr.class) {
                        if (aojr.j == null) {
                            aojr.j = (ahdd)new ahba((ahbh)aojr.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aojr.a;
            }
            case 4: {
                return new ahaz((ahbh)aojr.a);
            }
            case 3: {
                return new aojr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojr.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1007\u0005\u0006\u1409\u0004\u0007\u1007\u0006", new Object[] { "b", "c", "d", "e", "f", "h", "g", "i" });
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
