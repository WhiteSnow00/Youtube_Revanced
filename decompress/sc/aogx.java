import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogx extends ahbh implements ahcw
{
    public static final aogx a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogx.class, (ahbh)(a = new aogx()));
    }
    
    private aogx() {
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
                if ((d = aogx.d) == null) {
                    synchronized (aogx.class) {
                        if (aogx.d == null) {
                            aogx.d = (ahdd)new ahba((ahbh)aogx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogx.a;
            }
            case 4: {
                return new ahaz((ahbh)aogx.a);
            }
            case 3: {
                return new aogx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogx.a, "\u0001\u0001\u0001\u0000\ue1ae\u38da\ue1ae\u38da\u0001\u0000\u0000\u0001\ue1ae\u38da\u143c\u0000", new Object[] { "c", "b", aona.class });
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
