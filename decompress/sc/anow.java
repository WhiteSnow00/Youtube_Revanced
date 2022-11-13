import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anow extends ahbh implements ahcw
{
    public static final anow a;
    private static volatile ahdd l;
    public int b;
    public anuv c;
    public anuv d;
    public anpl e;
    public anpl f;
    public aiqj g;
    public aotp h;
    public aiqj i;
    public ajut j;
    public boolean k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anow.class, (ahbh)(a = new anow()));
    }
    
    private anow() {
        this.m = 2;
        this.k = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = anow.l) == null) {
                    synchronized (anow.class) {
                        if (anow.l == null) {
                            anow.l = (ahdd)new ahba((ahbh)anow.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return anow.a;
            }
            case 4: {
                return new ahaz((ahbh)anow.a);
            }
            case 3: {
                return new anow();
            }
            case 2: {
                return newMessageInfo((MessageLite)anow.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1009\u0003\b\u1409\u0004\t\u1007\b", new Object[] { "b", "c", "d", "e", "h", "i", "j", "f", "g", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
