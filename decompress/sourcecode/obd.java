import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obd extends agzi implements ahax
{
    public static final obd a;
    private static volatile ahbe e;
    public oay b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance((Class)obd.class, (agzi)(a = new obd()));
    }
    
    private obd() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = obd.e) == null) {
                    synchronized (obd.class) {
                        if (obd.e == null) {
                            obd.e = (ahbe)new agzb((agzi)obd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obd.a;
            }
            case 4: {
                return new agza((agzi)obd.a);
            }
            case 3: {
                return new obd();
            }
            case 2: {
                return newMessageInfo((MessageLite)obd.a, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\t\u0003\u0208\u0004\u0208", new Object[] { "b", "c", "d" });
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
