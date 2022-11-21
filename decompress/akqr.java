import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqr extends ahcz implements aheo
{
    public static final akqr a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(akqr.class, a = new akqr());
    }
    
    private akqr() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akqr.e) == null) {
                    synchronized (akqr.class) {
                        if (akqr.e == null) {
                            akqr.e = (ahev)new ahcs((ahcz)akqr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akqr.a;
            }
            case 4: {
                return new ahcr((ahcz)akqr.a);
            }
            case 3: {
                return new akqr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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
