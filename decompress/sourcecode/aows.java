import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aows extends agzi implements ahax
{
    private static final aows a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance(aows.class, a = new aows());
    }
    
    private aows() {
        this.c = "";
    }
    
    public static /* synthetic */ aows a() {
        return aows.a;
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
                if ((b = aows.b) == null) {
                    synchronized (aows.class) {
                        if (aows.b == null) {
                            aows.b = (ahbe)new agzb((agzi)aows.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aows.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aows();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aows.a, "\u0001\u0000", null);
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
