import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoeq extends agzi implements ahax
{
    public static final aoeq a;
    private static volatile ahbe m;
    public int b;
    public ajsq c;
    public aoew d;
    public agzy e;
    public aiib f;
    public aioe g;
    public ajsq h;
    public ajsq i;
    public ahyq j;
    public amer k;
    public agyc l;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(aoeq.class, a = new aoeq());
    }
    
    private aoeq() {
        this.o = 2;
        this.e = agzi.emptyProtobufList();
        this.l = agyc.b;
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
                final ahbe m;
                if ((m = aoeq.m) == null) {
                    synchronized (aoeq.class) {
                        if (aoeq.m == null) {
                            aoeq.m = (ahbe)new agzb((agzi)aoeq.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aoeq.a;
            }
            case 4: {
                return new agza((agzi)aoeq.a);
            }
            case 3: {
                return new aoeq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoeq.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\u0006\t\u1409\u0007\n\u1409\b\u000b\u100a\t\f\u041b\r\u1409\u0002", new Object[] { "b", "c", "d", "g", "h", "i", "j", "k", "n", "l", "e", aora.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
