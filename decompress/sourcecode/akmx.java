import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmx extends agzi implements ahax
{
    public static final akmx a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public int d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akmx.class, a = new akmx());
    }
    
    private akmx() {
        this.f = 2;
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
                final ahbe e;
                if ((e = akmx.e) == null) {
                    synchronized (akmx.class) {
                        if (akmx.e == null) {
                            akmx.e = (ahbe)new agzb((agzi)akmx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akmx.a;
            }
            case 4: {
                return new agza((agzi)akmx.a);
            }
            case 3: {
                return new akmx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmx.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "b", "c", "d", ahzk.h });
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
