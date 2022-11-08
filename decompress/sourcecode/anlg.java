import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlg extends agzi implements ahax
{
    public static final anlg a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anlg.class, a = new anlg());
    }
    
    private anlg() {
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
                if ((b = anlg.b) == null) {
                    synchronized (anlg.class) {
                        if (anlg.b == null) {
                            anlg.b = (ahbe)new agzb((agzi)anlg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anlg.a;
            }
            case 4: {
                return new agza((agzi)anlg.a);
            }
            case 3: {
                return new anlg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlg.a, "\u0000\u0000", null);
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
