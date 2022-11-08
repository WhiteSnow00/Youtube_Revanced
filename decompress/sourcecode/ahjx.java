import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjx extends agzi implements ahax
{
    private static final ahjx a;
    private static volatile ahbe b;
    private String c;
    private String d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjx.class, (agzi)(a = new ahjx()));
    }
    
    private ahjx() {
        this.c = "";
        this.d = "";
    }
    
    public static /* synthetic */ ahjx a() {
        return ahjx.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahjx.b) == null) {
                    synchronized (ahjx.class) {
                        if (ahjx.b == null) {
                            ahjx.b = (ahbe)new agzb((agzi)ahjx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahjx.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ahjx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjx.a, "\u0001\u0000", (Object[])null);
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
