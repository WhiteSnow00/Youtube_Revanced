import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atws extends agzi implements ahax
{
    public static final atws a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(atws.class, a = new atws());
    }
    
    private atws() {
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
                if ((b = atws.b) == null) {
                    synchronized (atws.class) {
                        if (atws.b == null) {
                            atws.b = (ahbe)new agzb((agzi)atws.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atws.a;
            }
            case 4: {
                return new agza((agzi)atws.a);
            }
            case 3: {
                return new atws();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atws.a, "\u0001\u0000", null);
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
