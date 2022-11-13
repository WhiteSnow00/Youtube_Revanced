import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akeb extends ahbh implements ahcw
{
    public static final akeb a;
    private static volatile ahdd f;
    public int b;
    public anuv c;
    public anuv d;
    public anuv e;
    private aiqj g;
    private ajut h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akeb.class, (ahbh)(a = new akeb()));
    }
    
    private akeb() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akeb.f) == null) {
                    synchronized (akeb.class) {
                        if (akeb.f == null) {
                            akeb.f = (ahdd)new ahba((ahbh)akeb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akeb.a;
            }
            case 4: {
                return new ahaz((ahbh)akeb.a);
            }
            case 3: {
                return new akeb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akeb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "d", "g", "c", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
