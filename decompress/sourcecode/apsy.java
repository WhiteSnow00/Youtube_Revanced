import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsy extends agzi implements ahax
{
    public static final apsy a;
    private static volatile ahbe e;
    public String b;
    public apsz c;
    public aptb d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)apsy.class, (agzi)(a = new apsy()));
    }
    
    private apsy() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apsy.e) == null) {
                    synchronized (apsy.class) {
                        if (apsy.e == null) {
                            apsy.e = (ahbe)new agzb((agzi)apsy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apsy.a;
            }
            case 4: {
                return new agza((agzi)apsy.a);
            }
            case 3: {
                return new apsy();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "f", "b", "c", "d" });
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
