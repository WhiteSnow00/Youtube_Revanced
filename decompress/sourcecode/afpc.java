import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpc extends agzi implements ahax
{
    public static final afpc a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public afpd e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(afpc.class, a = new afpc());
    }
    
    private afpc() {
        this.g = 2;
        this.c = -1;
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
                final ahbe f;
                if ((f = afpc.f) == null) {
                    synchronized (afpc.class) {
                        if (afpc.f == null) {
                            afpc.f = (ahbe)new agzb((agzi)afpc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afpc.a;
            }
            case 4: {
                return new agza((agzi)afpc.a);
            }
            case 3: {
                return new afpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpc.a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0003\r\u1409\u000b", new Object[] { "b", "c", "d", "e" });
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
