import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovl extends ahbh implements ahcw
{
    public static final aovl a;
    private static volatile ahdd g;
    public ajut b;
    public aotp c;
    public ajut d;
    public anuv e;
    public ahab f;
    private int h;
    private aiqj i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aovl.class, (ahbh)(a = new aovl()));
    }
    
    private aovl() {
        this.k = 2;
        this.f = ahab.b;
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
                final ahdd g;
                if ((g = aovl.g) == null) {
                    synchronized (aovl.class) {
                        if (aovl.g == null) {
                            aovl.g = (ahdd)new ahba((ahbh)aovl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aovl.a;
            }
            case 4: {
                return new ahaz((ahbh)aovl.a);
            }
            case 3: {
                return new aovl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovl.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0006", new Object[] { "h", "b", "c", "d", "e", "i", "f", "j" });
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
