import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anag extends ahbh implements ahcw
{
    public static final anag a;
    private static volatile ahdd d;
    public int b;
    public ajut c;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anag.class, (ahbh)(a = new anag()));
    }
    
    private anag() {
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
                if ((d = anag.d) == null) {
                    synchronized (anag.class) {
                        if (anag.d == null) {
                            anag.d = (ahdd)new ahba((ahbh)anag.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anag.a;
            }
            case 4: {
                return new ahaz((ahbh)anag.a);
            }
            case 3: {
                return new anag();
            }
            case 2: {
                return newMessageInfo((MessageLite)anag.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "e" });
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
