import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidu extends ahbh implements ahcw
{
    public static final aidu a;
    private static volatile ahdd f;
    public int b;
    public aome c;
    public aiii d;
    public apgq e;
    private aicz g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aidu.class, (ahbh)(a = new aidu()));
    }
    
    private aidu() {
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
                if ((f = aidu.f) == null) {
                    synchronized (aidu.class) {
                        if (aidu.f == null) {
                            aidu.f = (ahdd)new ahba((ahbh)aidu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aidu.a;
            }
            case 4: {
                return new ahaz((ahbh)aidu.a);
            }
            case 3: {
                return new aidu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidu.a, "\u0001\u0004\u0000\u0001\ue084\u1870\ueb11\u1f11\u0004\u0000\u0000\u0004\ue084\u1870\u1409\u0001\ue2d9\u1a6d\u1409\u0000\ue61f\u1e16\u1409\u0002\ueb11\u1f11\u1409\u0003", new Object[] { "b", "d", "c", "e", "g" });
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
