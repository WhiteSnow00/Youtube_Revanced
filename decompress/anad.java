import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anad extends ahbh implements ahcw
{
    public static final anad a;
    private static volatile ahdd c;
    public anae b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anad.class, (ahbh)(a = new anad()));
    }
    
    private anad() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anad.c) == null) {
                    synchronized (anad.class) {
                        if (anad.c == null) {
                            anad.c = (ahdd)new ahba((ahbh)anad.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anad.a;
            }
            case 4: {
                return new ahaz((ahbh)anad.a);
            }
            case 3: {
                return new anad();
            }
            case 2: {
                return newMessageInfo((MessageLite)anad.a, "\u0001\u0001\u0000\u0001\ue947\u3f83\ue947\u3f83\u0001\u0000\u0000\u0001\ue947\u3f83\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
