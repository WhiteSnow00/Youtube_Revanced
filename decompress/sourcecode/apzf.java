import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzf extends agzi implements ahax
{
    public static final apzf a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(apzf.class, a = new apzf());
    }
    
    private apzf() {
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
                if ((d = apzf.d) == null) {
                    synchronized (apzf.class) {
                        if (apzf.d == null) {
                            apzf.d = (ahbe)new agzb((agzi)apzf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzf.a;
            }
            case 4: {
                return new agza((agzi)apzf.a);
            }
            case 3: {
                return new apzf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "b", "c" });
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
