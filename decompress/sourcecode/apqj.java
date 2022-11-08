import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqj extends agzi implements ahax
{
    public static final apqj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)apqj.class, (agzi)(a = new apqj()));
    }
    
    private apqj() {
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
                if ((d = apqj.d) == null) {
                    synchronized (apqj.class) {
                        if (apqj.d == null) {
                            apqj.d = (ahbe)new agzb((agzi)apqj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqj.a;
            }
            case 4: {
                return new agza((agzi)apqj.a);
            }
            case 3: {
                return new apqj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqj.a, "\u0001\u0001\u0001\u0000\ufd80\u3d39\ufd80\u3d39\u0001\u0000\u0000\u0000\ufd80\u3d39\u103c\u0000", new Object[] { "c", "b", apqi.class });
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
