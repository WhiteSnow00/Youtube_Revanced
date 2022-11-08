import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeto extends agzi implements ahax
{
    public static final aeto a;
    private static volatile ahbe c;
    public aetn b;
    
    static {
        agzi.registerDefaultInstance(aeto.class, a = new aeto());
    }
    
    private aeto() {
        agzi.emptyProtobufList();
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
                final ahbe c;
                if ((c = aeto.c) == null) {
                    synchronized (aeto.class) {
                        if (aeto.c == null) {
                            aeto.c = (ahbe)new agzb((agzi)aeto.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aeto.a;
            }
            case 4: {
                return new agza((agzi)aeto.a);
            }
            case 3: {
                return new aeto();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeto.a, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[] { "b" });
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
