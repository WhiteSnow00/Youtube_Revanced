import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuh extends ahcz implements aheo
{
    public static final anuh a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(anuh.class, a = new anuh());
    }
    
    private anuh() {
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
                if ((c = anuh.c) == null) {
                    synchronized (anuh.class) {
                        if (anuh.c == null) {
                            anuh.c = (ahev)new ahcs((ahcz)anuh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anuh.a;
            }
            case 4: {
                return new ahcr((ahcz)anuh.a);
            }
            case 3: {
                return new anuh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
