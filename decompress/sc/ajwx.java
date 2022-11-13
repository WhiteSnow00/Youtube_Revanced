import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwx extends ahbh implements ahcw
{
    public static final ajwx a;
    private static volatile ahdd b;
    private int c;
    private aiuz d;
    private aiut e;
    private aivd f;
    private aivl g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwx.class, (ahbh)(a = new ajwx()));
    }
    
    private ajwx() {
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
                final ahdd b;
                if ((b = ajwx.b) == null) {
                    synchronized (ajwx.class) {
                        if (ajwx.b == null) {
                            ajwx.b = (ahdd)new ahba((ahbh)ajwx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwx.a);
            }
            case 3: {
                return new ajwx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwx.a, "\u0001\u0004\u0000\u0001\uef41\u1838\ue974\u28b5\u0004\u0000\u0000\u0004\uef41\u1838\u1409\u0001\uffbe\u2036\u1409\u0003\ued6a\u25bb\u1409\u0002\ue974\u28b5\u1409\u0000", new Object[] { "c", "e", "g", "f", "d" });
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
