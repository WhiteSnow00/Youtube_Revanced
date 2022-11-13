import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhr extends ahbh implements ahcw
{
    public static final anhr a;
    private static volatile ahdd d;
    public ajut b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anhr.class, (ahbh)(a = new anhr()));
    }
    
    private anhr() {
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
                final ahdd d;
                if ((d = anhr.d) == null) {
                    synchronized (anhr.class) {
                        if (anhr.d == null) {
                            anhr.d = (ahdd)new ahba((ahbh)anhr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anhr.a;
            }
            case 4: {
                return new ahaz((ahbh)anhr.a);
            }
            case 3: {
                return new anhr();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
