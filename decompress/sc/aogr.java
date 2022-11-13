import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogr extends ahbh implements ahcw
{
    public static final aogr a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogr.class, (ahbh)(a = new aogr()));
    }
    
    private aogr() {
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
                if ((d = aogr.d) == null) {
                    synchronized (aogr.class) {
                        if (aogr.d == null) {
                            aogr.d = (ahdd)new ahba((ahbh)aogr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogr.a;
            }
            case 4: {
                return new ahaz((ahbh)aogr.a);
            }
            case 3: {
                return new aogr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogr.a, "\u0001\u0001\u0001\u0000\ue1ae\u38da\ue1ae\u38da\u0001\u0000\u0000\u0001\ue1ae\u38da\u143c\u0000", new Object[] { "c", "b", aona.class });
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
