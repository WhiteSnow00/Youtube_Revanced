import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijx extends agzi implements ahax
{
    private static final aijx a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aijx.class, a = new aijx());
    }
    
    private aijx() {
    }
    
    public static /* synthetic */ aijx a() {
        return aijx.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aijx.b) == null) {
                    synchronized (aijx.class) {
                        if (aijx.b == null) {
                            aijx.b = (ahbe)new agzb((agzi)aijx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aijx.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aijx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijx.a, "\u0001\u0000", null);
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
