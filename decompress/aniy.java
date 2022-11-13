import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniy extends ahbh implements ahcw
{
    public static final aniy a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public aiqj d;
    public ahab e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aniy.class, (ahbh)(a = new aniy()));
    }
    
    private aniy() {
        this.h = 2;
        this.c = "";
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aniy.f) == null) {
                    synchronized (aniy.class) {
                        if (aniy.f == null) {
                            aniy.f = (ahdd)new ahba((ahbh)aniy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aniy.a;
            }
            case 4: {
                return new ahaz((ahbh)aniy.a);
            }
            case 3: {
                return new aniy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aniy.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
