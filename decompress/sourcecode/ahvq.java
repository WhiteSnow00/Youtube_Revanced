import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvq extends agzi implements ahax
{
    public static final ahvq a;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public boolean d;
    public boolean e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahvq.class, a = new ahvq());
    }
    
    private ahvq() {
        this.h = 2;
        final agyc b = agyc.b;
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
                if ((f = ahvq.f) == null) {
                    synchronized (ahvq.class) {
                        if (ahvq.f == null) {
                            ahvq.f = (ahbe)new agzb((agzi)ahvq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahvq.a;
            }
            case 4: {
                return new agza((agzi)ahvq.a);
            }
            case 3: {
                return new ahvq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "g" });
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
