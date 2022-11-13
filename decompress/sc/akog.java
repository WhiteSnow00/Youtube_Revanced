import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akog extends ahbh implements ahcw
{
    public static final akog a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akog.class, (ahbh)(a = new akog()));
    }
    
    private akog() {
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
                if ((d = akog.d) == null) {
                    synchronized (akog.class) {
                        if (akog.d == null) {
                            akog.d = (ahdd)new ahba((ahbh)akog.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akog.a;
            }
            case 4: {
                return new ahaz((ahbh)akog.a);
            }
            case 3: {
                return new akog();
            }
            case 2: {
                return newMessageInfo((MessageLite)akog.a, "\u0001\u0002\u0001\u0000\ue55e\u2847\ued00\u32da\u0002\u0000\u0000\u0002\ue55e\u2847\u143c\u0000\ued00\u32da\u143c\u0000", new Object[] { "c", "b", aopj.class, akoa.class });
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
