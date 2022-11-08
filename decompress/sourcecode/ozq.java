import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozq extends agzd implements agze
{
    public static final ozq a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public agzq d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ozq.class, (agzi)(a = new ozq()));
    }
    
    private ozq() {
        this.f = 2;
        this.d = emptyIntList();
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
                final ahbe e;
                if ((e = ozq.e) == null) {
                    synchronized (ozq.class) {
                        if (ozq.e == null) {
                            ozq.e = (ahbe)new agzb((agzi)ozq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ozq.a;
            }
            case 4: {
                return new agzc(ozq.a);
            }
            case 3: {
                return new ozq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ozq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u0016", new Object[] { "b", "c", aeih.u, "d" });
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
