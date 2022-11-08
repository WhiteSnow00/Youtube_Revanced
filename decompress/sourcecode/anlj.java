import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlj extends agzi implements ahax
{
    public static final anlj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anlj.class, a = new anlj());
    }
    
    private anlj() {
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
                if ((b = anlj.b) == null) {
                    synchronized (anlj.class) {
                        if (anlj.b == null) {
                            anlj.b = (ahbe)new agzb((agzi)anlj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anlj.a;
            }
            case 4: {
                return new agza((agzi)anlj.a);
            }
            case 3: {
                return new anlj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlj.a, "\u0000\u0000", null);
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
