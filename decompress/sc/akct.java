import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akct extends ahbh implements ahcw
{
    public static final akct a;
    private static volatile ahdd b;
    private ahcr c;
    
    static {
        ahbh.registerDefaultInstance((Class)akct.class, (ahbh)(a = new akct()));
    }
    
    private akct() {
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
                if ((b = akct.b) == null) {
                    synchronized (akct.class) {
                        if (akct.b == null) {
                            akct.b = (ahdd)new ahba((ahbh)akct.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akct.a;
            }
            case 4: {
                return new ahaz((ahbh)akct.a);
            }
            case 3: {
                return new akct();
            }
            case 2: {
                return newMessageInfo((MessageLite)akct.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", akcs.a });
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
