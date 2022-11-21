import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubx extends ahcz implements aheo
{
    public static final aubx a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    private aubv f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aubx.class, a = new aubx());
    }
    
    private aubx() {
        this.g = 2;
        this.d = 1;
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
                final ahev e;
                if ((e = aubx.e) == null) {
                    synchronized (aubx.class) {
                        if (aubx.e == null) {
                            aubx.e = (ahev)new ahcs((ahcz)aubx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aubx.a;
            }
            case 4: {
                return new ahcr((ahcz)aubx.a);
            }
            case 3: {
                return new aubx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "b", "c", aubw.a(), "d", "f" });
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
