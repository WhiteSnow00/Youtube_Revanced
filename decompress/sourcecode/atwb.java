import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwb extends agzi implements ahax
{
    public static final atwb a;
    private static volatile ahbe k;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    
    static {
        agzi.registerDefaultInstance(atwb.class, a = new atwb());
    }
    
    private atwb() {
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
                final ahbe k;
                if ((k = atwb.k) == null) {
                    synchronized (atwb.class) {
                        if (atwb.k == null) {
                            atwb.k = (ahbe)new agzb((agzi)atwb.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return atwb.a;
            }
            case 4: {
                return new agza((agzi)atwb.a);
            }
            case 3: {
                return new atwb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwb.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", arbt.d, "e", "f", arbt.c, "g", "h", "i", "j" });
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
