import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpv extends ahcz implements aheo
{
    public static final alpv a;
    private static volatile ahev g;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(alpv.class, a = new alpv());
    }
    
    private alpv() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = alpv.g) == null) {
                    synchronized (alpv.class) {
                        if (alpv.g == null) {
                            alpv.g = (ahev)new ahcs((ahcz)alpv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alpv.a;
            }
            case 4: {
                return new ahcr((ahcz)alpv.a);
            }
            case 3: {
                return new alpv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpv.a, "\u0001\u0005\u0000\u0001\u0001\u0015\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0006\u1007\u0005\f\u1007\n\u000f\u1007\r\u0015\u1007\u0011", new Object[] { "h", "b", "c", "d", "e", "f" });
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
