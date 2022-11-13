import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpo extends ahbh implements ahcw
{
    public static final agpo a;
    private static volatile ahdd f;
    public agqi b;
    public String c;
    public ahbx d;
    public agqf e;
    
    static {
        ahbh.registerDefaultInstance((Class)agpo.class, (ahbh)(a = new agpo()));
    }
    
    private agpo() {
        this.c = "";
        this.d = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agpo.f) == null) {
                    synchronized (agpo.class) {
                        if (agpo.f == null) {
                            agpo.f = (ahdd)new ahba((ahbh)agpo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agpo.a;
            }
            case 4: {
                return new ahaz((ahbh)agpo.a);
            }
            case 3: {
                return new agpo();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpo.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u021a\u0004\t", new Object[] { "b", "c", "d", "e" });
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
