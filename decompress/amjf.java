import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjf extends ahbh implements ahcw
{
    public static final amjf a;
    private static volatile ahdd b;
    private int c;
    private aicz d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amjf.class, (ahbh)(a = new amjf()));
    }
    
    private amjf() {
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
                if ((b = amjf.b) == null) {
                    synchronized (amjf.class) {
                        if (amjf.b == null) {
                            amjf.b = (ahdd)new ahba((ahbh)amjf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjf.a;
            }
            case 4: {
                return new ahaz((ahbh)amjf.a);
            }
            case 3: {
                return new amjf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjf.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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
