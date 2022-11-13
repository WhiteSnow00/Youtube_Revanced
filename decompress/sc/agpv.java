import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpv extends ahbh implements ahcw
{
    public static final agpv a;
    private static volatile ahdd e;
    public agpg b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)agpv.class, (ahbh)(a = new agpv()));
    }
    
    private agpv() {
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
                final ahdd e;
                if ((e = agpv.e) == null) {
                    synchronized (agpv.class) {
                        if (agpv.e == null) {
                            agpv.e = (ahdd)new ahba((ahbh)agpv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agpv.a;
            }
            case 4: {
                return new ahaz((ahbh)agpv.a);
            }
            case 3: {
                return new agpv();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpv.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u021a\u0003\u0208", new Object[] { "b", "d", "c" });
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
