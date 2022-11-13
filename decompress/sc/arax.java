import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arax extends ahbh implements ahcw
{
    public static final arax a;
    private static volatile ahdd b;
    private ahcr c;
    
    static {
        ahbh.registerDefaultInstance((Class)arax.class, (ahbh)(a = new arax()));
    }
    
    private arax() {
        this.c = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = arax.b) == null) {
                    synchronized (arax.class) {
                        if (arax.b == null) {
                            arax.b = (ahdd)new ahba((ahbh)arax.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arax.a;
            }
            case 4: {
                return new ahaz((ahbh)arax.a);
            }
            case 3: {
                return new arax();
            }
            case 2: {
                return newMessageInfo((MessageLite)arax.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", araw.a });
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
