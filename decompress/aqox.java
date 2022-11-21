import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqox extends ahcz implements aheo
{
    private static final aqox a;
    private static volatile ahev b;
    private int c;
    private aqoy d;
    private String e;
    
    static {
        ahcz.registerDefaultInstance(aqox.class, a = new aqox());
    }
    
    private aqox() {
        this.e = "";
    }
    
    public static aqow a() {
        return (aqow)aqox.a.createBuilder();
    }
    
    static aqox b() {
        return aqox.a;
    }
    
    public static void c(final aqox aqox, final aqoy aqoy) {
        aqox.e(aqoy);
    }
    
    public static void d(final aqox aqox, final String s) {
        aqox.f(s);
    }
    
    private void e(final aqoy d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    private void f(final String e) {
        e.getClass();
        this.c |= 0x2;
        this.e = e;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqox.b) == null) {
                    synchronized (aqox.class) {
                        if (aqox.b == null) {
                            aqox.b = (ahev)new ahcs((ahcz)aqox.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqox.a;
            }
            case 4: {
                return new aqow();
            }
            case 3: {
                return new aqox();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqox.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
