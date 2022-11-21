import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alge extends ahcz implements aheo
{
    public static final alge a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alge.class, a = new alge());
    }
    
    private alge() {
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
                final ahev b;
                if ((b = alge.b) == null) {
                    synchronized (alge.class) {
                        if (alge.b == null) {
                            alge.b = (ahev)new ahcs((ahcz)alge.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alge.a;
            }
            case 4: {
                return new ahcr((ahcz)alge.a);
            }
            case 3: {
                return new alge();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alge.a, "\u0001\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0002\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e" });
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
