import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiee extends agzi implements ahax
{
    public static final aiee a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private ajsq e;
    private ajsq f;
    private aibc g;
    private ajsq h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aiee.class, (agzi)(a = new aiee()));
    }
    
    private aiee() {
        this.i = 2;
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
                final ahbe b2;
                if ((b2 = aiee.b) == null) {
                    synchronized (aiee.class) {
                        if (aiee.b == null) {
                            aiee.b = (ahbe)new agzb((agzi)aiee.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiee.a;
            }
            case 4: {
                return new agza((agzi)aiee.a);
            }
            case 3: {
                return new aiee();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiee.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h" });
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
