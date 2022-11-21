import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnh extends ahcz implements aheo
{
    private static final alnh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnh.class, a = new alnh());
    }
    
    private alnh() {
    }
    
    public static alnh a() {
        return alnh.a;
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
                if ((b = alnh.b) == null) {
                    synchronized (alnh.class) {
                        if (alnh.b == null) {
                            alnh.b = (ahev)new ahcs((ahcz)alnh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnh.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new alnh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnh.a, "\u0001\u0000", null);
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
