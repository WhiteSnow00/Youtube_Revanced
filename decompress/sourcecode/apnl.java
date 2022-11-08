import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnl extends agzi implements ahax
{
    public static final apnl a;
    private static volatile ahbe d;
    public String b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)apnl.class, (agzi)(a = new apnl()));
    }
    
    private apnl() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apnl.d) == null) {
                    synchronized (apnl.class) {
                        if (apnl.d == null) {
                            apnl.d = (ahbe)new agzb((agzi)apnl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apnl.a;
            }
            case 4: {
                return new agza((agzi)apnl.a);
            }
            case 3: {
                return new apnl();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnl.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "b", "c" });
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
