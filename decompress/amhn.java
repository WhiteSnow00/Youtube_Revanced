import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhn extends ahcz implements aheo
{
    public static final amhn a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(amhn.class, a = new amhn());
    }
    
    private amhn() {
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
                if ((d = amhn.d) == null) {
                    synchronized (amhn.class) {
                        if (amhn.d == null) {
                            amhn.d = (ahev)new ahcs((ahcz)amhn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhn.a;
            }
            case 4: {
                return new ahcr((ahcz)amhn.a);
            }
            case 3: {
                return new amhn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
