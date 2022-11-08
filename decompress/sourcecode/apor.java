import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apor extends agzi implements ahax
{
    public static final apor a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)apor.class, (agzi)(a = new apor()));
    }
    
    private apor() {
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
                if ((d = apor.d) == null) {
                    synchronized (apor.class) {
                        if (apor.d == null) {
                            apor.d = (ahbe)new agzb((agzi)apor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apor.a;
            }
            case 4: {
                return new agza((agzi)apor.a);
            }
            case 3: {
                return new apor();
            }
            case 2: {
                return newMessageInfo((MessageLite)apor.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", ahzg.class });
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
