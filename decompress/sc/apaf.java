import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apaf extends ahbh implements ahcw
{
    public static final apaf a;
    private static volatile ahdd b;
    private int c;
    private apae d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apaf.class, (ahbh)(a = new apaf()));
    }
    
    private apaf() {
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
                if ((b = apaf.b) == null) {
                    synchronized (apaf.class) {
                        if (apaf.b == null) {
                            apaf.b = (ahdd)new ahba((ahbh)apaf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apaf.a;
            }
            case 4: {
                return new ahaz((ahbh)apaf.a);
            }
            case 3: {
                return new apaf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apaf.a, "\u0001\u0001\u0000\u0001\ufc5c\u3fe1\ufc5c\u3fe1\u0001\u0000\u0000\u0001\ufc5c\u3fe1\u1409\u0000", new Object[] { "c", "d" });
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
