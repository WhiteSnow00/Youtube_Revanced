import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akye extends agzi implements ahax
{
    public static final akye a;
    private static volatile ahbe h;
    public int b;
    public akjf c;
    public agzy d;
    public agzy e;
    public agyc f;
    public long g;
    private ahfw i;
    private ajtl j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)akye.class, (agzi)(a = new akye()));
    }
    
    private akye() {
        this.k = 2;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = agyc.b;
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
                final ahbe h;
                if ((h = akye.h) == null) {
                    synchronized (akye.class) {
                        if (akye.h == null) {
                            akye.h = (ahbe)new agzb((agzi)akye.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akye.a;
            }
            case 4: {
                return new agza((agzi)akye.a);
            }
            case 3: {
                return new akye();
            }
            case 2: {
                return newMessageInfo((MessageLite)akye.a, "\u0001\u0007\u0000\u0001\u0001\u0309\u0007\u0000\u0002\u0004\u0001\u1409\u0000\u0003\u001b\u0005\u041b\u0006\u1409\u0001\u0007\u100a\u0002\b\u1002\u0003\u0309\u1409\u0004", new Object[] { "b", "c", "d", alud.class, "e", aioe.class, "i", "f", "g", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
