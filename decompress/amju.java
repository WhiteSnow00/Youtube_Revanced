import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amju extends ahcz implements aheo
{
    public static final amju a;
    private static volatile ahev d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(amju.class, a = new amju());
    }
    
    private amju() {
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
                if ((d = amju.d) == null) {
                    synchronized (amju.class) {
                        if (amju.d == null) {
                            amju.d = (ahev)new ahcs((ahcz)amju.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amju.a;
            }
            case 4: {
                return new ahcr((ahcz)amju.a);
            }
            case 3: {
                return new amju();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amju.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "e", "b", "c" });
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
