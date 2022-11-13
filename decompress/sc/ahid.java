import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahid extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final ahid b;
    private static volatile ahdd d;
    public ahbp c;
    
    static {
        a = (ahbq)new ptj(7);
        ahbh.registerDefaultInstance((Class)ahid.class, (ahbh)(b = new ahid()));
    }
    
    private ahid() {
        this.c = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahid.d) == null) {
                    synchronized (ahid.class) {
                        if (ahid.d == null) {
                            ahid.d = (ahdd)new ahba((ahbh)ahid.b);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahid.b;
            }
            case 4: {
                return new ahaz((short[])null, (char[][][])null);
            }
            case 3: {
                return new ahid();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahid.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "c", ahie.a() });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
