import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosz extends agzi implements ahax
{
    private static final aosz a;
    private static volatile ahbe b;
    private String c;
    private String d;
    
    static {
        agzi.registerDefaultInstance(aosz.class, a = new aosz());
    }
    
    private aosz() {
        this.c = "";
        this.d = "";
    }
    
    public static /* synthetic */ aosz a() {
        return aosz.a;
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
                if ((b = aosz.b) == null) {
                    synchronized (aosz.class) {
                        if (aosz.b == null) {
                            aosz.b = (ahbe)new agzb((agzi)aosz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aosz.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aosz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosz.a, "\u0001\u0000", null);
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
