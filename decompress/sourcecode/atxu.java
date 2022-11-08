import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxu extends agzi implements ahax
{
    public static final atxu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(atxu.class, a = new atxu());
    }
    
    private atxu() {
        emptyLongList();
        emptyLongList();
        emptyIntList();
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
                if ((b = atxu.b) == null) {
                    synchronized (atxu.class) {
                        if (atxu.b == null) {
                            atxu.b = (ahbe)new agzb((agzi)atxu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atxu.a;
            }
            case 4: {
                return new agza((agzi)atxu.a);
            }
            case 3: {
                return new atxu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxu.a, "\u0001\u0000", null);
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
