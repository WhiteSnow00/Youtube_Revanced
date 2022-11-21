import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alok extends ahcz implements aheo
{
    public static final alok a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(alok.class, a = new alok());
    }
    
    private alok() {
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
                if ((f = alok.f) == null) {
                    synchronized (alok.class) {
                        if (alok.f == null) {
                            alok.f = (ahev)new ahcs((ahcz)alok.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alok.a;
            }
            case 4: {
                return new ahcr((ahcz)alok.a);
            }
            case 3: {
                return new alok();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alok.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", airp.a(), "e", airo.a() });
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
