import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnc extends ahcz implements aheo
{
    public static final ahnc a;
    private static volatile ahev i;
    public int b;
    public ahnd c;
    public ahsm d;
    public ahsi e;
    public ahsp f;
    public ahqo g;
    public ajhe h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(ahnc.class, a = new ahnc());
    }
    
    private ahnc() {
        this.j = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = ahnc.i) == null) {
                    synchronized (ahnc.class) {
                        if (ahnc.i == null) {
                            ahnc.i = (ahev)new ahcs((ahcz)ahnc.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahnc.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnc.a);
            }
            case 3: {
                return new ahnc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnc.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1409\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
