import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqko extends ahbh implements ahcw
{
    public static final aqko a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqko.class, (ahbh)(a = new aqko()));
    }
    
    private aqko() {
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
                if ((d = aqko.d) == null) {
                    synchronized (aqko.class) {
                        if (aqko.d == null) {
                            aqko.d = (ahdd)new ahba((ahbh)aqko.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqko.a;
            }
            case 4: {
                return new ahaz((ahbh)aqko.a);
            }
            case 3: {
                return new aqko();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqko.a, "\u0001\u0002\u0001\u0000\u0001\u001d\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u001d\u143c\u0000", new Object[] { "c", "b", aqgi.class, aqkk.class });
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
