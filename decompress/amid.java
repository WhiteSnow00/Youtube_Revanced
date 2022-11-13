import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amid extends ahbh implements ahcw
{
    public static final amid a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public Object d;
    private byte f;
    
    static {
        final amid a2 = new amid();
        ahbh.registerDefaultInstance((Class)amid.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 247401431, ahek.k, (Class)amid.class);
    }
    
    private amid() {
        this.c = 0;
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
                final ahdd e;
                if ((e = amid.e) == null) {
                    synchronized (amid.class) {
                        if (amid.e == null) {
                            amid.e = (ahdd)new ahba((ahbh)amid.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amid.a;
            }
            case 4: {
                return new ahaz((ahbh)amid.a);
            }
            case 3: {
                return new amid();
            }
            case 2: {
                return newMessageInfo((MessageLite)amid.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u143c\u0000", new Object[] { "d", "c", akui.class });
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
