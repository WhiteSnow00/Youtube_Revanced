import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfi extends ahbh implements ahcw
{
    public static final akfi a;
    private static volatile ahdd d;
    public int b;
    public aiqj c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akfi.class, (ahbh)(a = new akfi()));
    }
    
    private akfi() {
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
                if ((d = akfi.d) == null) {
                    synchronized (akfi.class) {
                        if (akfi.d == null) {
                            akfi.d = (ahdd)new ahba((ahbh)akfi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akfi.a;
            }
            case 4: {
                return new ahaz((ahbh)akfi.a);
            }
            case 3: {
                return new akfi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
