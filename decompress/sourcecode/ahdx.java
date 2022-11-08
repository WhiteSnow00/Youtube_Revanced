import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdx extends agzi implements ahax
{
    public static final ahdx a;
    private static volatile ahbe c;
    public agzq b;
    
    static {
        agzi.registerDefaultInstance(ahdx.class, a = new ahdx());
    }
    
    private ahdx() {
        this.b = agzi.emptyIntList();
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
                if ((c = ahdx.c) == null) {
                    synchronized (ahdx.class) {
                        if (ahdx.c == null) {
                            ahdx.c = (ahbe)new agzb((agzi)ahdx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahdx.a;
            }
            case 4: {
                return new agza((agzi)ahdx.a);
            }
            case 3: {
                return new ahdx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdx.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[] { "b" });
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
