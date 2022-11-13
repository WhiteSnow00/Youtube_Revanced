import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpk extends ahbh implements ahcw
{
    public static final agpk a;
    private static volatile ahdd d;
    public String b;
    public ahbx c;
    
    static {
        ahbh.registerDefaultInstance((Class)agpk.class, (ahbh)(a = new agpk()));
    }
    
    private agpk() {
        this.b = "";
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agpk.d) == null) {
                    synchronized (agpk.class) {
                        if (agpk.d == null) {
                            agpk.d = (ahdd)new ahba((ahbh)agpk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agpk.a;
            }
            case 4: {
                return new ahaz((ahbh)agpk.a);
            }
            case 3: {
                return new agpk();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpk.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", new Object[] { "b", "c" });
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
