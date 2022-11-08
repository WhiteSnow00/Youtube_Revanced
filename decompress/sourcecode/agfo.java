import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfo extends agzi implements ahax
{
    private static final agfo a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance(agfo.class, a = new agfo());
    }
    
    private agfo() {
        this.c = "";
    }
    
    public static /* synthetic */ agfo a() {
        return agfo.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agfo.b) == null) {
                    synchronized (agfo.class) {
                        if (agfo.b == null) {
                            agfo.b = (ahbe)new agzb((agzi)agfo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agfo.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new agfo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfo.a, "\u0001\u0000", null);
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
