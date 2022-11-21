import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetu extends ahcz implements aheo
{
    public static final aetu a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aetu.class, a = new aetu());
    }
    
    private aetu() {
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
                if ((d = aetu.d) == null) {
                    synchronized (aetu.class) {
                        if (aetu.d == null) {
                            aetu.d = (ahev)new ahcs((ahcz)aetu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aetu.a;
            }
            case 4: {
                return new ahcr((ahcz)aetu.a);
            }
            case 3: {
                return new aetu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aetu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
