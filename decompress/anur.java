import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anur extends ahcz implements aheo
{
    public static final anur a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(anur.class, a = new anur());
    }
    
    private anur() {
        this.b = "";
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
                if ((c = anur.c) == null) {
                    synchronized (anur.class) {
                        if (anur.c == null) {
                            anur.c = (ahev)new ahcs((ahcz)anur.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anur.a;
            }
            case 4: {
                return new ahcr((ahcz)anur.a);
            }
            case 3: {
                return new anur();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anur.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
