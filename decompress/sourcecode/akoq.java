import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoq extends agzi implements ahax
{
    public static final akoq a;
    private static volatile ahbe e;
    public int b;
    public akjf c;
    public aioe d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akoq.class, a = new akoq());
    }
    
    private akoq() {
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
                if ((e = akoq.e) == null) {
                    synchronized (akoq.class) {
                        if (akoq.e == null) {
                            akoq.e = (ahbe)new agzb((agzi)akoq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akoq.a;
            }
            case 4: {
                return new agza((agzi)akoq.a);
            }
            case 3: {
                return new akoq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
