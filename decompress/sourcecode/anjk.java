import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjk extends agzi implements ahax
{
    public static final anjk a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public anjm d;
    
    static {
        agzi.registerDefaultInstance(anjk.class, a = new anjk());
    }
    
    private anjk() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = anjk.e) == null) {
                    synchronized (anjk.class) {
                        if (anjk.e == null) {
                            anjk.e = (ahbe)new agzb((agzi)anjk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anjk.a;
            }
            case 4: {
                return new agza((agzi)anjk.a);
            }
            case 3: {
                return new anjk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
