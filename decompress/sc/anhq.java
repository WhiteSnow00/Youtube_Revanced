import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhq extends ahbh implements ahcw
{
    public static final anhq a;
    public static final ahbf b;
    private static volatile ahdd i;
    public int c;
    public String d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    
    static {
        final anhq a2 = new anhq();
        ahbh.registerDefaultInstance((Class)anhq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 326, ahek.k, (Class)anhq.class);
    }
    
    private anhq() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = anhq.i) == null) {
                    synchronized (anhq.class) {
                        if (anhq.i == null) {
                            anhq.i = (ahdd)new ahba((ahbh)anhq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anhq.a;
            }
            case 4: {
                return new ahaz((ahbh)anhq.a);
            }
            case 3: {
                return new anhq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhq.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
