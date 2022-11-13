import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprg extends ahbh implements ahcw
{
    public static final aprg a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aprg.class, (ahbh)(a = new aprg()));
    }
    
    private aprg() {
        this.b = 0;
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
                final ahdd d;
                if ((d = aprg.d) == null) {
                    synchronized (aprg.class) {
                        if (aprg.d == null) {
                            aprg.d = (ahdd)new ahba((ahbh)aprg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprg.a;
            }
            case 4: {
                return new ahaz((ahbh)aprg.a);
            }
            case 3: {
                return new aprg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprg.a, "\u0001\u0001\u0001\u0000\uf189\u383b\uf189\u383b\u0001\u0000\u0000\u0001\uf189\u383b\u143c\u0000", new Object[] { "c", "b", aprq.class });
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
