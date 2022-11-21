import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoop extends ahcz implements aheo
{
    public static final aoop a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aoop.class, a = new aoop());
    }
    
    private aoop() {
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
                if ((d = aoop.d) == null) {
                    synchronized (aoop.class) {
                        if (aoop.d == null) {
                            aoop.d = (ahev)new ahcs((ahcz)aoop.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoop.a;
            }
            case 4: {
                return new ahcr((ahcz)aoop.a);
            }
            case 3: {
                return new aoop();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoop.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "e", "b", aonf.j, "c" });
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
