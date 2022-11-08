import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosl extends agzi implements ahax
{
    public static final aosl a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aosl.class, a = new aosl());
    }
    
    private aosl() {
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
                if ((c = aosl.c) == null) {
                    synchronized (aosl.class) {
                        if (aosl.c == null) {
                            aosl.c = (ahbe)new agzb((agzi)aosl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aosl.a;
            }
            case 4: {
                return new agza((agzi)aosl.a);
            }
            case 3: {
                return new aosl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosl.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[] { "b", aosn.class });
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
