import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjc extends agzi implements ahax
{
    public static final anjc a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public agzp d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(anjc.class, a = new anjc());
    }
    
    private anjc() {
        this.d = agzi.emptyFloatList();
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
                if ((e = anjc.e) == null) {
                    synchronized (anjc.class) {
                        if (anjc.e == null) {
                            anjc.e = (ahbe)new agzb((agzi)anjc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anjc.a;
            }
            case 4: {
                return new agza((agzi)anjc.a);
            }
            case 3: {
                return new anjc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u0013", new Object[] { "f", "b", "c", "d" });
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
