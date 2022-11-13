import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnv extends ahbh implements ahcw
{
    public static final apnv a;
    private static volatile ahdd b;
    private int c;
    private appa d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnv.class, (ahbh)(a = new apnv()));
    }
    
    private apnv() {
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
                if ((b = apnv.b) == null) {
                    synchronized (apnv.class) {
                        if (apnv.b == null) {
                            apnv.b = (ahdd)new ahba((ahbh)apnv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnv.a;
            }
            case 4: {
                return new ahaz((ahbh)apnv.a);
            }
            case 3: {
                return new apnv();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnv.a, "\u0001\u0001\u0000\u0001\ueaf2\u2166\ueaf2\u2166\u0001\u0000\u0000\u0001\ueaf2\u2166\u1409\u0000", new Object[] { "c", "d" });
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
