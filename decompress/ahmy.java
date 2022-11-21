import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmy extends ahcz implements aheo
{
    public static final ahmy a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public aisc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(ahmy.class, a = new ahmy());
    }
    
    private ahmy() {
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
                final ahev e;
                if ((e = ahmy.e) == null) {
                    synchronized (ahmy.class) {
                        if (ahmy.e == null) {
                            ahmy.e = (ahev)new ahcs((ahcz)ahmy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahmy.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmy.a);
            }
            case 3: {
                return new ahmy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
