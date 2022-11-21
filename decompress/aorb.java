import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorb extends ahcz implements aheo
{
    public static final aorb a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aorb.class, a = new aorb());
    }
    
    private aorb() {
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
                if ((c = aorb.c) == null) {
                    synchronized (aorb.class) {
                        if (aorb.c == null) {
                            aorb.c = (ahev)new ahcs((ahcz)aorb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aorb.a;
            }
            case 4: {
                return new ahcr((ahcz)aorb.a);
            }
            case 3: {
                return new aorb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aore.a() });
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
