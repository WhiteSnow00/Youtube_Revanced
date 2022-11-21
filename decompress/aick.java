import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aick extends ahcz implements aheo
{
    public static final aick a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aick.class, a = new aick());
    }
    
    private aick() {
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
                if ((c = aick.c) == null) {
                    synchronized (aick.class) {
                        if (aick.c == null) {
                            aick.c = (ahev)new ahcs((ahcz)aick.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aick.a;
            }
            case 4: {
                return new ahcr((ahcz)aick.a);
            }
            case 3: {
                return new aick();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aick.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahvv.u });
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
