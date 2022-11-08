import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqd extends agzi implements ahax
{
    public static final akqd a;
    private static volatile ahbe e;
    public akjf b;
    public agzy c;
    public aioe d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akqd.class, a = new akqd());
    }
    
    private akqd() {
        this.g = 2;
        emptyProtobufList();
        this.c = agzi.emptyProtobufList();
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
                if ((e = akqd.e) == null) {
                    synchronized (akqd.class) {
                        if (akqd.e == null) {
                            akqd.e = (ahbe)new agzb((agzi)akqd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akqd.a;
            }
            case 4: {
                return new agza((agzi)akqd.a);
            }
            case 3: {
                return new akqd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akqd.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0004\u041b\u0005\u1409\u0001", new Object[] { "f", "b", "c", aioe.class, "d" });
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
