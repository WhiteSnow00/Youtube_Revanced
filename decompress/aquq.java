import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquq extends ahcz implements aheo
{
    public static final aquq a;
    private static volatile ahev f;
    public int b;
    public int c;
    public long d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aquq.class, a = new aquq());
    }
    
    private aquq() {
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
                if ((f = aquq.f) == null) {
                    synchronized (aquq.class) {
                        if (aquq.f == null) {
                            aquq.f = (ahev)new ahcs((ahcz)aquq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aquq.a;
            }
            case 4: {
                return new ahcr((ahcz)aquq.a);
            }
            case 3: {
                return new aquq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquq.a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
