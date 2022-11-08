import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikn extends agzi implements ahax
{
    public static final aikn a;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public ajsq d;
    public agyc e;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aikn.class, a = new aikn());
    }
    
    private aikn() {
        this.i = 2;
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
                if ((f = aikn.f) == null) {
                    synchronized (aikn.class) {
                        if (aikn.f == null) {
                            aikn.f = (ahbe)new agzb((agzi)aikn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aikn.a;
            }
            case 4: {
                return new agza((agzi)aikn.a);
            }
            case 3: {
                return new aikn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikn.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "g", "h", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
