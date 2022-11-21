import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwi extends ahcz implements aheo
{
    public static final alwi a;
    private static volatile ahev h;
    public int b;
    public double c;
    public boolean d;
    public boolean e;
    public double f;
    public boolean g;
    
    static {
        ahcz.registerDefaultInstance(alwi.class, a = new alwi());
    }
    
    private alwi() {
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
                if ((h = alwi.h) == null) {
                    synchronized (alwi.class) {
                        if (alwi.h == null) {
                            alwi.h = (ahev)new ahcs((ahcz)alwi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alwi.a;
            }
            case 4: {
                return new ahcr((ahcz)alwi.a);
            }
            case 3: {
                return new alwi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwi.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1007\u0001\u0006\u1007\u0002\u0007\u1000\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", "e", "f", "g" });
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
