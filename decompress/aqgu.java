import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgu extends ahcz implements aheo
{
    public static final aqgu a;
    private static volatile ahev c;
    public aqha b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqgu.class, a = new aqgu());
    }
    
    private aqgu() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqgu.c) == null) {
                    synchronized (aqgu.class) {
                        if (aqgu.c == null) {
                            aqgu.c = (ahev)new ahcs((ahcz)aqgu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqgu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqgu.a);
            }
            case 3: {
                return new aqgu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqgu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
