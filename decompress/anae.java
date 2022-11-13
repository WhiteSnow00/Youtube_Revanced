import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anae extends ahbh implements ahcw
{
    public static final anae a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    private ajut g;
    private anaf h;
    private anuv i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anae.class, (ahbh)(a = new anae()));
    }
    
    private anae() {
        this.c = 0;
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anae.f) == null) {
                    synchronized (anae.class) {
                        if (anae.f == null) {
                            anae.f = (ahdd)new ahba((ahbh)anae.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anae.a;
            }
            case 4: {
                return new ahaz((ahbh)anae.a);
            }
            case 3: {
                return new anae();
            }
            case 2: {
                return newMessageInfo((MessageLite)anae.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u143c\u0000\u0004\u1409\u0000\u0005\u143c\u0000\u0006\u1409\u0005", new Object[] { "d", "c", "b", "e", "h", aiqj.class, "g", anuv.class, "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
