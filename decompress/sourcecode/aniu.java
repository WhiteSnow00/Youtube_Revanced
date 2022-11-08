import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniu extends agzi implements ahax
{
    public static final aniu a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aniu.class, a = new aniu());
    }
    
    private aniu() {
        this.g = 2;
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
                final ahbe b2;
                if ((b2 = aniu.b) == null) {
                    synchronized (aniu.class) {
                        if (aniu.b == null) {
                            aniu.b = (ahbe)new agzb((agzi)aniu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aniu.a;
            }
            case 4: {
                return new agza((agzi)aniu.a);
            }
            case 3: {
                return new aniu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aniu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
