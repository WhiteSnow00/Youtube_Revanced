import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogy extends ahcz implements aheo
{
    public static final aogy a;
    private static volatile ahev c;
    public ahdh b;
    
    static {
        ahcz.registerDefaultInstance(aogy.class, a = new aogy());
    }
    
    private aogy() {
        this.b = ahcz.emptyIntList();
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
                if ((c = aogy.c) == null) {
                    synchronized (aogy.class) {
                        if (aogy.c == null) {
                            aogy.c = (ahev)new ahcs((ahcz)aogy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aogy.a;
            }
            case 4: {
                return new ahcr((float[][])null);
            }
            case 3: {
                return new aogy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "b", aohb.a() });
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
