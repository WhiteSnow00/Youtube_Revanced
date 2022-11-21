import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxc extends ahcz implements aheo
{
    public static final apxc a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(apxc.class, a = new apxc());
    }
    
    private apxc() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apxc.f) == null) {
                    synchronized (apxc.class) {
                        if (apxc.f == null) {
                            apxc.f = (ahev)new ahcs((ahcz)apxc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxc.a;
            }
            case 4: {
                return new ahcr((ahcz)apxc.a);
            }
            case 3: {
                return new apxc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1003\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
