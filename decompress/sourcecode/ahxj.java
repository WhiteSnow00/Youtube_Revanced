import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxj extends agzi implements ahax
{
    public static final ahxj a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahxj.class, a = new ahxj());
    }
    
    private ahxj() {
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
                if ((e = ahxj.e) == null) {
                    synchronized (ahxj.class) {
                        if (ahxj.e == null) {
                            ahxj.e = (ahbe)new agzb((agzi)ahxj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahxj.a;
            }
            case 4: {
                return new agza((agzi)ahxj.a);
            }
            case 3: {
                return new ahxj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", ahse.s });
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
