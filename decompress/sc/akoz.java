import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoz extends ahbh implements ahcw
{
    public static final akoz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akoz.class, (ahbh)(a = new akoz()));
    }
    
    private akoz() {
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
                if ((d = akoz.d) == null) {
                    synchronized (akoz.class) {
                        if (akoz.d == null) {
                            akoz.d = (ahdd)new ahba((ahbh)akoz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akoz.a;
            }
            case 4: {
                return new ahaz((ahbh)akoz.a);
            }
            case 3: {
                return new akoz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoz.a, "\u0001\u0002\u0001\u0000\ue8e9\u4616\ue8f3\u55ce\u0002\u0000\u0000\u0002\ue8e9\u4616\u143c\u0000\ue8f3\u55ce\u143c\u0000", new Object[] { "c", "b", amja.class, anwj.class });
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
