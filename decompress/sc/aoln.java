import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoln extends ahbh implements ahcw
{
    public static final aoln a;
    private static volatile ahdd i;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public ahab g;
    public int h;
    
    static {
        ahbh.registerDefaultInstance((Class)aoln.class, (ahbh)(a = new aoln()));
    }
    
    private aoln() {
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aoln.i) == null) {
                    synchronized (aoln.class) {
                        if (aoln.i == null) {
                            aoln.i = (ahdd)new ahba((ahbh)aoln.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoln.a;
            }
            case 4: {
                return new ahaz((ahbh)aoln.a);
            }
            case 3: {
                return new aoln();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoln.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1003\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u100a\u0004\u0006\u100b\u0005", new Object[] { "b", "c", "d", "e", aola.f, "f", ajek.i, "g", "h" });
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
