import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptb extends ahcz implements aheo
{
    public static final aptb a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public akfj d;
    public int e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aptb.class, a = new aptb());
    }
    
    private aptb() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aptb.f) == null) {
                    synchronized (aptb.class) {
                        if (aptb.f == null) {
                            aptb.f = (ahev)new ahcs((ahcz)aptb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aptb.a;
            }
            case 4: {
                return new ahcr((ahcz)aptb.a);
            }
            case 3: {
                return new aptb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aprh.p });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
