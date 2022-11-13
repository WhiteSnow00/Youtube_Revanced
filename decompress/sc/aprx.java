import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprx extends ahbh implements ahcw
{
    public static final aprx a;
    private static volatile ahdd h;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajut f;
    public aiqj g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aprx.class, (ahbh)(a = new aprx()));
    }
    
    private aprx() {
        this.j = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aprx.h) == null) {
                    synchronized (aprx.class) {
                        if (aprx.h == null) {
                            aprx.h = (ahdd)new ahba((ahbh)aprx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aprx.a;
            }
            case 4: {
                return new ahaz((ahbh)aprx.a);
            }
            case 3: {
                return new aprx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprx.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
