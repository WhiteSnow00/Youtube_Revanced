import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdj extends agzi implements ahax
{
    public static final apdj a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apdj.class, a = new apdj());
    }
    
    private apdj() {
        this.e = 2;
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
                if ((b2 = apdj.b) == null) {
                    synchronized (apdj.class) {
                        if (apdj.b == null) {
                            apdj.b = (ahbe)new agzb((agzi)apdj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apdj.a;
            }
            case 4: {
                return new agza((agzi)apdj.a);
            }
            case 3: {
                return new apdj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdj.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004\u1409\u0003", new Object[] { "c", "d" });
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