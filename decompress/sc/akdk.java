import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdk extends ahbh implements ahcw
{
    public static final akdk a;
    private static volatile ahdd d;
    public int b;
    public akdi c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akdk.class, (ahbh)(a = new akdk()));
    }
    
    private akdk() {
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
                if ((d = akdk.d) == null) {
                    synchronized (akdk.class) {
                        if (akdk.d == null) {
                            akdk.d = (ahdd)new ahba((ahbh)akdk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdk.a;
            }
            case 4: {
                return new ahaz((ahbh)akdk.a);
            }
            case 3: {
                return new akdk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
