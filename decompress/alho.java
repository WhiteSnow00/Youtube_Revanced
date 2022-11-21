import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alho extends ahcz implements aheo
{
    public static final alho a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public ajws d;
    public akfj e;
    public akfj f;
    public boolean g;
    public ahkc h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alho.class, a = new alho());
    }
    
    private alho() {
        this.j = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = alho.i) == null) {
                    synchronized (alho.class) {
                        if (alho.i == null) {
                            alho.i = (ahev)new ahcs((ahcz)alho.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alho.a;
            }
            case 4: {
                return new ahcr((ahcz)alho.a);
            }
            case 3: {
                return new alho();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alho.a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1007\u0005\u0006\u1009\u0006\u0007\u1409\u0002", new Object[] { "b", "c", "e", "f", "g", "h", "d" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
