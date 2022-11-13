import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwg extends ahbh implements ahcw
{
    public static final ajwg a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwg.class, (ahbh)(a = new ajwg()));
    }
    
    private ajwg() {
        this.f = 2;
        this.c = emptyProtobufList();
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
                if ((d = ajwg.d) == null) {
                    synchronized (ajwg.class) {
                        if (ajwg.d == null) {
                            ajwg.d = (ahdd)new ahba((ahbh)ajwg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajwg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwg.a);
            }
            case 3: {
                return new ajwg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", ajwe.class });
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
