import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvz extends ahbh implements ahcw
{
    public static final ajvz a;
    private static volatile ahdd d;
    public akli b;
    public ajwe c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvz.class, (ahbh)(a = new ajvz()));
    }
    
    private ajvz() {
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
                if ((d = ajvz.d) == null) {
                    synchronized (ajvz.class) {
                        if (ajvz.d == null) {
                            ajvz.d = (ahdd)new ahba((ahbh)ajvz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvz.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvz.a);
            }
            case 3: {
                return new ajvz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
