import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknr extends agzi implements ahax
{
    public static final aknr a;
    private static volatile ahbe e;
    public akjf b;
    public aioe c;
    public agyc d;
    private int f;
    private ahfw g;
    private ajtl h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aknr.class, a = new aknr());
    }
    
    private aknr() {
        this.i = 2;
        this.d = agyc.b;
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
                if ((e = aknr.e) == null) {
                    synchronized (aknr.class) {
                        if (aknr.e == null) {
                            aknr.e = (ahbe)new agzb((agzi)aknr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknr.a;
            }
            case 4: {
                return new agza((agzi)aknr.a);
            }
            case 3: {
                return new aknr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknr.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0309\u1409\u0004", new Object[] { "f", "b", "c", "g", "d", "h" });
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
