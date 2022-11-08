import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwd extends agzi implements ahax
{
    public static final amwd a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public boolean f;
    public ajsq g;
    private aioe i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(amwd.class, a = new amwd());
    }
    
    private amwd() {
        this.j = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = amwd.h) == null) {
                    synchronized (amwd.class) {
                        if (amwd.h == null) {
                            amwd.h = (ahbe)new agzb((agzi)amwd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amwd.a;
            }
            case 4: {
                return new agza((agzi)amwd.a);
            }
            case 3: {
                return new amwd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwd.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1007\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
