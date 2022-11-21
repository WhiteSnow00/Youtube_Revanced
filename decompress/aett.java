import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aett extends ahcz implements aheo
{
    public static final aett a;
    private static volatile ahev e;
    public int b;
    public long c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aett.class, a = new aett());
    }
    
    private aett() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aett.e) == null) {
                    synchronized (aett.class) {
                        if (aett.e == null) {
                            aett.e = (ahev)new ahcs((ahcz)aett.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aett.a;
            }
            case 4: {
                return new ahcr((ahcz)aett.a);
            }
            case 3: {
                return new aett();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aett.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
