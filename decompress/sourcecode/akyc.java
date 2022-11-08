import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyc extends agzi implements ahax
{
    public static final akyc a;
    private static volatile ahbe j;
    public int b;
    public akjf c;
    public agzy d;
    public agzy e;
    public akya f;
    public akst g;
    public agyc h;
    public long i;
    private ahfw k;
    private ajtl l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)akyc.class, (agzi)(a = new akyc()));
    }
    
    private akyc() {
        this.m = 2;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe j;
                if ((j = akyc.j) == null) {
                    synchronized (akyc.class) {
                        if (akyc.j == null) {
                            akyc.j = (ahbe)new agzb((agzi)akyc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akyc.a;
            }
            case 4: {
                return new agza((agzi)akyc.a);
            }
            case 3: {
                return new akyc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyc.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0002\u0006\u0001\u1409\u0000\u0003\u001b\u0005\u041b\u0006\u1409\u0001\u0007\u1409\u0002\b\u1409\u0003\t\u100a\u0004\n\u1002\u0005\u0309\u1409\u0006", new Object[] { "b", "c", "d", alud.class, "e", aioe.class, "f", "g", "k", "h", "i", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
