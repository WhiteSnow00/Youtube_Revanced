import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aett extends agzi implements ahax
{
    public static final aett a;
    private static volatile ahbe c;
    public agyc b;
    
    static {
        agzi.registerDefaultInstance(aett.class, a = new aett());
    }
    
    private aett() {
        this.b = agyc.b;
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
                if ((c = aett.c) == null) {
                    synchronized (aett.class) {
                        if (aett.c == null) {
                            aett.c = (ahbe)new agzb((agzi)aett.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aett.a;
            }
            case 4: {
                return new agza((agzi)aett.a);
            }
            case 3: {
                return new aett();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aett.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[] { "b" });
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
