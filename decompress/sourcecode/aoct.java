import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoct extends agzi implements ahax
{
    public static final aoct a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aoct.class, a = new aoct());
    }
    
    private aoct() {
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
                if ((b = aoct.b) == null) {
                    synchronized (aoct.class) {
                        if (aoct.b == null) {
                            aoct.b = (ahbe)new agzb((agzi)aoct.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoct.a;
            }
            case 4: {
                return new agza((agzi)aoct.a);
            }
            case 3: {
                return new aoct();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoct.a, "\u0001\u0000", null);
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
