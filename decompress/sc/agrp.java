import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrp extends ahbh implements ahcw
{
    public static final agrp a;
    private static volatile ahdd c;
    public ahcr b;
    private ahcr d;
    private ahcr e;
    
    static {
        ahbh.registerDefaultInstance((Class)agrp.class, (ahbh)(a = new agrp()));
    }
    
    private agrp() {
        this.b = ahcr.a;
        final ahcr a = ahcr.a;
        this.d = a;
        this.e = a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = agrp.c) == null) {
                    synchronized (agrp.class) {
                        if (agrp.c == null) {
                            agrp.c = (ahdd)new ahba((ahbh)agrp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrp.a;
            }
            case 4: {
                return new ahaz((ahbh)agrp.a);
            }
            case 3: {
                return new agrp();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrp.a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u0002\u0832\u00032", new Object[] { "b", agrm.a, "e", agrl.a, afqo.i, "d", agro.a });
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
