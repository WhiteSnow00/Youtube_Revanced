import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxx extends ahcz implements aheo
{
    public static final alxx a;
    private static volatile ahev i;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    private int j;
    
    static {
        ahcz.registerDefaultInstance(alxx.class, a = new alxx());
    }
    
    private alxx() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = alxx.i) == null) {
                    synchronized (alxx.class) {
                        if (alxx.i == null) {
                            alxx.i = (ahev)new ahcs((ahcz)alxx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alxx.a;
            }
            case 4: {
                return new ahcr((ahcz)alxx.a);
            }
            case 3: {
                return new alxx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxx.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1004\u0005\u0007\u1007\u0006", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
