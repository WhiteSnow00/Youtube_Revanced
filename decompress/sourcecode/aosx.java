import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosx extends agzi implements ahax
{
    public static final aosx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aioe h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aosx.class, a = new aosx());
    }
    
    private aosx() {
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
                final ahbe b2;
                if ((b2 = aosx.b) == null) {
                    synchronized (aosx.class) {
                        if (aosx.b == null) {
                            aosx.b = (ahbe)new agzb((agzi)aosx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aosx.a;
            }
            case 4: {
                return new agza((agzi)aosx.a);
            }
            case 3: {
                return new aosx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosx.a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0004\u0007\u1409\u0005", new Object[] { "c", "d", "e", "h", "f", "g" });
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
