import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfb extends ahcz implements aheo
{
    public static final alfb a;
    private static volatile ahev c;
    public anxb b;
    private int d;
    private aisc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alfb.class, a = new alfb());
    }
    
    private alfb() {
        this.f = 2;
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
                if ((c = alfb.c) == null) {
                    synchronized (alfb.class) {
                        if (alfb.c == null) {
                            alfb.c = (ahev)new ahcs((ahcz)alfb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alfb.a;
            }
            case 4: {
                return new ahcr((ahcz)alfb.a);
            }
            case 3: {
                return new alfb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfb.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "d", "e", "b" });
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
