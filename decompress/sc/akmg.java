import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmg extends ahbh implements ahcw
{
    public static final akmg a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akmg.class, (ahbh)(a = new akmg()));
    }
    
    private akmg() {
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
                if ((d = akmg.d) == null) {
                    synchronized (akmg.class) {
                        if (akmg.d == null) {
                            akmg.d = (ahdd)new ahba((ahbh)akmg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmg.a;
            }
            case 4: {
                return new ahaz((ahbh)akmg.a);
            }
            case 3: {
                return new akmg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmg.a, "\u0001\u0001\u0001\u0000\uefb0\u435b\uefb0\u435b\u0001\u0000\u0000\u0001\uefb0\u435b\u143c\u0000", new Object[] { "c", "b", amkc.class });
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
