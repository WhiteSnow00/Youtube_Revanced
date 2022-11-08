import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoby extends agzi implements ahax
{
    public static final aoby a;
    private static volatile ahbe d;
    public int b;
    public aobx c;
    
    static {
        agzi.registerDefaultInstance(aoby.class, a = new aoby());
    }
    
    private aoby() {
        emptyProtobufList();
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
                final ahbe d;
                if ((d = aoby.d) == null) {
                    synchronized (aoby.class) {
                        if (aoby.d == null) {
                            aoby.d = (ahbe)new agzb((agzi)aoby.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoby.a;
            }
            case 4: {
                return new agza((agzi)aoby.a);
            }
            case 3: {
                return new aoby();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoby.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0001", new Object[] { "b", "c" });
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
