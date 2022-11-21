import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksl extends ahcz implements aheo
{
    public static final aksl a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public apns d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aksl.class, a = new aksl());
    }
    
    private aksl() {
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
                if ((e = aksl.e) == null) {
                    synchronized (aksl.class) {
                        if (aksl.e == null) {
                            aksl.e = (ahev)new ahcs((ahcz)aksl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aksl.a;
            }
            case 4: {
                return new ahcr((ahcz)aksl.a);
            }
            case 3: {
                return new aksl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
