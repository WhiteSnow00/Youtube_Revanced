import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqd extends ahbh implements ahcw
{
    public static final afqd a;
    private static volatile ahdd f;
    public int b;
    public Object c;
    public int d;
    public Object e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)afqd.class, (ahbh)(a = new afqd()));
    }
    
    private afqd() {
        this.b = 0;
        this.d = 0;
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = afqd.f) == null) {
                    synchronized (afqd.class) {
                        if (afqd.f == null) {
                            afqd.f = (ahdd)new ahba((ahbh)afqd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afqd.a;
            }
            case 4: {
                return new ahaz((ahbh)afqd.a);
            }
            case 3: {
                return new afqd();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqd.a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u143c\u0001\u0003\u143c\u0000\u0004\u103b\u0000\u0005\u103b\u0001", new Object[] { "c", "b", "e", "d", afrf.class, afrd.class, afre.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
