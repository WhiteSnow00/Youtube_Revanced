import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhq extends agzi implements ahax
{
    public static final ahhq a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahhq.class, a = new ahhq());
    }
    
    private ahhq() {
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
                if ((b2 = ahhq.b) == null) {
                    synchronized (ahhq.class) {
                        if (ahhq.b == null) {
                            ahhq.b = (ahbe)new agzb((agzi)ahhq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahhq.a;
            }
            case 4: {
                return new agza((agzi)ahhq.a);
            }
            case 3: {
                return new ahhq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
