import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class agbv extends agzi implements ahax
{
    public static final agbv a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(agbv.class, a = new agbv());
    }
    
    private agbv() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agbv.c) == null) {
                    synchronized (agbv.class) {
                        if (agbv.c == null) {
                            agbv.c = (ahbe)new agzb((agzi)agbv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agbv.a;
            }
            case 4: {
                return new agza((agzi)agbv.a);
            }
            case 3: {
                return new agbv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbv.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[] { "b", agbl.class });
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
