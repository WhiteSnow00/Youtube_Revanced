import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvp extends agzi implements ahax
{
    public static final aqvp a;
    private static volatile ahbe k;
    public int b;
    public aqvj c;
    public String d;
    public String e;
    public String f;
    public aqvo g;
    public int h;
    public String i;
    public String j;
    
    static {
        agzi.registerDefaultInstance(aqvp.class, a = new aqvp());
    }
    
    private aqvp() {
        this.d = "";
        this.e = "";
        this.f = "";
        this.i = "";
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = aqvp.k) == null) {
                    synchronized (aqvp.class) {
                        if (aqvp.k == null) {
                            aqvp.k = (ahbe)new agzb((agzi)aqvp.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aqvp.a;
            }
            case 4: {
                return new agza((agzi)aqvp.a);
            }
            case 3: {
                return new aqvp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvp.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1008\u0003\u0006\u1009\u0004\u0007\u100c\u0005\b\u1008\u0006\t\u1008\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", aqvq.a(), "i", "j" });
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
