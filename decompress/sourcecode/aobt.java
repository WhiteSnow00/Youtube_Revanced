import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobt extends agzi implements ahax
{
    public static final aobt a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public aoby d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(aobt.class, a = new aobt());
    }
    
    private aobt() {
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
                final ahbe f;
                if ((f = aobt.f) == null) {
                    synchronized (aobt.class) {
                        if (aobt.f == null) {
                            aobt.f = (ahbe)new agzb((agzi)aobt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aobt.a;
            }
            case 4: {
                return new agza((agzi)aobt.a);
            }
            case 3: {
                return new aobt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobt.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0004\u100c\u0002", new Object[] { "b", "c", "d", "e", ajkr.f });
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
