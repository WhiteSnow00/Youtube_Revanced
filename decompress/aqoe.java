import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoe extends ahcz implements aheo
{
    public static final aqoe a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqoe.class, a = new aqoe());
    }
    
    private aqoe() {
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
                if ((c = aqoe.c) == null) {
                    synchronized (aqoe.class) {
                        if (aqoe.c == null) {
                            aqoe.c = (ahev)new ahcs((ahcz)aqoe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqoe.a;
            }
            case 4: {
                return new ahcr((ahcz)aqoe.a);
            }
            case 3: {
                return new aqoe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
