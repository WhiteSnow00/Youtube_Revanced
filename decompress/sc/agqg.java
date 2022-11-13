import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqg extends ahbh implements ahcw
{
    public static final agqg a;
    private static volatile ahdd e;
    public agqi b;
    public String c;
    public agpj d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqg.class, (ahbh)(a = new agqg()));
    }
    
    private agqg() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agqg.e) == null) {
                    synchronized (agqg.class) {
                        if (agqg.e == null) {
                            agqg.e = (ahdd)new ahba((ahbh)agqg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqg.a;
            }
            case 4: {
                return new ahaz((ahbh)agqg.a);
            }
            case 3: {
                return new agqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqg.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t", new Object[] { "b", "c", "d" });
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
