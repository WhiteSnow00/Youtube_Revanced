import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhm extends ahcz implements aheo
{
    public static final amhm a;
    private static volatile ahev h;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public amgx g;
    
    static {
        ahcz.registerDefaultInstance(amhm.class, a = new amhm());
    }
    
    private amhm() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = amhm.h) == null) {
                    synchronized (amhm.class) {
                        if (amhm.h == null) {
                            amhm.h = (ahev)new ahcs((ahcz)amhm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amhm.a;
            }
            case 4: {
                return new ahcr((ahcz)amhm.a);
            }
            case 3: {
                return new amhm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhm.a, "\u0001\u0005\u0000\u0001\b\u0019\u0005\u0000\u0000\u0000\b\u1007\u0004\u000e\u1007\t\u000f\u1007\n\u0014\u1007\f\u0019\u1009\u0011", new Object[] { "b", "c", "d", "e", "f", "g" });
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
