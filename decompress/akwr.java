import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwr extends ahcz implements aheo
{
    public static final akwr a;
    private static volatile ahev d;
    public aknj b;
    public amiy c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akwr.class, a = new akwr());
    }
    
    private akwr() {
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
                final ahev d;
                if ((d = akwr.d) == null) {
                    synchronized (akwr.class) {
                        if (akwr.d == null) {
                            akwr.d = (ahev)new ahcs((ahcz)akwr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwr.a;
            }
            case 4: {
                return new ahcr((ahcz)akwr.a);
            }
            case 3: {
                return new akwr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
