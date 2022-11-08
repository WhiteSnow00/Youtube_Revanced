import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonm extends agzi implements ahax
{
    public static final aonm a;
    private static volatile ahbe d;
    public int b;
    public aonl c;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aonm.class, (agzi)(a = new aonm()));
    }
    
    private aonm() {
        this.j = 2;
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
                final ahbe d;
                if ((d = aonm.d) == null) {
                    synchronized (aonm.class) {
                        if (aonm.d == null) {
                            aonm.d = (ahbe)new agzb((agzi)aonm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aonm.a;
            }
            case 4: {
                return new agza((agzi)aonm.a);
            }
            case 3: {
                return new aonm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonm.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\b\u1409\u0005", new Object[] { "b", "e", "f", "g", "c", "i", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
