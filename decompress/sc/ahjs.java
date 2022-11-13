import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjs extends ahbh implements ahcw
{
    public static final ahjs a;
    private static volatile ahdd d;
    public int b;
    public ahjr c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjs.class, (ahbh)(a = new ahjs()));
    }
    
    private ahjs() {
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
                if ((d = ahjs.d) == null) {
                    synchronized (ahjs.class) {
                        if (ahjs.d == null) {
                            ahjs.d = (ahdd)new ahba((ahbh)ahjs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjs.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjs.a);
            }
            case 3: {
                return new ahjs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjs.a, "\u0001\u0001\u0000\u0001\uea62\u23b7\uea62\u23b7\u0001\u0000\u0000\u0001\uea62\u23b7\u1409\u0000", new Object[] { "b", "c" });
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
