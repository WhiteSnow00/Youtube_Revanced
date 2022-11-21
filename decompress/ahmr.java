import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmr extends ahcz implements aheo
{
    public static final ahmr a;
    private static volatile ahev f;
    public int b;
    public ahmq c;
    public ahms d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(ahmr.class, a = new ahmr());
    }
    
    private ahmr() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahmr.f) == null) {
                    synchronized (ahmr.class) {
                        if (ahmr.f == null) {
                            ahmr.f = (ahev)new ahcs((ahcz)ahmr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahmr.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmr.a);
            }
            case 3: {
                return new ahmr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
