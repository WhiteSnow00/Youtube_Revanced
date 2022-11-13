import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrk extends ahbh implements ahcw
{
    public static final agrk a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public String e;
    private ahcr g;
    
    static {
        ahbh.registerDefaultInstance((Class)agrk.class, (ahbh)(a = new agrk()));
    }
    
    private agrk() {
        this.g = ahcr.a;
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agrk.f) == null) {
                    synchronized (agrk.class) {
                        if (agrk.f == null) {
                            agrk.f = (ahdd)new ahba((ahbh)agrk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agrk.a;
            }
            case 4: {
                return new ahaz((ahbh)agrk.a);
            }
            case 3: {
                return new agrk();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrk.a, "\u0001\u0004\u0000\u0001\u0006\u0010\u0004\u0001\u0000\u0000\u0006\u1004\u0005\u0007\u1004\u0006\b2\u0010\u1008\u000e", new Object[] { "b", "c", "d", "g", agrj.a, "e" });
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
