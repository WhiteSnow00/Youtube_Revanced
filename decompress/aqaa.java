import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaa extends ahcz implements aheo
{
    public static final aqaa a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private ajws e;
    private aiet f;
    private aiet g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aqaa.class, a = new aqaa());
    }
    
    private aqaa() {
        this.i = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqaa.d) == null) {
                    synchronized (aqaa.class) {
                        if (aqaa.d == null) {
                            aqaa.d = (ahev)new ahcs((ahcz)aqaa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqaa.a;
            }
            case 4: {
                return new ahcr((ahcz)aqaa.a);
            }
            case 3: {
                return new aqaa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqaa.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0005\u0006\u1409\u0004", new Object[] { "b", "e", "c", "f", "h", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
