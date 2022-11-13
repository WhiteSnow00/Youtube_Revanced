import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovc extends ahbh implements ahcw
{
    private static final aovc a;
    private static volatile ahdd b;
    private String c;
    private String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aovc.class, (ahbh)(a = new aovc()));
    }
    
    private aovc() {
        this.c = "";
        this.d = "";
    }
    
    public static aovc a() {
        return aovc.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aovc.b) == null) {
                    synchronized (aovc.class) {
                        if (aovc.b == null) {
                            aovc.b = (ahdd)new ahba((ahbh)aovc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovc.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aovc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovc.a, "\u0001\u0000", (Object[])null);
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
