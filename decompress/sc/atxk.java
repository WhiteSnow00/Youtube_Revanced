import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxk extends ahbh implements ahcw
{
    public static final atxk a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public long d;
    public atxf e;
    
    static {
        ahbh.registerDefaultInstance((Class)atxk.class, (ahbh)(a = new atxk()));
    }
    
    private atxk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = atxk.f) == null) {
                    synchronized (atxk.class) {
                        if (atxk.f == null) {
                            atxk.f = (ahdd)new ahba((ahbh)atxk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atxk.a;
            }
            case 4: {
                return new ahaz((ahbh)atxk.a);
            }
            case 3: {
                return new atxk();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
