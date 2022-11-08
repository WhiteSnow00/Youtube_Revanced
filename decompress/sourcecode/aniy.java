import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniy extends agzi implements ahax
{
    public static final aniy a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public aorm d;
    public aorm e;
    public ajsq f;
    public ajsq g;
    public anss h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aniy.class, a = new aniy());
    }
    
    private aniy() {
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
                final ahbe i;
                if ((i = aniy.i) == null) {
                    synchronized (aniy.class) {
                        if (aniy.i == null) {
                            aniy.i = (ahbe)new agzb((agzi)aniy.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aniy.a;
            }
            case 4: {
                return new agza((agzi)aniy.a);
            }
            case 3: {
                return new aniy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aniy.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0004\u0004\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0003", new Object[] { "b", "c", "d", "f", "g", "h", "e" });
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
