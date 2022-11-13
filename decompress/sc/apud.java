import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apud extends ahbh implements ahcw
{
    public static final apud a;
    private static volatile ahdd b;
    private int c;
    private apub d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apud.class, (ahbh)(a = new apud()));
    }
    
    private apud() {
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
                if ((b = apud.b) == null) {
                    synchronized (apud.class) {
                        if (apud.b == null) {
                            apud.b = (ahdd)new ahba((ahbh)apud.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apud.a;
            }
            case 4: {
                return new ahaz((ahbh)apud.a);
            }
            case 3: {
                return new apud();
            }
            case 2: {
                return newMessageInfo((MessageLite)apud.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
