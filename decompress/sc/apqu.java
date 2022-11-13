import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqu extends ahbh implements ahcw
{
    public static final apqu a;
    private static volatile ahdd d;
    public aotp b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apqu.class, (ahbh)(a = new apqu()));
    }
    
    private apqu() {
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
                final ahdd d;
                if ((d = apqu.d) == null) {
                    synchronized (apqu.class) {
                        if (apqu.d == null) {
                            apqu.d = (ahdd)new ahba((ahbh)apqu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqu.a;
            }
            case 4: {
                return new ahaz((ahbh)apqu.a);
            }
            case 3: {
                return new apqu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", apow.p });
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
