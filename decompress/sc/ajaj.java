import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajaj extends ahbh implements ahcw
{
    public static final ajaj a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajaj.class, (ahbh)(a = new ajaj()));
    }
    
    private ajaj() {
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
                if ((d = ajaj.d) == null) {
                    synchronized (ajaj.class) {
                        if (ajaj.d == null) {
                            ajaj.d = (ahdd)new ahba((ahbh)ajaj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajaj.a;
            }
            case 4: {
                return new ahaz((ahbh)ajaj.a);
            }
            case 3: {
                return new ajaj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajaj.a, "\u0001\u0001\u0001\u0000\ue80a\u2ea3\ue80a\u2ea3\u0001\u0000\u0000\u0001\ue80a\u2ea3\u143c\u0000", new Object[] { "c", "b", aish.class });
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
