import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apru extends ahbh implements ahcw
{
    public static final apru a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apru.class, (ahbh)(a = new apru()));
    }
    
    private apru() {
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
                if ((d = apru.d) == null) {
                    synchronized (apru.class) {
                        if (apru.d == null) {
                            apru.d = (ahdd)new ahba((ahbh)apru.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apru.a;
            }
            case 4: {
                return new ahaz((ahbh)apru.a);
            }
            case 3: {
                return new apru();
            }
            case 2: {
                return newMessageInfo((MessageLite)apru.a, "\u0001\u0004\u0001\u0000\ue1b7\u3802\uf676\u4665\u0004\u0000\u0000\u0004\ue1b7\u3802\u143c\u0000\ue4d4\u380d\u143c\u0000\ue206\u3820\u143c\u0000\uf676\u4665\u143c\u0000", new Object[] { "c", "b", aprt.class, aprs.class, aprv.class, aprr.class });
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
