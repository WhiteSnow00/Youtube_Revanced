import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptq extends ahbh implements ahcw
{
    public static final aptq a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aptq.class, (ahbh)(a = new aptq()));
    }
    
    private aptq() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aptq.c) == null) {
                    synchronized (aptq.class) {
                        if (aptq.c == null) {
                            aptq.c = (ahdd)new ahba((ahbh)aptq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aptq.a;
            }
            case 4: {
                return new ahaz((ahbh)aptq.a);
            }
            case 3: {
                return new aptq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
