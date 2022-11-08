import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqd extends agzi implements ahax
{
    public static final aoqd a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public ahas d;
    
    static {
        agzi.registerDefaultInstance(aoqd.class, a = new aoqd());
    }
    
    private aoqd() {
        this.d = ahas.a;
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
                if ((e = aoqd.e) == null) {
                    synchronized (aoqd.class) {
                        if (aoqd.e == null) {
                            aoqd.e = (ahbe)new agzb((agzi)aoqd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoqd.a;
            }
            case 4: {
                return new agza((agzi)aoqd.a);
            }
            case 3: {
                return new aoqd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqd.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003\u1008\u0001", new Object[] { "b", "d", aoqc.a, "c" });
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
