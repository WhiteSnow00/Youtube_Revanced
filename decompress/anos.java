import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anos extends ahbh implements ahcw
{
    public static final anos a;
    private static volatile ahdd m;
    public int b;
    public anuv c;
    public anuv d;
    public anpl e;
    public anpl f;
    public aiqj g;
    public aotp h;
    public aiqj i;
    public ajut j;
    public String k;
    public boolean l;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)anos.class, (ahbh)(a = new anos()));
    }
    
    private anos() {
        this.n = 2;
        this.k = "";
        this.l = true;
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
                final ahdd m;
                if ((m = anos.m) == null) {
                    synchronized (anos.class) {
                        if (anos.m == null) {
                            anos.m = (ahdd)new ahba((ahbh)anos.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return anos.a;
            }
            case 4: {
                return new ahaz((ahbh)anos.a);
            }
            case 3: {
                return new anos();
            }
            case 2: {
                return newMessageInfo((MessageLite)anos.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1008\b\n\u1007\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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
