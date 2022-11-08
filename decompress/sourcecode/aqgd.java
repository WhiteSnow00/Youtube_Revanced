import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgd extends agzi implements ahax
{
    public static final aqgd a;
    private static volatile ahbe b;
    private int c;
    private aqbm d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqgd.class, (agzi)(a = new aqgd()));
    }
    
    private aqgd() {
        this.e = 2;
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
                if ((b2 = aqgd.b) == null) {
                    synchronized (aqgd.class) {
                        if (aqgd.b == null) {
                            aqgd.b = (ahbe)new agzb((agzi)aqgd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgd.a;
            }
            case 4: {
                return new agza((agzi)aqgd.a);
            }
            case 3: {
                return new aqgd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
