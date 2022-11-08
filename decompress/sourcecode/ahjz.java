import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjz extends agzi implements ahax
{
    private static final ahjz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ahjz.class, (agzi)(a = new ahjz()));
    }
    
    private ahjz() {
    }
    
    public static /* synthetic */ ahjz a() {
        return ahjz.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahjz.b) == null) {
                    synchronized (ahjz.class) {
                        if (ahjz.b == null) {
                            ahjz.b = (ahbe)new agzb((agzi)ahjz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahjz.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ahjz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjz.a, "\u0001\u0000", (Object[])null);
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
