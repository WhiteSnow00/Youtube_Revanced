import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzq extends ahcz implements aheo
{
    public static final apzq a;
    private static volatile ahev c;
    public ajws b;
    private int d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apzq.class, a = new apzq());
    }
    
    private apzq() {
        this.f = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apzq.c) == null) {
                    synchronized (apzq.class) {
                        if (apzq.c == null) {
                            apzq.c = (ahev)new ahcs((ahcz)apzq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apzq.a;
            }
            case 4: {
                return new ahcr((ahcz)apzq.a);
            }
            case 3: {
                return new apzq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
