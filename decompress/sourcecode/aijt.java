import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijt extends agzi implements ahax
{
    public static final aijt a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aijt.class, a = new aijt());
    }
    
    private aijt() {
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
                if ((d = aijt.d) == null) {
                    synchronized (aijt.class) {
                        if (aijt.d == null) {
                            aijt.d = (ahbe)new agzb((agzi)aijt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aijt.a;
            }
            case 4: {
                return new agza((agzi)aijt.a);
            }
            case 3: {
                return new aijt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijt.a, "\u0001\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000", new Object[] { "c", "b", aijo.class, aijp.class, aiju.class });
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
