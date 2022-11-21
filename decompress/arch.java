import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arch extends ahcz implements aheo
{
    private static final arch a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(arch.class, a = new arch());
    }
    
    private arch() {
    }
    
    public static arch a() {
        return arch.a;
    }
    
    public static arch b() {
        return arch.a;
    }
    
    public boolean c() {
        return this.d;
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
                if ((b = arch.b) == null) {
                    synchronized (arch.class) {
                        if (arch.b == null) {
                            arch.b = (ahev)new ahcs((ahcz)arch.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arch.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arch();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arch.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
