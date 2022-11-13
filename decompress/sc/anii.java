import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anii extends ahbh implements ahcw
{
    public static final anii a;
    private static volatile ahdd c;
    public ankh b;
    private int d;
    private ankl e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anii.class, (ahbh)(a = new anii()));
    }
    
    private anii() {
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
                final ahdd c;
                if ((c = anii.c) == null) {
                    synchronized (anii.class) {
                        if (anii.c == null) {
                            anii.c = (ahdd)new ahba((ahbh)anii.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anii.a;
            }
            case 4: {
                return new ahaz((ahbh)anii.a);
            }
            case 3: {
                return new anii();
            }
            case 2: {
                return newMessageInfo((MessageLite)anii.a, "\u0001\u0002\u0000\u0001\ue365\u2289\uf842\u353b\u0002\u0000\u0000\u0002\ue365\u2289\u1409\u0000\uf842\u353b\u1409\u0001", new Object[] { "d", "e", "b" });
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
