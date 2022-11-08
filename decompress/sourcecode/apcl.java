import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcl extends agzi implements ahax
{
    public static final apcl a;
    private static volatile ahbe b;
    private int c;
    private apcp d;
    private amnx e;
    private apcp f;
    private amnx g;
    private amnx h;
    private amnx i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(apcl.class, a = new apcl());
    }
    
    private apcl() {
        this.k = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apcl.b) == null) {
                    synchronized (apcl.class) {
                        if (apcl.b == null) {
                            apcl.b = (ahbe)new agzb((agzi)apcl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcl.a;
            }
            case 4: {
                return new agza((agzi)apcl.a);
            }
            case 3: {
                return new apcl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcl.a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\t\u1409\b\n\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "i", "j", "h" });
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
