import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlu extends agzi implements ahax
{
    public static final anlu a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(anlu.class, a = new anlu());
    }
    
    private anlu() {
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
                if ((d = anlu.d) == null) {
                    synchronized (anlu.class) {
                        if (anlu.d == null) {
                            anlu.d = (ahbe)new agzb((agzi)anlu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anlu.a;
            }
            case 4: {
                return new agza((agzi)anlu.a);
            }
            case 3: {
                return new anlu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlu.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1036\u0000\u0002\u1036\u0000\u0003\u103b\u0000", new Object[] { "c", "b" });
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
