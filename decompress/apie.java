import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apie extends ahcz implements aheo
{
    public static final apie a;
    private static volatile ahev d;
    public long b;
    public ajws c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apie.class, a = new apie());
    }
    
    private apie() {
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
                if ((d = apie.d) == null) {
                    synchronized (apie.class) {
                        if (apie.d == null) {
                            apie.d = (ahev)new ahcs((ahcz)apie.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apie.a;
            }
            case 4: {
                return new ahcr((ahcz)apie.a);
            }
            case 3: {
                return new apie();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apie.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1003\u0000\u0003\u1409\u0002", new Object[] { "e", "b", "c" });
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
