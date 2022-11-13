import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqq extends ahbh implements ahcw
{
    public static final apqq a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apqq.class, (ahbh)(a = new apqq()));
    }
    
    private apqq() {
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
                if ((d = apqq.d) == null) {
                    synchronized (apqq.class) {
                        if (apqq.d == null) {
                            apqq.d = (ahdd)new ahba((ahbh)apqq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqq.a;
            }
            case 4: {
                return new ahaz((ahbh)apqq.a);
            }
            case 3: {
                return new apqq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqq.a, "\u0001\u0001\u0001\u0000\ufd29\u49e2\ufd29\u49e2\u0001\u0000\u0000\u0001\ufd29\u49e2\u143c\u0000", new Object[] { "c", "b", apqp.class });
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
