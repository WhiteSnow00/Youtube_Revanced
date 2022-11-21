import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzy extends ahcz implements aheo
{
    public static final apzy a;
    private static volatile ahev d;
    public ajws b;
    public apzz c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apzy.class, a = new apzy());
    }
    
    private apzy() {
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
                final ahev d;
                if ((d = apzy.d) == null) {
                    synchronized (apzy.class) {
                        if (apzy.d == null) {
                            apzy.d = (ahev)new ahcs((ahcz)apzy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzy.a;
            }
            case 4: {
                return new ahcr((ahcz)apzy.a);
            }
            case 3: {
                return new apzy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzy.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0004\u1409\u0001", new Object[] { "e", "b", "f", "c" });
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
