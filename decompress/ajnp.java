import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnp extends ahcz implements aheo
{
    public static final ajnp a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(ajnp.class, a = new ajnp());
    }
    
    private ajnp() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = ajnp.d) == null) {
                    synchronized (ajnp.class) {
                        if (ajnp.d == null) {
                            ajnp.d = (ahev)new ahcs((ahcz)ajnp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnp.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnp.a);
            }
            case 3: {
                return new ajnp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnp.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "b", "c" });
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
