import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquc extends ahbh implements ahcw
{
    public static final aquc a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aquc.class, (ahbh)(a = new aquc()));
    }
    
    private aquc() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aquc.d) == null) {
                    synchronized (aquc.class) {
                        if (aquc.d == null) {
                            aquc.d = (ahdd)new ahba((ahbh)aquc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aquc.a;
            }
            case 4: {
                return new ahaz((ahbh)aquc.a);
            }
            case 3: {
                return new aquc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aquc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
