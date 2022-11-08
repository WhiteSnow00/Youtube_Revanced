import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevz extends agzi implements ahax
{
    public static final aevz a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aevz.class, a = new aevz());
    }
    
    private aevz() {
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
                if ((c = aevz.c) == null) {
                    synchronized (aevz.class) {
                        if (aevz.c == null) {
                            aevz.c = (ahbe)new agzb((agzi)aevz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aevz.a;
            }
            case 4: {
                return new agza((agzi)aevz.a);
            }
            case 3: {
                return new aevz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aevz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aevy.class });
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
