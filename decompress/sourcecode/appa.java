import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appa extends agzi implements ahax
{
    public static final appa a;
    private static volatile ahbe h;
    public int b;
    public aorm c;
    public aorm d;
    public aorm e;
    public aioe f;
    public ajsq g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)appa.class, (agzi)(a = new appa()));
    }
    
    private appa() {
        this.j = 2;
        final agyc b = agyc.b;
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
                final ahbe h;
                if ((h = appa.h) == null) {
                    synchronized (appa.class) {
                        if (appa.h == null) {
                            appa.h = (ahbe)new agzb((agzi)appa.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return appa.a;
            }
            case 4: {
                return new agza((agzi)appa.a);
            }
            case 3: {
                return new appa();
            }
            case 2: {
                return newMessageInfo((MessageLite)appa.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
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
