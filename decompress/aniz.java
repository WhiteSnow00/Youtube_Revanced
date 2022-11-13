import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniz extends ahbh implements ahcw
{
    public static final aniz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aniz.class, (ahbh)(a = new aniz()));
    }
    
    private aniz() {
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
                if ((d = aniz.d) == null) {
                    synchronized (aniz.class) {
                        if (aniz.d == null) {
                            aniz.d = (ahdd)new ahba((ahbh)aniz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aniz.a;
            }
            case 4: {
                return new ahaz((ahbh)aniz.a);
            }
            case 3: {
                return new aniz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aniz.a, "\u0001\u0002\u0001\u0000\ue528\u1ce2\ueb11\u1f11\u0002\u0000\u0000\u0002\ue528\u1ce2\u143c\u0000\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", amxe.class, aicz.class });
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
