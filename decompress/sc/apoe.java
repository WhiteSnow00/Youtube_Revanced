import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoe extends ahbh implements ahcw
{
    public static final apoe a;
    private static volatile ahdd b;
    private int c;
    private alkr d;
    private alkq e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apoe.class, (ahbh)(a = new apoe()));
    }
    
    private apoe() {
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
                final ahdd b;
                if ((b = apoe.b) == null) {
                    synchronized (apoe.class) {
                        if (apoe.b == null) {
                            apoe.b = (ahdd)new ahba((ahbh)apoe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoe.a;
            }
            case 4: {
                return new ahaz((ahbh)apoe.a);
            }
            case 3: {
                return new apoe();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoe.a, "\u0001\u0002\u0000\u0001\ufd1c\u209f\uf421\u2202\u0002\u0000\u0000\u0002\ufd1c\u209f\u1409\u0000\uf421\u2202\u1409\u0001", new Object[] { "c", "d", "e" });
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
