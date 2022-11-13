import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akum extends ahbh implements ahcw
{
    public static final akum a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public ajut d;
    public ajut e;
    public aiqj f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akum.class, (ahbh)(a = new akum()));
    }
    
    private akum() {
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
                final ahdd g;
                if ((g = akum.g) == null) {
                    synchronized (akum.class) {
                        if (akum.g == null) {
                            akum.g = (ahdd)new ahba((ahbh)akum.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akum.a;
            }
            case 4: {
                return new ahaz((ahbh)akum.a);
            }
            case 3: {
                return new akum();
            }
            case 2: {
                return newMessageInfo((MessageLite)akum.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", akjo.s, "d", "e", "f" });
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
