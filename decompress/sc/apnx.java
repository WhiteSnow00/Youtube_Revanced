import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnx extends ahbh implements ahcw
{
    public static final apnx a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnx.class, (ahbh)(a = new apnx()));
    }
    
    private apnx() {
        this.e = 2;
        final ahab b = ahab.b;
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
                if ((b = apnx.b) == null) {
                    synchronized (apnx.class) {
                        if (apnx.b == null) {
                            apnx.b = (ahdd)new ahba((ahbh)apnx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnx.a;
            }
            case 4: {
                return new ahaz((ahbh)apnx.a);
            }
            case 3: {
                return new apnx();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
