import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoec extends agzi implements ahax
{
    public static final aoec a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(aoec.class, a = new aoec());
    }
    
    private aoec() {
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
                if ((e = aoec.e) == null) {
                    synchronized (aoec.class) {
                        if (aoec.e == null) {
                            aoec.e = (ahbe)new agzb((agzi)aoec.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoec.a;
            }
            case 4: {
                return new agza((agzi)aoec.a);
            }
            case 3: {
                return new aoec();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoec.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
