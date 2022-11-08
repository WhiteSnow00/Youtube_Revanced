import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwl extends agzi implements ahax
{
    public static final amwl a;
    private static volatile ahbe g;
    public akjf b;
    public amwm c;
    public ansr d;
    public aioe e;
    public agyc f;
    private int h;
    private ahfw i;
    private ajtl j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(amwl.class, a = new amwl());
    }
    
    private amwl() {
        this.k = 2;
        this.f = agyc.b;
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
                if ((g = amwl.g) == null) {
                    synchronized (amwl.class) {
                        if (amwl.g == null) {
                            amwl.g = (ahbe)new agzb((agzi)amwl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amwl.a;
            }
            case 4: {
                return new agza((agzi)amwl.a);
            }
            case 3: {
                return new amwl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwl.a, "\u0001\u0007\u0000\u0001\u0001\u0309\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u100a\u0005\u0006\u1409\u0003\u0309\u1409\u0006", new Object[] { "h", "b", "c", "d", "i", "f", "e", "j" });
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
