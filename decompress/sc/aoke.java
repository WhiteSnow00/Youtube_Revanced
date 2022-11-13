import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoke extends ahbh implements ahcw
{
    public static final aoke a;
    private static volatile ahdd m;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public anuv f;
    public anuv g;
    public ajut h;
    public ajut i;
    public anuv j;
    public ajut k;
    public boolean l;
    private ajut n;
    private ajut o;
    private ajut p;
    private anuv q;
    private anuv r;
    private anuv s;
    private anuv t;
    private byte u;
    
    static {
        ahbh.registerDefaultInstance((Class)aoke.class, (ahbh)(a = new aoke()));
    }
    
    private aoke() {
        this.u = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = aoke.m) == null) {
                    synchronized (aoke.class) {
                        if (aoke.m == null) {
                            aoke.m = (ahdd)new ahba((ahbh)aoke.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aoke.a;
            }
            case 4: {
                return new ahaz((ahbh)aoke.a);
            }
            case 3: {
                return new aoke();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoke.a, "\u0001\u0011\u0000\u0001\u0001\u0014\u0011\u0000\u0000\u0010\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\b\u0007\u1409\u0007\b\u1409\u0004\t\u1409\n\n\u1007\f\u000b\u1409\u0003\f\u1409\r\r\u1409\t\u000f\u1409\u0010\u0010\u1409\u0011\u0013\u1409\u000e\u0014\u1409\u000b", new Object[] { "b", "c", "n", "d", "g", "h", "j", "i", "f", "k", "l", "e", "q", "o", "s", "t", "r", "p" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
