import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpu extends agzi implements ahax
{
    public static final afpu a;
    private static volatile ahbe i;
    public int b;
    public afpm c;
    public int d;
    public long e;
    public long f;
    public String g;
    public int h;
    
    static {
        agzi.registerDefaultInstance(afpu.class, a = new afpu());
    }
    
    private afpu() {
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = afpu.i) == null) {
                    synchronized (afpu.class) {
                        if (afpu.i == null) {
                            afpu.i = (ahbe)new agzb((agzi)afpu.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return afpu.a;
            }
            case 4: {
                return new agza((agzi)afpu.a);
            }
            case 3: {
                return new afpu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpu.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1004\u0005", new Object[] { "b", "c", "d", aeih.p, "e", "f", "g", "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
