import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogu extends ahcz implements aheo
{
    public static final aogu a;
    private static volatile ahev f;
    public int b;
    public aosj c;
    public anxb d;
    public anxb e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aogu.class, a = new aogu());
    }
    
    private aogu() {
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
                if ((f = aogu.f) == null) {
                    synchronized (aogu.class) {
                        if (aogu.f == null) {
                            aogu.f = (ahev)new ahcs((ahcz)aogu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aogu.a;
            }
            case 4: {
                return new ahcr((ahcz)aogu.a);
            }
            case 3: {
                return new aogu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
