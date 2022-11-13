import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoga extends ahbh implements ahcw
{
    public static final aoga a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoga.class, (ahbh)(a = new aoga()));
    }
    
    private aoga() {
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
                if ((d = aoga.d) == null) {
                    synchronized (aoga.class) {
                        if (aoga.d == null) {
                            aoga.d = (ahdd)new ahba((ahbh)aoga.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoga.a;
            }
            case 4: {
                return new ahaz((ahbh)aoga.a);
            }
            case 3: {
                return new aoga();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoga.a, "\u0001\u0001\u0001\u0000\uffc4\u3ccc\uffc4\u3ccc\u0001\u0000\u0000\u0001\uffc4\u3ccc\u143c\u0000", new Object[] { "c", "b", aiyd.class });
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
