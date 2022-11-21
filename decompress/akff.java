import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akff extends ahcz implements aheo
{
    public static final akff a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akff.class, a = new akff());
    }
    
    private akff() {
        this.g = 2;
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = akff.b) == null) {
                    synchronized (akff.class) {
                        if (akff.b == null) {
                            akff.b = (ahev)new ahcs((ahcz)akff.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akff.a;
            }
            case 4: {
                return new ahcr((ahcz)akff.a);
            }
            case 3: {
                return new akff();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akff.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
