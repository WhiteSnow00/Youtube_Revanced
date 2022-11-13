import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfw extends ahbh implements ahcw
{
    public static final akfw a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private aiqj e;
    private akfv f;
    private anuv g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akfw.class, (ahbh)(a = new akfw()));
    }
    
    private akfw() {
        this.h = 2;
        emptyProtobufList();
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
                if ((b = akfw.b) == null) {
                    synchronized (akfw.class) {
                        if (akfw.b == null) {
                            akfw.b = (ahdd)new ahba((ahbh)akfw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfw.a;
            }
            case 4: {
                return new ahaz((ahbh)akfw.a);
            }
            case 3: {
                return new akfw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfw.a, "\u0001\u0004\u0000\u0001\u0002\u0011\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\t\u1409\u0003\u0011\u1409\r", new Object[] { "c", "d", "e", "f", "g" });
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
