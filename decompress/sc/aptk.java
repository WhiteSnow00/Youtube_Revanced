import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptk extends ahbh implements ahcw
{
    public static final aptk a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aptk.class, (ahbh)(a = new aptk()));
    }
    
    private aptk() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aptk.d) == null) {
                    synchronized (aptk.class) {
                        if (aptk.d == null) {
                            aptk.d = (ahdd)new ahba((ahbh)aptk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptk.a;
            }
            case 4: {
                return new ahaz((ahbh)aptk.a);
            }
            case 3: {
                return new aptk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptk.a, "\u0001\u0006\u0001\u0000\u0001\u0010\u0006\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\t\u103c\u0000\f\u103c\u0000\r\u103c\u0000\u0010\u103c\u0000", new Object[] { "c", "b", aptu.class, aptv.class, aptp.class, aptm.class, aptl.class, aptn.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
