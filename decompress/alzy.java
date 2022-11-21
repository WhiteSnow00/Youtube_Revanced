import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzy extends ahcz implements aheo
{
    public static final alzy a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(alzy.class, a = new alzy());
    }
    
    private alzy() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alzy.f) == null) {
                    synchronized (alzy.class) {
                        if (alzy.f == null) {
                            alzy.f = (ahev)new ahcs((ahcz)alzy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alzy.a;
            }
            case 4: {
                return new ahcr((ahcz)alzy.a);
            }
            case 3: {
                return new alzy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
