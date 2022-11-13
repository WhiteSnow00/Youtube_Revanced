import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmb extends ahbh implements ahcw
{
    public static final akmb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akmb.class, (ahbh)(a = new akmb()));
    }
    
    private akmb() {
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
                if ((d = akmb.d) == null) {
                    synchronized (akmb.class) {
                        if (akmb.d == null) {
                            akmb.d = (ahdd)new ahba((ahbh)akmb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmb.a;
            }
            case 4: {
                return new ahaz((ahbh)akmb.a);
            }
            case 3: {
                return new akmb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmb.a, "\u0001\u0002\u0001\u0000\ue315\u1baf\ue572\u3b21\u0002\u0000\u0000\u0002\ue315\u1baf\u143c\u0000\ue572\u3b21\u143c\u0000", new Object[] { "c", "b", ahrc.class, altz.class });
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
