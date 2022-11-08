import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikp extends agzi implements ahax
{
    public static final aikp a;
    private static volatile ahbe g;
    public int b;
    public aioe c;
    public ajsq d;
    public boolean e;
    public agyc f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aikp.class, a = new aikp());
    }
    
    private aikp() {
        this.i = 2;
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
                if ((g = aikp.g) == null) {
                    synchronized (aikp.class) {
                        if (aikp.g == null) {
                            aikp.g = (ahbe)new agzb((agzi)aikp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aikp.a;
            }
            case 4: {
                return new agza((agzi)aikp.a);
            }
            case 3: {
                return new aikp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikp.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
