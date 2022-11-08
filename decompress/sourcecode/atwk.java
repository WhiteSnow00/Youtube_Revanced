import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwk extends agzi implements ahax
{
    public static final atwk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(atwk.class, a = new atwk());
    }
    
    private atwk() {
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
                if ((b = atwk.b) == null) {
                    synchronized (atwk.class) {
                        if (atwk.b == null) {
                            atwk.b = (ahbe)new agzb((agzi)atwk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atwk.a;
            }
            case 4: {
                return new agza((agzi)atwk.a);
            }
            case 3: {
                return new atwk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwk.a, "\u0001\u0000", null);
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
