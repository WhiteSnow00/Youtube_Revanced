import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoow extends ahcz implements aheo
{
    public static final aoow a;
    private static volatile ahev h;
    public int b;
    public anxb c;
    public ajws d;
    public ajws e;
    public ajws f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aoow.class, a = new aoow());
    }
    
    private aoow() {
        this.j = 2;
        this.g = ahbt.b;
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
                final ahev h;
                if ((h = aoow.h) == null) {
                    synchronized (aoow.class) {
                        if (aoow.h == null) {
                            aoow.h = (ahev)new ahcs((ahcz)aoow.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoow.a;
            }
            case 4: {
                return new ahcr((ahcz)aoow.a);
            }
            case 3: {
                return new aoow();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoow.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f", "i", "g" });
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
