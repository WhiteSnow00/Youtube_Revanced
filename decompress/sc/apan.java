import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apan extends ahbh implements ahcw
{
    public static final apan a;
    private static volatile ahdd d;
    public int b;
    public apam c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apan.class, (ahbh)(a = new apan()));
    }
    
    private apan() {
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
                if ((d = apan.d) == null) {
                    synchronized (apan.class) {
                        if (apan.d == null) {
                            apan.d = (ahdd)new ahba((ahbh)apan.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apan.a;
            }
            case 4: {
                return new ahaz((ahbh)apan.a);
            }
            case 3: {
                return new apan();
            }
            case 2: {
                return newMessageInfo((MessageLite)apan.a, "\u0001\u0001\u0000\u0001\uee1e\u2b1f\uee1e\u2b1f\u0001\u0000\u0000\u0001\uee1e\u2b1f\u1409\u0000", new Object[] { "b", "c" });
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
