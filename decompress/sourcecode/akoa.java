import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoa extends agzi implements ahax
{
    public static final akoa a;
    private static volatile ahbe i;
    public int b;
    public akjf c;
    public anss d;
    public anss e;
    public anss f;
    public int g;
    public int h;
    private ansr j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(akoa.class, a = new akoa());
    }
    
    private akoa() {
        this.l = 2;
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
                final ahbe i;
                if ((i = akoa.i) == null) {
                    synchronized (akoa.class) {
                        if (akoa.i == null) {
                            akoa.i = (ahbe)new agzb((agzi)akoa.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akoa.a;
            }
            case 4: {
                return new agza((agzi)akoa.a);
            }
            case 3: {
                return new akoa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoa.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0007\u1409\b\b\u1409\u0004\t\u100b\u0005\n\u100b\u0006", new Object[] { "b", "c", "d", "e", "f", "k", "j", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
