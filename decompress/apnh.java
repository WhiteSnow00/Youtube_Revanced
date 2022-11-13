import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnh extends ahbh implements ahcw
{
    public static final apnh a;
    private static volatile ahdd d;
    public int b;
    public amhw c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apnh.class, (ahbh)(a = new apnh()));
    }
    
    private apnh() {
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
                final ahdd d;
                if ((d = apnh.d) == null) {
                    synchronized (apnh.class) {
                        if (apnh.d == null) {
                            apnh.d = (ahdd)new ahba((ahbh)apnh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apnh.a;
            }
            case 4: {
                return new ahaz((ahbh)apnh.a);
            }
            case 3: {
                return new apnh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnh.a, "\u0001\u0001\u0000\u0001\ue5b3\u21fc\ue5b3\u21fc\u0001\u0000\u0000\u0001\ue5b3\u21fc\u1409\u0000", new Object[] { "b", "c" });
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
