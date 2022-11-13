import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfr extends ahbh implements ahcw
{
    public static final anfr a;
    private static volatile ahdd e;
    public int b;
    public ahab c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anfr.class, (ahbh)(a = new anfr()));
    }
    
    private anfr() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anfr.e) == null) {
                    synchronized (anfr.class) {
                        if (anfr.e == null) {
                            anfr.e = (ahdd)new ahba((ahbh)anfr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anfr.a;
            }
            case 4: {
                return new ahaz((ahbh)anfr.a);
            }
            case 3: {
                return new anfr();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
