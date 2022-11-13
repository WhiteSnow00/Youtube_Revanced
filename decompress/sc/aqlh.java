import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlh extends ahbh implements ahcw
{
    public static final aqlh a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlh.class, (ahbh)(a = new aqlh()));
    }
    
    private aqlh() {
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
                if ((e = aqlh.e) == null) {
                    synchronized (aqlh.class) {
                        if (aqlh.e == null) {
                            aqlh.e = (ahdd)new ahba((ahbh)aqlh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqlh.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlh.a);
            }
            case 3: {
                return new aqlh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
