import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosc extends agzi implements ahax
{
    public static final aosc a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public ajsq e;
    public int f;
    private int h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aosc.class, a = new aosc());
    }
    
    private aosc() {
        this.j = 2;
        final agyc b = agyc.b;
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
                final ahbe g;
                if ((g = aosc.g) == null) {
                    synchronized (aosc.class) {
                        if (aosc.g == null) {
                            aosc.g = (ahbe)new agzb((agzi)aosc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aosc.a;
            }
            case 4: {
                return new agza((agzi)aosc.a);
            }
            case 3: {
                return new aosc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosc.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1409\u0003\u0005\u100c\u0004\u0006\u1409\u0005", new Object[] { "h", "b", "c", "d", "e", "f", akbe.a(), "i" });
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
