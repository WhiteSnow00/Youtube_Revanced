import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfj extends agzi implements ahax
{
    public static final ajfj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ajfj.class, a = new ajfj());
    }
    
    private ajfj() {
        this.b = 0;
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
                if ((d = ajfj.d) == null) {
                    synchronized (ajfj.class) {
                        if (ajfj.d == null) {
                            ajfj.d = (ahbe)new agzb((agzi)ajfj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfj.a;
            }
            case 4: {
                return new agza((agzi)ajfj.a);
            }
            case 3: {
                return new ajfj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfj.a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000", new Object[] { "c", "b", ajfd.class, ajfg.class, ajfh.class, ajfi.class, ajfe.class });
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
