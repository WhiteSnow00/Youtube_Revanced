import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammy extends ahcz implements aheo
{
    public static final ammy a;
    private static volatile ahev f;
    public int b;
    public ammx c;
    public boolean d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(ammy.class, a = new ammy());
    }
    
    private ammy() {
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
                if ((f = ammy.f) == null) {
                    synchronized (ammy.class) {
                        if (ammy.f == null) {
                            ammy.f = (ahev)new ahcs((ahcz)ammy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ammy.a;
            }
            case 4: {
                return new ahcr((ahcz)ammy.a);
            }
            case 3: {
                return new ammy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
