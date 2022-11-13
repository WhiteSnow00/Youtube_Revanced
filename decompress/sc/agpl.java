import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpl extends ahbh implements ahcw
{
    public static final agpl a;
    private static volatile ahdd f;
    public agqi b;
    public agpt c;
    public agpk d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)agpl.class, (ahbh)(a = new agpl()));
    }
    
    private agpl() {
        emptyProtobufList();
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agpl.f) == null) {
                    synchronized (agpl.class) {
                        if (agpl.f == null) {
                            agpl.f = (ahdd)new ahba((ahbh)agpl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agpl.a;
            }
            case 4: {
                return new ahaz((ahbh)agpl.a);
            }
            case 3: {
                return new agpl();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpl.a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006\u0208", new Object[] { "b", "c", "d", "e" });
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
