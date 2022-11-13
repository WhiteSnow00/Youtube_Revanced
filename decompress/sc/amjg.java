import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjg extends ahbh implements ahcw
{
    public static final amjg a;
    private static volatile ahdd b;
    private int c;
    private alfo d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjg.class, (ahbh)(a = new amjg()));
    }
    
    private amjg() {
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
                if ((b = amjg.b) == null) {
                    synchronized (amjg.class) {
                        if (amjg.b == null) {
                            amjg.b = (ahdd)new ahba((ahbh)amjg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjg.a;
            }
            case 4: {
                return new ahaz((ahbh)amjg.a);
            }
            case 3: {
                return new amjg();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjg.a, "\u0001\u0001\u0000\u0001\ue6c8\u3b15\ue6c8\u3b15\u0001\u0000\u0000\u0001\ue6c8\u3b15\u1409\u0000", new Object[] { "c", "d" });
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
