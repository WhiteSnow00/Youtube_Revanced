import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqty extends ahbc implements ahbd
{
    public static final aqty a;
    private static volatile ahdd b;
    private ahcr c;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqty.class, (ahbh)(a = new aqty()));
    }
    
    private aqty() {
        this.c = ahcr.a;
        this.d = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqty.b) == null) {
                    synchronized (aqty.class) {
                        if (aqty.b == null) {
                            aqty.b = (ahdd)new ahba((ahbh)aqty.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqty.a;
            }
            case 4: {
                return new ahbb((ahbc)aqty.a);
            }
            case 3: {
                return new aqty();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqty.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0432", new Object[] { "c", aqtx.a });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
