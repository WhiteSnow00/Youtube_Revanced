import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimj extends agzi implements ahax
{
    public static final aimj a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aimj.class, a = new aimj());
    }
    
    private aimj() {
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
                if ((c = aimj.c) == null) {
                    synchronized (aimj.class) {
                        if (aimj.c == null) {
                            aimj.c = (ahbe)new agzb((agzi)aimj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aimj.a;
            }
            case 4: {
                return new agza((agzi)aimj.a);
            }
            case 3: {
                return new aimj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimj.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aimi.class });
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
