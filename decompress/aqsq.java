import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsq extends ahcz implements aheo
{
    public static final aqsq a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aqsq.class, a = new aqsq());
    }
    
    private aqsq() {
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
                if ((f = aqsq.f) == null) {
                    synchronized (aqsq.class) {
                        if (aqsq.f == null) {
                            aqsq.f = (ahev)new ahcs((ahcz)aqsq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsq.a);
            }
            case 3: {
                return new aqsq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1003\u0002", new Object[] { "b", "c", aqnr.m, "d", aqnr.l, "e" });
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
