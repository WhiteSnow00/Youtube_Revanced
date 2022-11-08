import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfn extends agzi implements ahax
{
    private static final agfn a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance(agfn.class, a = new agfn());
    }
    
    private agfn() {
        this.c = "";
    }
    
    public static /* synthetic */ agfn a() {
        return agfn.a;
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
                if ((b = agfn.b) == null) {
                    synchronized (agfn.class) {
                        if (agfn.b == null) {
                            agfn.b = (ahbe)new agzb((agzi)agfn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agfn.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new agfn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfn.a, "\u0001\u0000", null);
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
