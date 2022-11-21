import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqur extends ahcz implements aheo
{
    public static final aqur a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aqur.class, a = new aqur());
    }
    
    private aqur() {
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
                if ((e = aqur.e) == null) {
                    synchronized (aqur.class) {
                        if (aqur.e == null) {
                            aqur.e = (ahev)new ahcs((ahcz)aqur.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqur.a;
            }
            case 4: {
                return new ahcr((ahcz)aqur.a);
            }
            case 3: {
                return new aqur();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqur.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
