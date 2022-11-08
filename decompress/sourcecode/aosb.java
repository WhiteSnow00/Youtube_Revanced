import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosb extends agzi implements ahax
{
    public static final aosb a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public ajsq e;
    public int f;
    private int h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aosb.class, a = new aosb());
    }
    
    private aosb() {
        this.i = 2;
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
                if ((g = aosb.g) == null) {
                    synchronized (aosb.class) {
                        if (aosb.g == null) {
                            aosb.g = (ahbe)new agzb((agzi)aosb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aosb.a;
            }
            case 4: {
                return new agza((agzi)aosb.a);
            }
            case 3: {
                return new aosb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1409\u0003\u0005\u100c\u0004", new Object[] { "h", "b", "c", "d", "e", "f", akbe.a() });
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
