import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfo extends ahbh implements ahcw
{
    public static final anfo a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anfo.class, (ahbh)(a = new anfo()));
    }
    
    private anfo() {
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
                if ((b = anfo.b) == null) {
                    synchronized (anfo.class) {
                        if (anfo.b == null) {
                            anfo.b = (ahdd)new ahba((ahbh)anfo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anfo.a;
            }
            case 4: {
                return new ahaz((ahbh)anfo.a);
            }
            case 3: {
                return new anfo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfo.a, "\u0001\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0001\f\u1409\b", new Object[] { "c", "d" });
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
