import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnx extends agzi implements ahax
{
    private static final apnx a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance((Class)apnx.class, (agzi)(a = new apnx()));
    }
    
    private apnx() {
        this.c = "";
    }
    
    public static /* synthetic */ apnx a() {
        return apnx.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnx.b) == null) {
                    synchronized (apnx.class) {
                        if (apnx.b == null) {
                            apnx.b = (ahbe)new agzb((agzi)apnx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnx.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new apnx();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnx.a, "\u0001\u0000", (Object[])null);
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
