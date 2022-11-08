import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlx extends agzi implements ahax
{
    public static final ajlx a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public akbf e;
    public aioe f;
    public amer g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)ajlx.class, (agzi)(a = new ajlx()));
    }
    
    private ajlx() {
        this.k = 2;
        this.h = agyc.b;
    }
    
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
                if ((i = ajlx.i) == null) {
                    synchronized (ajlx.class) {
                        if (ajlx.i == null) {
                            ajlx.i = (ahbe)new agzb((agzi)ajlx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajlx.a;
            }
            case 4: {
                return new agza((agzi)ajlx.a);
            }
            case 3: {
                return new ajlx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlx.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u100a\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
