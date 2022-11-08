import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aegf extends agzi implements ahax
{
    public static final aegf a;
    private static volatile ahbe d;
    public int b;
    public aegg c;
    
    static {
        agzi.registerDefaultInstance(aegf.class, a = new aegf());
    }
    
    private aegf() {
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
                if ((d = aegf.d) == null) {
                    synchronized (aegf.class) {
                        if (aegf.d == null) {
                            aegf.d = (ahbe)new agzb((agzi)aegf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aegf.a;
            }
            case 4: {
                return new agza((agzi)aegf.a);
            }
            case 3: {
                return new aegf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aegf.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[] { "b", "c" });
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
