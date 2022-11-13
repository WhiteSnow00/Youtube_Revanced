import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxe extends ahbh implements ahcw
{
    public static final akxe a;
    private static volatile ahdd g;
    public int b;
    public amfo c;
    public apvu d;
    public aovi e;
    public aiqm f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akxe.class, (ahbh)(a = new akxe()));
    }
    
    private akxe() {
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
                if ((g = akxe.g) == null) {
                    synchronized (akxe.class) {
                        if (akxe.g == null) {
                            akxe.g = (ahdd)new ahba((ahbh)akxe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akxe.a;
            }
            case 4: {
                return new ahaz((ahbh)akxe.a);
            }
            case 3: {
                return new akxe();
            }
            case 2: {
                return newMessageInfo((MessageLite)akxe.a, "\u0001\u0004\u0000\u0001\uefcf\u2e35\ue60b\u56e4\u0004\u0000\u0000\u0004\uefcf\u2e35\u1409\u0000\uf23f\u3911\u1409\u0001\ueb41\u48e5\u1409\u0002\ue60b\u56e4\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
