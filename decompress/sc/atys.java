import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atys extends ahbh implements ahcw
{
    public static final atys a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)atys.class, (ahbh)(a = new atys()));
    }
    
    private atys() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atys.e) == null) {
                    synchronized (atys.class) {
                        if (atys.e == null) {
                            atys.e = (ahdd)new ahba((ahbh)atys.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atys.a;
            }
            case 4: {
                return new ahaz((ahbh)atys.a);
            }
            case 3: {
                return new atys();
            }
            case 2: {
                return newMessageInfo((MessageLite)atys.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
