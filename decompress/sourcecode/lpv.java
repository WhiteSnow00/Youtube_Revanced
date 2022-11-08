import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpv extends agzi implements ahax
{
    public static final lpv a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public lpu d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(lpv.class, a = new lpv());
    }
    
    private lpv() {
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
                if ((e = lpv.e) == null) {
                    synchronized (lpv.class) {
                        if (lpv.e == null) {
                            lpv.e = (ahbe)new agzb((agzi)lpv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return lpv.a;
            }
            case 4: {
                return new agza((agzi)lpv.a);
            }
            case 3: {
                return new lpv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpv.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002\u1004\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d" });
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
