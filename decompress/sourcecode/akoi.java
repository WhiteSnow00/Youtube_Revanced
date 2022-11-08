import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoi extends agzi implements ahax
{
    public static final akoi a;
    private static volatile ahbe e;
    public int b;
    public akjf c;
    public anss d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akoi.class, a = new akoi());
    }
    
    private akoi() {
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
                if ((e = akoi.e) == null) {
                    synchronized (akoi.class) {
                        if (akoi.e == null) {
                            akoi.e = (ahbe)new agzb((agzi)akoi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akoi.a;
            }
            case 4: {
                return new agza((agzi)akoi.a);
            }
            case 3: {
                return new akoi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoi.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "b", "c", "d" });
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
