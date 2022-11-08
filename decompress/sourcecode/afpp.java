import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpp extends agzi implements ahax
{
    public static final afpp a;
    private static volatile ahbe k;
    public int b;
    public int c;
    public String d;
    public int e;
    public String f;
    public boolean g;
    public long h;
    public long i;
    public String j;
    
    static {
        agzi.registerDefaultInstance(afpp.class, a = new afpp());
    }
    
    private afpp() {
        this.d = "";
        this.f = "";
        this.j = "";
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
                if ((k = afpp.k) == null) {
                    synchronized (afpp.class) {
                        if (afpp.k == null) {
                            afpp.k = (ahbe)new agzb((agzi)afpp.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return afpp.a;
            }
            case 4: {
                return new agza((agzi)afpp.a);
            }
            case 3: {
                return new afpp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpp.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u1002\u0005\b\u1002\u0007\t\u1008\b", new Object[] { "b", "c", aeih.n, "d", "e", "f", "g", "h", "i", "j" });
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
