import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojg extends ahbh implements ahcw
{
    public static final aojg a;
    private static volatile ahdd f;
    public aotp b;
    public aotp c;
    public aotp d;
    public akdi e;
    private int g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aojg.class, (ahbh)(a = new aojg()));
    }
    
    private aojg() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aojg.f) == null) {
                    synchronized (aojg.class) {
                        if (aojg.f == null) {
                            aojg.f = (ahdd)new ahba((ahbh)aojg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojg.a;
            }
            case 4: {
                return new ahaz((ahbh)aojg.a);
            }
            case 3: {
                return new aojg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
