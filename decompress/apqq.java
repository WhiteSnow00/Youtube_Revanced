import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqq extends ahcz implements aheo
{
    public static final apqq a;
    private static volatile ahev b;
    private int c;
    private almr d;
    private almq e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apqq.class, a = new apqq());
    }
    
    private apqq() {
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
                if ((b = apqq.b) == null) {
                    synchronized (apqq.class) {
                        if (apqq.b == null) {
                            apqq.b = (ahev)new ahcs((ahcz)apqq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqq.a;
            }
            case 4: {
                return new ahcr((ahcz)apqq.a);
            }
            case 3: {
                return new apqq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqq.a, "\u0001\u0002\u0000\u0001\ufd1c\u209f\uf421\u2202\u0002\u0000\u0000\u0002\ufd1c\u209f\u1409\u0000\uf421\u2202\u1409\u0001", new Object[] { "c", "d", "e" });
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
