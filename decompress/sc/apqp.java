import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqp extends ahbh implements ahcw
{
    public static final apqp a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public akdi d;
    public int e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)apqp.class, (ahbh)(a = new apqp()));
    }
    
    private apqp() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apqp.f) == null) {
                    synchronized (apqp.class) {
                        if (apqp.f == null) {
                            apqp.f = (ahdd)new ahba((ahbh)apqp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqp.a;
            }
            case 4: {
                return new ahaz((ahbh)apqp.a);
            }
            case 3: {
                return new apqp();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", apow.o });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
