import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpb extends agzi implements ahax
{
    public static final akpb a;
    private static volatile ahbe g;
    public int b;
    public akjf c;
    public akoz d;
    public ansr e;
    public agyc f;
    private ajtl h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(akpb.class, a = new akpb());
    }
    
    private akpb() {
        this.i = 2;
        this.f = agyc.b;
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
                final ahbe g;
                if ((g = akpb.g) == null) {
                    synchronized (akpb.class) {
                        if (akpb.g == null) {
                            akpb.g = (ahbe)new agzb((agzi)akpb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akpb.a;
            }
            case 4: {
                return new agza((agzi)akpb.a);
            }
            case 3: {
                return new akpb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpb.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0309\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "h" });
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
