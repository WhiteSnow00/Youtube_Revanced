import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arag extends ahbh implements ahcw
{
    public static final arag a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)arag.class, (ahbh)(a = new arag()));
    }
    
    private arag() {
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
                final ahdd g;
                if ((g = arag.g) == null) {
                    synchronized (arag.class) {
                        if (arag.g == null) {
                            arag.g = (ahdd)new ahba((ahbh)arag.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arag.a;
            }
            case 4: {
                return new ahaz((ahbh)arag.a);
            }
            case 3: {
                return new arag();
            }
            case 2: {
                return newMessageInfo((MessageLite)arag.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0002\u0003\u1004\u0003\u0004\u1008\u0001", new Object[] { "b", "c", "e", "f", "d" });
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
