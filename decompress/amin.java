import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amin extends ahbh implements ahcw
{
    public static final amin a;
    private static volatile ahdd i;
    public int b;
    public amik c;
    public amik d;
    public amip e;
    public amik f;
    public ajut g;
    public amik h;
    private amim j;
    private amik k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)amin.class, (ahbh)(a = new amin()));
    }
    
    private amin() {
        this.m = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = amin.i) == null) {
                    synchronized (amin.class) {
                        if (amin.i == null) {
                            amin.i = (ahdd)new ahba((ahbh)amin.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amin.a;
            }
            case 4: {
                return new ahaz((ahbh)amin.a);
            }
            case 3: {
                return new amin();
            }
            case 2: {
                return newMessageInfo((MessageLite)amin.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "b", "j", "c", "k", "d", "e", "f", "l", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
