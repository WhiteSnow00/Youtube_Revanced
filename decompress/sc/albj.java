import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albj extends ahbh implements ahcw
{
    public static final albj a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)albj.class, (ahbh)(a = new albj()));
    }
    
    private albj() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = albj.e) == null) {
                    synchronized (albj.class) {
                        if (albj.e == null) {
                            albj.e = (ahdd)new ahba((ahbh)albj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albj.a;
            }
            case 4: {
                return new ahaz((ahbh)albj.a);
            }
            case 3: {
                return new albj();
            }
            case 2: {
                return newMessageInfo((MessageLite)albj.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u100c\u0003", new Object[] { "b", "c", "d", alua.h });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
