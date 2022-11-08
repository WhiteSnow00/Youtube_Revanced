import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtx extends agzi implements ahax
{
    public static final ahtx a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahtx.class, a = new ahtx());
    }
    
    private ahtx() {
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
                if ((c = ahtx.c) == null) {
                    synchronized (ahtx.class) {
                        if (ahtx.c == null) {
                            ahtx.c = (ahbe)new agzb((agzi)ahtx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahtx.a;
            }
            case 4: {
                return new agza((agzi)ahtx.a);
            }
            case 3: {
                return new ahtx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtx.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
