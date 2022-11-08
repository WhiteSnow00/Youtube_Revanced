import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnz extends agzi implements ahax
{
    public static final agnz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agnz.class, a = new agnz());
    }
    
    private agnz() {
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
                if ((b = agnz.b) == null) {
                    synchronized (agnz.class) {
                        if (agnz.b == null) {
                            agnz.b = (ahbe)new agzb((agzi)agnz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agnz.a;
            }
            case 4: {
                return new agza((agzi)agnz.a);
            }
            case 3: {
                return new agnz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnz.a, "\u0000\u0000", null);
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
