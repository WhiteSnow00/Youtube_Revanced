import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aged extends ahbh implements ahcw
{
    public static final aged a;
    private static volatile ahdd j;
    public int b;
    public agee c;
    public ahab d;
    public ahab e;
    public ahab f;
    public ahab g;
    public ahab h;
    public ahab i;
    
    static {
        ahbh.registerDefaultInstance((Class)aged.class, (ahbh)(a = new aged()));
    }
    
    private aged() {
        this.d = ahab.b;
        final ahab b = ahab.b;
        this.e = b;
        this.f = b;
        this.g = b;
        this.h = b;
        this.i = b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = aged.j) == null) {
                    synchronized (aged.class) {
                        if (aged.j == null) {
                            aged.j = (ahdd)new ahba((ahbh)aged.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aged.a;
            }
            case 4: {
                return new ahaz((ahbh)aged.a);
            }
            case 3: {
                return new aged();
            }
            case 2: {
                return newMessageInfo((MessageLite)aged.a, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
