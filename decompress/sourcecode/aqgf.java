import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgf extends agzi implements ahax
{
    public static final aqgf a;
    private static volatile ahbe b;
    private int c;
    private aqgh d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aqgf.class, (agzi)(a = new aqgf()));
    }
    
    private aqgf() {
        this.f = 2;
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
                if ((b2 = aqgf.b) == null) {
                    synchronized (aqgf.class) {
                        if (aqgf.b == null) {
                            aqgf.b = (ahbe)new agzb((agzi)aqgf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgf.a;
            }
            case 4: {
                return new agza((agzi)aqgf.a);
            }
            case 3: {
                return new aqgf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgf.a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0005\u1409\u000e", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
