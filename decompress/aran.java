import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aran extends ahcz implements aheo
{
    public static final aran a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aran.class, a = new aran());
    }
    
    private aran() {
        this.d = 30;
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
                if ((e = aran.e) == null) {
                    synchronized (aran.class) {
                        if (aran.e == null) {
                            aran.e = (ahev)new ahcs((ahcz)aran.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aran.a;
            }
            case 4: {
                return new ahcr((ahcz)aran.a);
            }
            case 3: {
                return new aran();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aran.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
