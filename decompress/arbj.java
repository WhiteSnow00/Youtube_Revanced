import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbj extends ahcz implements aheo
{
    private static final arbj a;
    private static volatile ahev b;
    private int c;
    private arco d;
    
    static {
        ahcz.registerDefaultInstance(arbj.class, a = new arbj());
    }
    
    private arbj() {
    }
    
    public static arbj a() {
        return arbj.a;
    }
    
    public static arbj b() {
        return arbj.a;
    }
    
    public static void d(final arbj arbj, final arco arco) {
        arbj.e(arco);
    }
    
    private void e(final arco d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    public arco c() {
        arco arco;
        if ((arco = this.d) == null) {
            arco = arco.l();
        }
        return arco;
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
                if ((b = arbj.b) == null) {
                    synchronized (arbj.class) {
                        if (arbj.b == null) {
                            arbj.b = (ahev)new ahcs((ahcz)arbj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arbj.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arbj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
