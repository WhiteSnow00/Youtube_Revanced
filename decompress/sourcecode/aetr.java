import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetr extends agzi implements ahax
{
    public static final aetr a;
    private static volatile ahbe f;
    public int b;
    public aett c;
    public agzy d;
    public aeua e;
    
    static {
        agzi.registerDefaultInstance(aetr.class, a = new aetr());
    }
    
    private aetr() {
        this.d = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aetr.f) == null) {
                    synchronized (aetr.class) {
                        if (aetr.f == null) {
                            aetr.f = (ahbe)new agzb((agzi)aetr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aetr.a;
            }
            case 4: {
                return new agza((agzi)aetr.a);
            }
            case 3: {
                return new aetr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetr.a, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0004\f\u0007\t", new Object[] { "c", "d", aeub.class, "b", "e" });
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
