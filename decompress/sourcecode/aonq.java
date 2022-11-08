import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonq extends agzi implements ahax
{
    public static final aonq a;
    private static volatile ahbe b;
    private int c;
    private akah d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aonq.class, (agzi)(a = new aonq()));
    }
    
    private aonq() {
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
                if ((b2 = aonq.b) == null) {
                    synchronized (aonq.class) {
                        if (aonq.b == null) {
                            aonq.b = (ahbe)new agzb((agzi)aonq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aonq.a;
            }
            case 4: {
                return new agza((agzi)aonq.a);
            }
            case 3: {
                return new aonq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonq.a, "\u0001\u0001\u0000\u0001\ue7ec\u1886\ue7ec\u1886\u0001\u0000\u0000\u0001\ue7ec\u1886\u1409\u0000", new Object[] { "c", "d" });
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
