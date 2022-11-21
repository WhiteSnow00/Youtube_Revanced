import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aity extends ahcz implements aheo
{
    public static final aity a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aity.class, a = new aity());
    }
    
    private aity() {
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
                if ((c = aity.c) == null) {
                    synchronized (aity.class) {
                        if (aity.c == null) {
                            aity.c = (ahev)new ahcs((ahcz)aity.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aity.a;
            }
            case 4: {
                return new ahcr((ahcz)aity.a);
            }
            case 3: {
                return new aity();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aity.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aitw.c });
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
