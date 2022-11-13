import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknl extends ahbh implements ahcw
{
    public static final aknl a;
    private static volatile ahdd h;
    public int b;
    public akli c;
    public ajnc d;
    public ahab e;
    public akwz f;
    public ajnl g;
    private ahhu i;
    private ajnk j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aknl.class, (ahbh)(a = new aknl()));
    }
    
    private aknl() {
        this.k = 2;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aknl.h) == null) {
                    synchronized (aknl.class) {
                        if (aknl.h == null) {
                            aknl.h = (ahdd)new ahba((ahbh)aknl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aknl.a;
            }
            case 4: {
                return new ahaz((ahbh)aknl.a);
            }
            case 3: {
                return new aknl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknl.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003\u0006\u1409\u0004\u0007\u1009\u0006\n\u1409\u0005", new Object[] { "b", "c", "d", "i", "e", "j", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
