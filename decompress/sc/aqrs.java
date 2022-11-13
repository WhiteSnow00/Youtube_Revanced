import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrs extends ahbh implements ahcw
{
    private static final aqrs a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private amfw e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrs.class, (ahbh)(a = new aqrs()));
    }
    
    private aqrs() {
        this.d = "";
    }
    
    public static aqrs b() {
        return aqrs.a;
    }
    
    public static aqrs c() {
        return aqrs.a;
    }
    
    public amfw a() {
        amfw amfw;
        if ((amfw = this.e) == null) {
            amfw = amfw.d();
        }
        return amfw;
    }
    
    public String d() {
        return this.d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqrs.b) == null) {
                    synchronized (aqrs.class) {
                        if (aqrs.b == null) {
                            aqrs.b = (ahdd)new ahba((ahbh)aqrs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrs.a;
            }
            case 4: {
                return new ahaz((ahbh)b());
            }
            case 3: {
                return new aqrs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "c", "d", "e" });
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
