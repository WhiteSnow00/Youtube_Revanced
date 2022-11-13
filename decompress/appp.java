import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appp extends ahbh implements ahcw
{
    public static final appp a;
    private static volatile ahdd d;
    public String b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)appp.class, (ahbh)(a = new appp()));
    }
    
    private appp() {
        this.b = "";
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
                if ((d = appp.d) == null) {
                    synchronized (appp.class) {
                        if (appp.d == null) {
                            appp.d = (ahdd)new ahba((ahbh)appp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appp.a;
            }
            case 4: {
                return new ahaz((ahbh)appp.a);
            }
            case 3: {
                return new appp();
            }
            case 2: {
                return newMessageInfo((MessageLite)appp.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "b", "c" });
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
