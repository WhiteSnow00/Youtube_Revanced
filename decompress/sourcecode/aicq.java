import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicq extends agzi implements ahax
{
    public static final aicq a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aicq.class, (agzi)(a = new aicq()));
    }
    
    private aicq() {
        this.g = 2;
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
                if ((b2 = aicq.b) == null) {
                    synchronized (aicq.class) {
                        if (aicq.b == null) {
                            aicq.b = (ahbe)new agzb((agzi)aicq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aicq.a;
            }
            case 4: {
                return new agza((agzi)aicq.a);
            }
            case 3: {
                return new aicq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicq.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
