import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxq extends ahbh implements ahcw
{
    public static final atxq a;
    private static volatile ahdd j;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    
    static {
        ahbh.registerDefaultInstance((Class)atxq.class, (ahbh)(a = new atxq()));
    }
    
    private atxq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = atxq.j) == null) {
                    synchronized (atxq.class) {
                        if (atxq.j == null) {
                            atxq.j = (ahdd)new ahba((ahbh)atxq.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return atxq.a;
            }
            case 4: {
                return new ahaz((ahbh)atxq.a);
            }
            case 3: {
                return new atxq();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxq.a, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011\u1004\u0011\u0012\u1004\u0012\u0014\u1002\u0013\u0015\u1002\u0014\u0016\u1002\u0015\u0017\u1002\u0016\u0018\u1002\u0017", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
