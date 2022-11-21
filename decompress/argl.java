import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argl extends ahcz implements aheo
{
    public static final argl a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(argl.class, a = new argl());
    }
    
    private argl() {
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
                if ((f = argl.f) == null) {
                    synchronized (argl.class) {
                        if (argl.f == null) {
                            argl.f = (ahev)new ahcs((ahcz)argl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return argl.a;
            }
            case 4: {
                return new ahcr((ahcz)argl.a);
            }
            case 3: {
                return new argl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)argl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
