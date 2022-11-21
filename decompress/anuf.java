import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuf extends ahcz implements aheo
{
    public static final anuf a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(anuf.class, a = new anuf());
    }
    
    private anuf() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = anuf.c) == null) {
                    synchronized (anuf.class) {
                        if (anuf.c == null) {
                            anuf.c = (ahev)new ahcs((ahcz)anuf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anuf.a;
            }
            case 4: {
                return new ahcr((ahcz)anuf.a);
            }
            case 3: {
                return new anuf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
