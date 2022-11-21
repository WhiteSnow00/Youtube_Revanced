import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algh extends ahcz implements aheo
{
    public static final algh a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(algh.class, a = new algh());
    }
    
    private algh() {
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
                if ((e = algh.e) == null) {
                    synchronized (algh.class) {
                        if (algh.e == null) {
                            algh.e = (ahev)new ahcs((ahcz)algh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return algh.a;
            }
            case 4: {
                return new ahcr((ahcz)algh.a);
            }
            case 3: {
                return new algh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
