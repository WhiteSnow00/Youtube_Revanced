import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomy extends ahbh implements ahcw
{
    public static final aomy a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomy.class, (ahbh)(a = new aomy()));
    }
    
    private aomy() {
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
                if ((d = aomy.d) == null) {
                    synchronized (aomy.class) {
                        if (aomy.d == null) {
                            aomy.d = (ahdd)new ahba((ahbh)aomy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomy.a;
            }
            case 4: {
                return new ahaz((ahbh)aomy.a);
            }
            case 3: {
                return new aomy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomy.a, "\u0001\u0001\u0001\u0000\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aicz.class });
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