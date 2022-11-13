import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annf extends ahbh implements ahcw
{
    public static final annf a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)annf.class, (ahbh)(a = new annf()));
    }
    
    private annf() {
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
                if ((e = annf.e) == null) {
                    synchronized (annf.class) {
                        if (annf.e == null) {
                            annf.e = (ahdd)new ahba((ahbh)annf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return annf.a;
            }
            case 4: {
                return new ahaz((ahbh)annf.a);
            }
            case 3: {
                return new annf();
            }
            case 2: {
                return newMessageInfo((MessageLite)annf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
