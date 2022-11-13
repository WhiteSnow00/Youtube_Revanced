import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apon extends ahbh implements ahcw
{
    public static final apon a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public apkv d;
    public apkv e;
    
    static {
        ahbh.registerDefaultInstance((Class)apon.class, (ahbh)(a = new apon()));
    }
    
    private apon() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apon.f) == null) {
                    synchronized (apon.class) {
                        if (apon.f == null) {
                            apon.f = (ahdd)new ahba((ahbh)apon.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apon.a;
            }
            case 4: {
                return new ahaz((ahbh)apon.a);
            }
            case 3: {
                return new apon();
            }
            case 2: {
                return newMessageInfo((MessageLite)apon.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
