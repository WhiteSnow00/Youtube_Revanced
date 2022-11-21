import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkv extends ahcz implements aheo
{
    public static final amkv a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public ajws d;
    public akfj e;
    public aowb f;
    public aisc g;
    public anxb h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(amkv.class, a = new amkv());
    }
    
    private amkv() {
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
                if ((i = amkv.i) == null) {
                    synchronized (amkv.class) {
                        if (amkv.i == null) {
                            amkv.i = (ahev)new ahcs((ahcz)amkv.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amkv.a;
            }
            case 4: {
                return new ahcr((ahcz)amkv.a);
            }
            case 3: {
                return new amkv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkv.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
