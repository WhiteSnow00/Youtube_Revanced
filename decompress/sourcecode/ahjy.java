import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjy extends agzi implements ahax
{
    private static final ahjy a;
    private static volatile ahbe b;
    private String c;
    private String d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjy.class, (agzi)(a = new ahjy()));
    }
    
    private ahjy() {
        this.c = "";
        this.d = "";
    }
    
    public static /* synthetic */ ahjy a() {
        return ahjy.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahjy.b) == null) {
                    synchronized (ahjy.class) {
                        if (ahjy.b == null) {
                            ahjy.b = (ahbe)new agzb((agzi)ahjy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahjy.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ahjy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjy.a, "\u0001\u0000", (Object[])null);
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
