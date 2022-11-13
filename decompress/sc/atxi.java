import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxi extends ahbh implements ahcw
{
    public static final atxi a;
    private static volatile ahdd j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public atxf i;
    
    static {
        ahbh.registerDefaultInstance((Class)atxi.class, (ahbh)(a = new atxi()));
    }
    
    private atxi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = atxi.j) == null) {
                    synchronized (atxi.class) {
                        if (atxi.j == null) {
                            atxi.j = (ahdd)new ahba((ahbh)atxi.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return atxi.a;
            }
            case 4: {
                return new ahaz((ahbh)atxi.a);
            }
            case 3: {
                return new atxi();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxi.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1009\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
