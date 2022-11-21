import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aied extends ahcz implements aheo
{
    public static final aied a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aied.class, a = new aied());
    }
    
    private aied() {
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
                if ((c = aied.c) == null) {
                    synchronized (aied.class) {
                        if (aied.c == null) {
                            aied.c = (ahev)new ahcs((ahcz)aied.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aied.a;
            }
            case 4: {
                return new ahcr((ahcz)aied.a);
            }
            case 3: {
                return new aied();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aied.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0001", new Object[] { "d", "b", aidb.l });
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
