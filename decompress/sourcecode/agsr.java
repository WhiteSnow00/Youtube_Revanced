import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsr extends agzi implements ahax
{
    public static final agsr a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public String d;
    public int e;
    public ahfr f;
    private String h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(agsr.class, a = new agsr());
    }
    
    private agsr() {
        this.i = 2;
        this.h = "";
        this.d = "";
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
                if ((g = agsr.g) == null) {
                    synchronized (agsr.class) {
                        if (agsr.g == null) {
                            agsr.g = (ahbe)new agzb((agzi)agsr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agsr.a;
            }
            case 4: {
                return new agza((agzi)agsr.a);
            }
            case 3: {
                return new agsr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsr.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1409\u0004\u0006\u1004\u0003", new Object[] { "b", "c", "h", "d", "f", "e" });
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
