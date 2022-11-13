import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjt extends ahbh implements ahcw
{
    public static final ahjt a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjt.class, (ahbh)(a = new ahjt()));
    }
    
    private ahjt() {
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
                if ((d = ahjt.d) == null) {
                    synchronized (ahjt.class) {
                        if (ahjt.d == null) {
                            ahjt.d = (ahdd)new ahba((ahbh)ahjt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjt.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjt.a);
            }
            case 3: {
                return new ahjt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjt.a, "\u0001\u0003\u0001\u0000\uff28\u1dbe\uf72c\u4c0d\u0003\u0000\u0000\u0003\uff28\u1dbe\u143c\u0000\ued6a\u25bb\u143c\u0000\uf72c\u4c0d\u143c\u0000", new Object[] { "c", "b", ahjq.class, aivd.class, aiyh.class });
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
