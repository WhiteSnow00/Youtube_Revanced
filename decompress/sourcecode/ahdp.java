import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdp extends agzi implements ahax
{
    public static final ahdp a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public long e;
    public int f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahdp.class, a = new ahdp());
    }
    
    private ahdp() {
        this.h = 2;
        this.c = "";
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
                if ((g = ahdp.g) == null) {
                    synchronized (ahdp.class) {
                        if (ahdp.g == null) {
                            ahdp.g = (ahbe)new agzb((agzi)ahdp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahdp.a;
            }
            case 4: {
                return new agza((agzi)ahdp.a);
            }
            case 3: {
                return new ahdp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdp.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001\u1508\u0000\u0002\u150b\u0001\u0003\u1503\u0002\u0006\u100b\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
