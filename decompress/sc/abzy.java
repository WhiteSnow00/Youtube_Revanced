import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abzy extends ahbh implements ahcw
{
    public static final abzy a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)abzy.class, (ahbh)(a = new abzy()));
    }
    
    private abzy() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = abzy.c) == null) {
                    synchronized (abzy.class) {
                        if (abzy.c == null) {
                            abzy.c = (ahdd)new ahba((ahbh)abzy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return abzy.a;
            }
            case 4: {
                return new ahaz((ahbh)abzy.a);
            }
            case 3: {
                return new abzy();
            }
            case 2: {
                return newMessageInfo((MessageLite)abzy.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
