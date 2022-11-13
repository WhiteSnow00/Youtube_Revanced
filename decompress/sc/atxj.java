import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxj extends ahbh implements ahcw
{
    public static final atxj a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public atxf e;
    
    static {
        ahbh.registerDefaultInstance((Class)atxj.class, (ahbh)(a = new atxj()));
    }
    
    private atxj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = atxj.f) == null) {
                    synchronized (atxj.class) {
                        if (atxj.f == null) {
                            atxj.f = (ahdd)new ahba((ahbh)atxj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atxj.a;
            }
            case 4: {
                return new ahaz((ahbh)atxj.a);
            }
            case 3: {
                return new atxj();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
