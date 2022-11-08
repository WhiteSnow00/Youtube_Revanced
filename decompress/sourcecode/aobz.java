import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobz extends agzi implements ahax
{
    public static final aobz a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aobz.class, a = new aobz());
    }
    
    private aobz() {
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
                if ((c = aobz.c) == null) {
                    synchronized (aobz.class) {
                        if (aobz.c == null) {
                            aobz.c = (ahbe)new agzb((agzi)aobz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aobz.a;
            }
            case 4: {
                return new agza((agzi)aobz.a);
            }
            case 3: {
                return new aobz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aobv.class });
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
