import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnl extends agzi implements ahax
{
    public static final agnl a;
    private static volatile ahbe d;
    public String b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(agnl.class, a = new agnl());
    }
    
    private agnl() {
        this.b = "";
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agnl.d) == null) {
                    synchronized (agnl.class) {
                        if (agnl.d == null) {
                            agnl.d = (ahbe)new agzb((agzi)agnl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agnl.a;
            }
            case 4: {
                return new agza((agzi)agnl.a);
            }
            case 3: {
                return new agnl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnl.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", new Object[] { "b", "c" });
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
