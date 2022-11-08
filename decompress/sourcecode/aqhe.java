import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhe extends agzi implements ahax
{
    public static final aqhe a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)aqhe.class, (agzi)(a = new aqhe()));
    }
    
    private aqhe() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqhe.c) == null) {
                    synchronized (aqhe.class) {
                        if (aqhe.c == null) {
                            aqhe.c = (ahbe)new agzb((agzi)aqhe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqhe.a;
            }
            case 4: {
                return new agza((float[])null, (int[][])null);
            }
            case 3: {
                return new aqhe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhe.a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0000\u0006\u001b", new Object[] { "b", anlv.class });
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
