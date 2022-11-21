import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuj extends ahcz implements aheo
{
    public static final anuj a;
    private static volatile ahev h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;
    
    static {
        ahcz.registerDefaultInstance(anuj.class, a = new anuj());
    }
    
    private anuj() {
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
                if ((h = anuj.h) == null) {
                    synchronized (anuj.class) {
                        if (anuj.h == null) {
                            anuj.h = (ahev)new ahcs((ahcz)anuj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anuj.a;
            }
            case 4: {
                return new ahcr((ahcz)anuj.a);
            }
            case 3: {
                return new anuj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuj.a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0006\u1007\u0005\u0007\u1007\u0006\n\u1007\t", new Object[] { "i", "b", "c", "d", "e", "f", "g" });
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
