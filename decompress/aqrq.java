import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrq extends ahcz implements aheo
{
    public static final aqrq a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqrq.class, a = new aqrq());
    }
    
    private aqrq() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqrq.c) == null) {
                    synchronized (aqrq.class) {
                        if (aqrq.c == null) {
                            aqrq.c = (ahev)new ahcs((ahcz)aqrq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrq.a);
            }
            case 3: {
                return new aqrq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
