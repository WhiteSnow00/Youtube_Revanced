import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptk extends agzi implements ahax
{
    public static final aptk a;
    private static volatile ahbe c;
    public aptl b;
    private int d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aptk.class, (agzi)(a = new aptk()));
    }
    
    private aptk() {
        this.f = 2;
        final agyc b = agyc.b;
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
                final ahbe c;
                if ((c = aptk.c) == null) {
                    synchronized (aptk.class) {
                        if (aptk.c == null) {
                            aptk.c = (ahbe)new agzb((agzi)aptk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aptk.a;
            }
            case 4: {
                return new agza((agzi)aptk.a);
            }
            case 3: {
                return new aptk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
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
