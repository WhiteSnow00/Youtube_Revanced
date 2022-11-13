import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcz extends ahbh implements ahcw
{
    public static final ajcz a;
    private static volatile ahdd e;
    public int b;
    public aotp c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcz.class, (ahbh)(a = new ajcz()));
    }
    
    private ajcz() {
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
                if ((e = ajcz.e) == null) {
                    synchronized (ajcz.class) {
                        if (ajcz.e == null) {
                            ajcz.e = (ahdd)new ahba((ahbh)ajcz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajcz.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcz.a);
            }
            case 3: {
                return new ajcz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", airy.p });
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
