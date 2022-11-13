import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifh extends ahbh implements ahcw
{
    public static final aifh a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifh.class, (ahbh)(a = new aifh()));
    }
    
    private aifh() {
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
                if ((d = aifh.d) == null) {
                    synchronized (aifh.class) {
                        if (aifh.d == null) {
                            aifh.d = (ahdd)new ahba((ahbh)aifh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifh.a;
            }
            case 4: {
                return new ahaz((ahbh)aifh.a);
            }
            case 3: {
                return new aifh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifh.a, "\u0001\u0001\u0001\u0000\ue63d\u43b1\ue63d\u43b1\u0001\u0000\u0000\u0001\ue63d\u43b1\u143c\u0000", new Object[] { "c", "b", akca.class });
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
