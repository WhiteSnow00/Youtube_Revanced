import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aram extends ahbh implements ahcw
{
    public static final aram a;
    private static volatile ahdd f;
    public int b;
    public aqxx c;
    public String d;
    public aran e;
    
    static {
        ahbh.registerDefaultInstance((Class)aram.class, (ahbh)(a = new aram()));
    }
    
    private aram() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aram.f) == null) {
                    synchronized (aram.class) {
                        if (aram.f == null) {
                            aram.f = (ahdd)new ahba((ahbh)aram.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aram.a;
            }
            case 4: {
                return new ahaz((ahbh)aram.a);
            }
            case 3: {
                return new aram();
            }
            case 2: {
                return newMessageInfo((MessageLite)aram.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
