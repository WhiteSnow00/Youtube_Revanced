import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsq extends agzi implements ahax
{
    public static final amsq a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public int d;
    public apni e;
    public int f;
    public int g;
    public boolean h;
    
    static {
        agzi.registerDefaultInstance(amsq.class, a = new amsq());
    }
    
    private amsq() {
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
                final ahbe i;
                if ((i = amsq.i) == null) {
                    synchronized (amsq.class) {
                        if (amsq.i == null) {
                            amsq.i = (ahbe)new agzb((agzi)amsq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amsq.a;
            }
            case 4: {
                return new agza((agzi)amsq.a);
            }
            case 3: {
                return new amsq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsq.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0005\u1009\u0003\u0006\u1004\u0005\u0007\u1004\u0006\t\u1007\b", new Object[] { "b", "c", "d", amsc.d, "e", "f", "g", "h" });
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
