import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmt extends agzi implements ahax
{
    public static final akmt a;
    private static volatile ahbe d;
    public akjf b;
    public agzy c;
    private int e;
    private ajtl f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akmt.class, a = new akmt());
    }
    
    private akmt() {
        this.g = 2;
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
                final ahbe d;
                if ((d = akmt.d) == null) {
                    synchronized (akmt.class) {
                        if (akmt.d == null) {
                            akmt.d = (ahbe)new agzb((agzi)akmt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmt.a;
            }
            case 4: {
                return new agza((agzi)akmt.a);
            }
            case 3: {
                return new akmt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmt.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0309\u1409\u0001", new Object[] { "e", "b", "c", akmq.class, "f" });
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
