import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowf extends agzi implements ahax
{
    public static final aowf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowf.class, a = new aowf());
    }
    
    private aowf() {
        emptyProtobufList();
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
                if ((b = aowf.b) == null) {
                    synchronized (aowf.class) {
                        if (aowf.b == null) {
                            aowf.b = (ahbe)new agzb((agzi)aowf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowf.a;
            }
            case 4: {
                return new agza((agzi)aowf.a);
            }
            case 3: {
                return new aowf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowf.a, "\u0001\u0000", null);
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
