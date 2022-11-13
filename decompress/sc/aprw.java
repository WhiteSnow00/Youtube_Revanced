import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprw extends ahbh implements ahcw
{
    public static final aprw a;
    private static volatile ahdd f;
    public int b;
    public aotp c;
    public aiqj d;
    public ajut e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aprw.class, (ahbh)(a = new aprw()));
    }
    
    private aprw() {
        this.h = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aprw.f) == null) {
                    synchronized (aprw.class) {
                        if (aprw.f == null) {
                            aprw.f = (ahdd)new ahba((ahbh)aprw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aprw.a;
            }
            case 4: {
                return new ahaz((ahbh)aprw.a);
            }
            case 3: {
                return new aprw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
