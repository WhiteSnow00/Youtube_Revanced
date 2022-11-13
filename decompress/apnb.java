import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnb extends ahbh implements ahcw
{
    public static final apnb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)apnb.class, (ahbh)(a = new apnb()));
    }
    
    private apnb() {
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
                if ((b = apnb.b) == null) {
                    synchronized (apnb.class) {
                        if (apnb.b == null) {
                            apnb.b = (ahdd)new ahba((ahbh)apnb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnb.a;
            }
            case 4: {
                return new ahaz((ahbh)apnb.a);
            }
            case 3: {
                return new apnb();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnb.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
