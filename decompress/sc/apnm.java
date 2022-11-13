import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnm extends ahbh implements ahcw
{
    public static final apnm a;
    private static volatile ahdd c;
    public ajut b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnm.class, (ahbh)(a = new apnm()));
    }
    
    private apnm() {
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
                final ahdd c;
                if ((c = apnm.c) == null) {
                    synchronized (apnm.class) {
                        if (apnm.c == null) {
                            apnm.c = (ahdd)new ahba((ahbh)apnm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apnm.a;
            }
            case 4: {
                return new ahaz((ahbh)apnm.a);
            }
            case 3: {
                return new apnm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
