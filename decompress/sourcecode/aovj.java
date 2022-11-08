import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovj extends agzi implements ahax
{
    private static final aovj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aovj.class, a = new aovj());
    }
    
    private aovj() {
    }
    
    public static /* synthetic */ aovj a() {
        return aovj.a;
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
                if ((b = aovj.b) == null) {
                    synchronized (aovj.class) {
                        if (aovj.b == null) {
                            aovj.b = (ahbe)new agzb((agzi)aovj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovj.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aovj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovj.a, "\u0001\u0000", null);
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
