import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apop extends ahbh implements ahcw
{
    public static final apop a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public apkv d;
    public apkv e;
    public String f;
    
    static {
        ahbh.registerDefaultInstance((Class)apop.class, (ahbh)(a = new apop()));
    }
    
    private apop() {
        this.c = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = apop.g) == null) {
                    synchronized (apop.class) {
                        if (apop.g == null) {
                            apop.g = (ahdd)new ahba((ahbh)apop.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apop.a;
            }
            case 4: {
                return new ahaz((ahbh)apop.a);
            }
            case 3: {
                return new apop();
            }
            case 2: {
                return newMessageInfo((MessageLite)apop.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
