import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowg extends agzi implements ahax
{
    public static final aowg a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowg.class, a = new aowg());
    }
    
    private aowg() {
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
                if ((b = aowg.b) == null) {
                    synchronized (aowg.class) {
                        if (aowg.b == null) {
                            aowg.b = (ahbe)new agzb((agzi)aowg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowg.a;
            }
            case 4: {
                return new agza((agzi)aowg.a);
            }
            case 3: {
                return new aowg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowg.a, "\u0001\u0000", null);
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
