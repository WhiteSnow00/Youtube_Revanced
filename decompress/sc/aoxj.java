import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxj extends ahbh implements ahcw
{
    public static final aoxj a;
    private static volatile ahdd i;
    public ajut b;
    public int c;
    public int d;
    public int e;
    public int f;
    public anuv g;
    public boolean h;
    private int j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxj.class, (ahbh)(a = new aoxj()));
    }
    
    private aoxj() {
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
                final ahdd i;
                if ((i = aoxj.i) == null) {
                    synchronized (aoxj.class) {
                        if (aoxj.i == null) {
                            aoxj.i = (ahdd)new ahba((ahbh)aoxj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoxj.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxj.a);
            }
            case 3: {
                return new aoxj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxj.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u1409\u0005\u0007\u1007\u0006", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
