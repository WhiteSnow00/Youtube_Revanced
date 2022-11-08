import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimg extends agzi implements ahax
{
    public static final aimg a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aimg.class, a = new aimg());
    }
    
    private aimg() {
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
                if ((d = aimg.d) == null) {
                    synchronized (aimg.class) {
                        if (aimg.d == null) {
                            aimg.d = (ahbe)new agzb((agzi)aimg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aimg.a;
            }
            case 4: {
                return new agza((agzi)aimg.a);
            }
            case 3: {
                return new aimg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimg.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "c", "b", aimh.class, aiml.class, aimk.class });
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
