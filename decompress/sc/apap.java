import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apap extends ahbh implements ahcw
{
    public static final apap a;
    private static volatile ahdd g;
    public int b;
    public ahbp c;
    public aotu d;
    public aotu e;
    public aotu f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)apap.class, (ahbh)(a = new apap()));
    }
    
    private apap() {
        this.h = 2;
        this.c = emptyIntList();
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
                if ((g = apap.g) == null) {
                    synchronized (apap.class) {
                        if (apap.g == null) {
                            apap.g = (ahdd)new ahba((ahbh)apap.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apap.a;
            }
            case 4: {
                return new ahaz((ahbh)apap.a);
            }
            case 3: {
                return new apap();
            }
            case 2: {
                return newMessageInfo((MessageLite)apap.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u001d\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e", "f" });
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
