import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjp extends agzi implements ahax
{
    public static final ahjp a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private int e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahjp.class, (agzi)(a = new ahjp()));
    }
    
    private ahjp() {
        this.b = 0;
        this.g = 2;
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
                if ((d = ahjp.d) == null) {
                    synchronized (ahjp.class) {
                        if (ahjp.d == null) {
                            ahjp.d = (ahbe)new agzb((agzi)ahjp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjp.a;
            }
            case 4: {
                return new agza((agzi)ahjp.a);
            }
            case 3: {
                return new ahjp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjp.a, "\u0001\u0003\u0001\u0001\u0001\t\u0003\u0000\u0000\u0001\u0001\u103d\u0000\u0006\u1409\u0002\t\u103b\u0000", new Object[] { "c", "b", "e", "f" });
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
