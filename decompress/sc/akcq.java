import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcq extends ahbh implements ahcw
{
    public static final akcq a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)akcq.class, (ahbh)(a = new akcq()));
    }
    
    private akcq() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akcq.e) == null) {
                    synchronized (akcq.class) {
                        if (akcq.e == null) {
                            akcq.e = (ahdd)new ahba((ahbh)akcq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akcq.a;
            }
            case 4: {
                return new ahaz((ahbh)akcq.a);
            }
            case 3: {
                return new akcq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akcq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
