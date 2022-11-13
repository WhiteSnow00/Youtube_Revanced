import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlm extends ahbh implements ahcw
{
    public static final amlm a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amlm.class, (ahbh)(a = new amlm()));
    }
    
    private amlm() {
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
                if ((d = amlm.d) == null) {
                    synchronized (amlm.class) {
                        if (amlm.d == null) {
                            amlm.d = (ahdd)new ahba((ahbh)amlm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlm.a;
            }
            case 4: {
                return new ahaz((ahbh)amlm.a);
            }
            case 3: {
                return new amlm();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlm.a, "\u0001\u0001\u0001\u0000\uecd4\u3b13\uecd4\u3b13\u0001\u0000\u0000\u0001\uecd4\u3b13\u143c\u0000", new Object[] { "c", "b", amln.class });
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
