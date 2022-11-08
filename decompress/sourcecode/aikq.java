import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikq extends agzi implements ahax
{
    public static final aikq a;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public ajsq d;
    public agyc e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aikq.class, a = new aikq());
    }
    
    private aikq() {
        this.h = 2;
        this.e = agyc.b;
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
                if ((f = aikq.f) == null) {
                    synchronized (aikq.class) {
                        if (aikq.f == null) {
                            aikq.f = (ahbe)new agzb((agzi)aikq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aikq.a;
            }
            case 4: {
                return new agza((agzi)aikq.a);
            }
            case 3: {
                return new aikq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
