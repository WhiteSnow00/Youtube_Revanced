import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aher extends agzi implements ahax
{
    private static final aher a;
    private static volatile ahbe b;
    private String c;
    private String d;
    
    static {
        agzi.registerDefaultInstance(aher.class, a = new aher());
    }
    
    private aher() {
        this.c = "";
        this.d = "";
    }
    
    public static /* synthetic */ aher a() {
        return aher.a;
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
                if ((b = aher.b) == null) {
                    synchronized (aher.class) {
                        if (aher.b == null) {
                            aher.b = (ahbe)new agzb((agzi)aher.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aher.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aher();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aher.a, "\u0001\u0000", null);
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
