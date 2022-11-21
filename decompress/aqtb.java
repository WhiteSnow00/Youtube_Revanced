import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtb extends ahcz implements aheo
{
    public static final aqtb a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aqtb.class, a = new aqtb());
    }
    
    private aqtb() {
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
                if ((f = aqtb.f) == null) {
                    synchronized (aqtb.class) {
                        if (aqtb.f == null) {
                            aqtb.f = (ahev)new ahcs((ahcz)aqtb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqtb.a;
            }
            case 4: {
                return new ahcr((ahcz)aqtb.a);
            }
            case 3: {
                return new aqtb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
