import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowc extends agzi implements ahax
{
    public static final aowc a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aowc.class, a = new aowc());
    }
    
    private aowc() {
        this.j = 2;
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
                if ((b2 = aowc.b) == null) {
                    synchronized (aowc.class) {
                        if (aowc.b == null) {
                            aowc.b = (ahbe)new agzb((agzi)aowc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aowc.a;
            }
            case 4: {
                return new agza((agzi)aowc.a);
            }
            case 3: {
                return new aowc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowc.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
