import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpf extends ahcz implements aheo
{
    private static final aqpf a;
    private static volatile ahev b;
    private int c;
    private aqoy d;
    private String e;
    
    static {
        ahcz.registerDefaultInstance(aqpf.class, a = new aqpf());
    }
    
    private aqpf() {
        this.e = "";
    }
    
    public static aqpe a() {
        return (aqpe)aqpf.a.createBuilder();
    }
    
    static aqpf b() {
        return aqpf.a;
    }
    
    public static void c(final aqpf aqpf, final String s) {
        aqpf.f(s);
    }
    
    public static void d(final aqpf aqpf, final aqoy aqoy) {
        aqpf.e(aqoy);
    }
    
    private void e(final aqoy d) {
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
                if ((b = aqpf.b) == null) {
                    synchronized (aqpf.class) {
                        if (aqpf.b == null) {
                            aqpf.b = (ahev)new ahcs((ahcz)aqpf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqpf.a;
            }
            case 4: {
                return new aqpe();
            }
            case 3: {
                return new aqpf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
