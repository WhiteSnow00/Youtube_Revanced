import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowx extends agzi implements ahax
{
    private static final aowx a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance(aowx.class, a = new aowx());
    }
    
    private aowx() {
        this.c = "";
    }
    
    public static /* synthetic */ aowx a() {
        return aowx.a;
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
                if ((b = aowx.b) == null) {
                    synchronized (aowx.class) {
                        if (aowx.b == null) {
                            aowx.b = (ahbe)new agzb((agzi)aowx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowx.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aowx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowx.a, "\u0001\u0000", null);
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
