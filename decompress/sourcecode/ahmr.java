import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmr extends agzi implements ahax
{
    public static final ahmr a;
    private static volatile ahbe d;
    public String b;
    public String c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ahmr.class, (agzi)(a = new ahmr()));
    }
    
    private ahmr() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahmr.d) == null) {
                    synchronized (ahmr.class) {
                        if (ahmr.d == null) {
                            ahmr.d = (ahbe)new agzb((agzi)ahmr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmr.a;
            }
            case 4: {
                return new agza((agzi)ahmr.a);
            }
            case 3: {
                return new ahmr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
