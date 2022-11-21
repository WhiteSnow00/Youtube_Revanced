import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejs extends ahcz implements aheo
{
    public static final aejs a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aejs.class, a = new aejs());
    }
    
    private aejs() {
        this.b = 1;
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
                if ((c = aejs.c) == null) {
                    synchronized (aejs.class) {
                        if (aejs.c == null) {
                            aejs.c = (ahev)new ahcs((ahcz)aejs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aejs.a;
            }
            case 4: {
                return new ahcr((ahcz)aejs.a);
            }
            case 3: {
                return new aejs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aejs.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0003", new Object[] { "d", "b", pfw.t });
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
