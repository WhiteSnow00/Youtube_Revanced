import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoz extends ahcz implements aheo
{
    public static final akoz a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public akoy d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akoz.class, a = new akoz());
    }
    
    private akoz() {
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
                if ((e = akoz.e) == null) {
                    synchronized (akoz.class) {
                        if (akoz.e == null) {
                            akoz.e = (ahev)new ahcs((ahcz)akoz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akoz.a;
            }
            case 4: {
                return new ahcr((ahcz)akoz.a);
            }
            case 3: {
                return new akoz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akoz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
