import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbx extends ahbh implements ahcw
{
    public static final apbx a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)apbx.class, (ahbh)(a = new apbx()));
    }
    
    private apbx() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apbx.b) == null) {
                    synchronized (apbx.class) {
                        if (apbx.b == null) {
                            apbx.b = (ahdd)new ahba((ahbh)apbx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbx.a;
            }
            case 4: {
                return new ahaz((ahbh)apbx.a);
            }
            case 3: {
                return new apbx();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
