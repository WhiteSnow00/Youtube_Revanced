import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqf extends ahbh implements ahcw
{
    public static final agqf a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)agqf.class, (ahbh)(a = new agqf()));
    }
    
    private agqf() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agqf.d) == null) {
                    synchronized (agqf.class) {
                        if (agqf.d == null) {
                            agqf.d = (ahdd)new ahba((ahbh)agqf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqf.a;
            }
            case 4: {
                return new ahaz((ahbh)agqf.a);
            }
            case 3: {
                return new agqf();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqf.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "b", "c" });
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
