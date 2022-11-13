import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akds extends ahbh implements ahcw
{
    public static final akds a;
    private static volatile ahdd b;
    private ahcr c;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)akds.class, (ahbh)(a = new akds()));
    }
    
    private akds() {
        this.c = ahcr.a;
        this.d = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akds.b) == null) {
                    synchronized (akds.class) {
                        if (akds.b == null) {
                            akds.b = (ahdd)new ahba((ahbh)akds.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akds.a;
            }
            case 4: {
                return new ahaz((ahbh)akds.a);
            }
            case 3: {
                return new akds();
            }
            case 2: {
                return newMessageInfo((MessageLite)akds.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002\u0432", new Object[] { "c", akdr.a });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
