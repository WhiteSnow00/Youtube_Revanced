import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgj extends ahbh implements ahcw
{
    public static final akgj a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgj.class, (ahbh)(a = new akgj()));
    }
    
    private akgj() {
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
                if ((d = akgj.d) == null) {
                    synchronized (akgj.class) {
                        if (akgj.d == null) {
                            akgj.d = (ahdd)new ahba((ahbh)akgj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgj.a;
            }
            case 4: {
                return new ahaz((ahbh)akgj.a);
            }
            case 3: {
                return new akgj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgj.a, "\u0001\u0005\u0001\u0000\uf143\u1824\uf0bd\u3b9c\u0005\u0000\u0000\u0005\uf143\u1824\u143c\u0000\ufa79\u1cc9\u143c\u0000\uec81\u27d5\u143c\u0000\uf127\u2a72\u143c\u0000\uf0bd\u3b9c\u143c\u0000", new Object[] { "c", "b", aiwm.class, ajzv.class, akgc.class, appd.class, akgi.class });
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
