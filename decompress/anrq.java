import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anrq extends ahcz implements aheo
{
    public static final anrq a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(anrq.class, a = new anrq());
    }
    
    private anrq() {
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
                if ((f = anrq.f) == null) {
                    synchronized (anrq.class) {
                        if (anrq.f == null) {
                            anrq.f = (ahev)new ahcs((ahcz)anrq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anrq.a;
            }
            case 4: {
                return new ahcr((ahcz)anrq.a);
            }
            case 3: {
                return new anrq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anrq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u100c\u0002", new Object[] { "b", "c", anrk.a(), "d", "e", anrm.a() });
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
