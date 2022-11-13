import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnw extends ahbh implements ahcw
{
    public static final apnw a;
    private static volatile ahdd b;
    private int c;
    private apnx d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnw.class, (ahbh)(a = new apnw()));
    }
    
    private apnw() {
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
                if ((b = apnw.b) == null) {
                    synchronized (apnw.class) {
                        if (apnw.b == null) {
                            apnw.b = (ahdd)new ahba((ahbh)apnw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnw.a;
            }
            case 4: {
                return new ahaz((ahbh)apnw.a);
            }
            case 3: {
                return new apnw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnw.a, "\u0001\u0001\u0000\u0001\ue2f3\u2437\ue2f3\u2437\u0001\u0000\u0000\u0001\ue2f3\u2437\u1409\u0000", new Object[] { "c", "d" });
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
