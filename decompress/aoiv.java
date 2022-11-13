import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiv extends ahbh implements ahcw
{
    public static final aoiv a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public anuv d;
    public ahab e;
    private ajut g;
    private ahhu h;
    private aiqj i;
    private anuv j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoiv.class, (ahbh)(a = new aoiv()));
    }
    
    private aoiv() {
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
                final ahdd f;
                if ((f = aoiv.f) == null) {
                    synchronized (aoiv.class) {
                        if (aoiv.f == null) {
                            aoiv.f = (ahdd)new ahba((ahbh)aoiv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoiv.a;
            }
            case 4: {
                return new ahaz((ahbh)aoiv.a);
            }
            case 3: {
                return new aoiv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoiv.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "g", "d", "h", "e", "i", "j" });
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
