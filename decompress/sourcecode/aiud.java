import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiud extends agzi implements ahax
{
    public static final aiud a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private ajsq e;
    private ajsq f;
    private anss g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aiud.class, a = new aiud());
    }
    
    private aiud() {
        this.i = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = aiud.b) == null) {
                    synchronized (aiud.class) {
                        if (aiud.b == null) {
                            aiud.b = (ahbe)new agzb((agzi)aiud.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiud.a;
            }
            case 4: {
                return new agza((agzi)aiud.a);
            }
            case 3: {
                return new aiud();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiud.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0003", new Object[] { "c", "d", "e", "f", "h", "g" });
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
