import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appo extends ahbh implements ahcw
{
    public static final appo a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)appo.class, (ahbh)(a = new appo()));
    }
    
    private appo() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appo.b) == null) {
                    synchronized (appo.class) {
                        if (appo.b == null) {
                            appo.b = (ahdd)new ahba((ahbh)appo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appo.a;
            }
            case 4: {
                return new ahaz((ahbh)appo.a);
            }
            case 3: {
                return new appo();
            }
            case 2: {
                return newMessageInfo((MessageLite)appo.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
