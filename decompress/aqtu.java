import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtu extends ahcz implements aheo
{
    public static final aqtu a;
    private static volatile ahev f;
    public int b;
    public long c;
    public boolean d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aqtu.class, a = new aqtu());
    }
    
    private aqtu() {
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
                if ((f = aqtu.f) == null) {
                    synchronized (aqtu.class) {
                        if (aqtu.f == null) {
                            aqtu.f = (ahev)new ahcs((ahcz)aqtu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqtu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqtu.a);
            }
            case 3: {
                return new aqtu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
