import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowk extends agzi implements ahax
{
    public static final aowk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowk.class, a = new aowk());
    }
    
    private aowk() {
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
                if ((b = aowk.b) == null) {
                    synchronized (aowk.class) {
                        if (aowk.b == null) {
                            aowk.b = (ahbe)new agzb((agzi)aowk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowk.a;
            }
            case 4: {
                return new agza((agzi)aowk.a);
            }
            case 3: {
                return new aowk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowk.a, "\u0001\u0000", null);
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
