import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomu extends ahbh implements ahcw
{
    public static final aomu a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aomu.class, (ahbh)(a = new aomu()));
    }
    
    private aomu() {
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
                if ((e = aomu.e) == null) {
                    synchronized (aomu.class) {
                        if (aomu.e == null) {
                            aomu.e = (ahdd)new ahba((ahbh)aomu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aomu.a;
            }
            case 4: {
                return new ahaz((ahbh)aomu.a);
            }
            case 3: {
                return new aomu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aomv.a() });
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
