import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobp extends agzi implements ahax
{
    public static final aobp a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aobp.class, a = new aobp());
    }
    
    private aobp() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b2 = aobp.b) == null) {
                    synchronized (aobp.class) {
                        if (aobp.b == null) {
                            aobp.b = (ahbe)new agzb((agzi)aobp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aobp.a;
            }
            case 4: {
                return new agza((agzi)aobp.a);
            }
            case 3: {
                return new aobp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobp.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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