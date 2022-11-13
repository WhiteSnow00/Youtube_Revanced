import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aofw extends ahbh implements ahcw
{
    public static final aofw a;
    private static volatile ahdd d;
    public aotp b;
    public ajut c;
    private int e;
    private ajut f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aofw.class, (ahbh)(a = new aofw()));
    }
    
    private aofw() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aofw.d) == null) {
                    synchronized (aofw.class) {
                        if (aofw.d == null) {
                            aofw.d = (ahdd)new ahba((ahbh)aofw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aofw.a;
            }
            case 4: {
                return new ahaz((ahbh)aofw.a);
            }
            case 3: {
                return new aofw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aofw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
