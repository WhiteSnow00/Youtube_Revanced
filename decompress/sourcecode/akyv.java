import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyv extends agzi implements ahax
{
    public static final akyv a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public anss d;
    public agyc e;
    private aioe g;
    private ahfw h;
    private ajtl i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)akyv.class, (agzi)(a = new akyv()));
    }
    
    private akyv() {
        this.j = 2;
        this.e = agyc.b;
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
                final ahbe f;
                if ((f = akyv.f) == null) {
                    synchronized (akyv.class) {
                        if (akyv.f == null) {
                            akyv.f = (ahbe)new agzb((agzi)akyv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akyv.a;
            }
            case 4: {
                return new agza((agzi)akyv.a);
            }
            case 3: {
                return new akyv();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyv.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u100a\u0004\u0309\u1409\u0005", new Object[] { "b", "c", "d", "g", "h", "e", "i" });
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
