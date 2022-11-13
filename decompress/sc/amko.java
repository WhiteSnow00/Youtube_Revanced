import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amko extends ahbh implements ahcw
{
    public static final amko a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amko.class, (ahbh)(a = new amko()));
    }
    
    private amko() {
        this.b = 0;
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
                if ((d = amko.d) == null) {
                    synchronized (amko.class) {
                        if (amko.d == null) {
                            amko.d = (ahdd)new ahba((ahbh)amko.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amko.a;
            }
            case 4: {
                return new ahaz((ahbh)amko.a);
            }
            case 3: {
                return new amko();
            }
            case 2: {
                return newMessageInfo((MessageLite)amko.a, "\u0001\u0001\u0001\u0000\ueb08\u32d6\ueb08\u32d6\u0001\u0000\u0000\u0001\ueb08\u32d6\u143c\u0000", new Object[] { "c", "b", amkp.class });
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
