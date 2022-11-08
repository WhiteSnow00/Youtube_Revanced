import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomp extends agzi implements ahax
{
    public static final aomp a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)aomp.class, (agzi)(a = new aomp()));
    }
    
    private aomp() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aomp.d) == null) {
                    synchronized (aomp.class) {
                        if (aomp.d == null) {
                            aomp.d = (ahbe)new agzb((agzi)aomp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomp.a;
            }
            case 4: {
                return new agza((agzi)aomp.a);
            }
            case 3: {
                return new aomp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomp.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103f\u0000", new Object[] { "c", "b", aomo.class, aomq.class, aoms.a() });
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
