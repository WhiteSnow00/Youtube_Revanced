import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobs extends agzi implements ahax
{
    public static final aobs a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aobs.class, a = new aobs());
    }
    
    private aobs() {
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
                if ((c = aobs.c) == null) {
                    synchronized (aobs.class) {
                        if (aobs.c == null) {
                            aobs.c = (ahbe)new agzb((agzi)aobs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aobs.a;
            }
            case 4: {
                return new agza((int[][])null, (byte[][])null);
            }
            case 3: {
                return new aobs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobs.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aobu.class });
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
