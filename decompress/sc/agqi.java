import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqi extends ahbh implements ahcw
{
    public static final agqi a;
    private static volatile ahdd f;
    public String b;
    public int c;
    public agps d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)agqi.class, (ahbh)(a = new agqi()));
    }
    
    private agqi() {
        this.b = "";
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agqi.f) == null) {
                    synchronized (agqi.class) {
                        if (agqi.f == null) {
                            agqi.f = (ahdd)new ahba((ahbh)agqi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqi.a;
            }
            case 4: {
                return new ahaz((ahbh)agqi.a);
            }
            case 3: {
                return new agqi();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqi.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0004\t\u0005\f", new Object[] { "b", "c", "d", "e" });
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
