import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apom extends ahbh implements ahcw
{
    public static final apom a;
    private static volatile ahdd b;
    private int c;
    private amhw d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apom.class, (ahbh)(a = new apom()));
    }
    
    private apom() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apom.b) == null) {
                    synchronized (apom.class) {
                        if (apom.b == null) {
                            apom.b = (ahdd)new ahba((ahbh)apom.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apom.a;
            }
            case 4: {
                return new ahaz((ahbh)apom.a);
            }
            case 3: {
                return new apom();
            }
            case 2: {
                return newMessageInfo((MessageLite)apom.a, "\u0001\u0001\u0000\u0001\ue5b3\u21fc\ue5b3\u21fc\u0001\u0000\u0000\u0001\ue5b3\u21fc\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}