import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyl extends ahbh implements ahcw
{
    public static final atyl a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)atyl.class, (ahbh)(a = new atyl()));
    }
    
    private atyl() {
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
                if ((d = atyl.d) == null) {
                    synchronized (atyl.class) {
                        if (atyl.d == null) {
                            atyl.d = (ahdd)new ahba((ahbh)atyl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atyl.a;
            }
            case 4: {
                return new ahaz((ahbh)atyl.a);
            }
            case 3: {
                return new atyl();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
