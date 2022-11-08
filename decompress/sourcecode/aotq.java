import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotq extends agzi implements ahax
{
    private static final aotq a;
    private static volatile ahbe b;
    private int c;
    
    static {
        agzi.registerDefaultInstance(aotq.class, a = new aotq());
    }
    
    private aotq() {
        this.c = 0;
    }
    
    public static /* synthetic */ aotq a() {
        return aotq.a;
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
                if ((b = aotq.b) == null) {
                    synchronized (aotq.class) {
                        if (aotq.b == null) {
                            aotq.b = (ahbe)new agzb((agzi)aotq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aotq.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aotq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotq.a, "\u0001\u0000", null);
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
