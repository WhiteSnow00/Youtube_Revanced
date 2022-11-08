import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmy extends agzi implements ahax
{
    public static final akmy a;
    private static volatile ahbe e;
    public akjf b;
    public akmw c;
    public agyc d;
    private int f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(akmy.class, a = new akmy());
    }
    
    private akmy() {
        this.h = 2;
        this.d = agyc.b;
        emptyProtobufList();
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
                if ((e = akmy.e) == null) {
                    synchronized (akmy.class) {
                        if (akmy.e == null) {
                            akmy.e = (ahbe)new agzb((agzi)akmy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akmy.a;
            }
            case 4: {
                return new agza((agzi)akmy.a);
            }
            case 3: {
                return new akmy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmy.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003", new Object[] { "f", "b", "c", "g", "d" });
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
