import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgb extends agzi implements ahax
{
    public static final aqgb a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqgb.class, (agzi)(a = new aqgb()));
    }
    
    private aqgb() {
        this.e = 2;
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
                final ahbe b2;
                if ((b2 = aqgb.b) == null) {
                    synchronized (aqgb.class) {
                        if (aqgb.b == null) {
                            aqgb.b = (ahbe)new agzb((agzi)aqgb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgb.a;
            }
            case 4: {
                return new agza((agzi)aqgb.a);
            }
            case 3: {
                return new aqgb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}