import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikc extends agzi implements ahax
{
    public static final agzr a;
    public static final aikc b;
    private static volatile ahbe l;
    public int c;
    public String d;
    public String e;
    public int f;
    public agzq g;
    public String h;
    public String i;
    public ajae j;
    public String k;
    
    static {
        a = (agzr)new prz(12);
        agzi.registerDefaultInstance(aikc.class, b = new aikc());
    }
    
    private aikc() {
        this.d = "";
        this.e = "";
        this.g = agzi.emptyIntList();
        this.h = "";
        this.i = "";
        this.k = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = aikc.l) == null) {
                    synchronized (aikc.class) {
                        if (aikc.l == null) {
                            aikc.l = (ahbe)new agzb((agzi)aikc.b);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aikc.b;
            }
            case 4: {
                return new agza((agzi)aikc.b);
            }
            case 3: {
                return new aikc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikc.b, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0001\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u100c\u0003\u0006\u001e\u0007\u1008\u0004\b\u1008\u0005\t\u1009\u0006\n\u1008\u0007", new Object[] { "c", "d", "e", "f", aijn.e, "g", ahih.a(), "h", "i", "j", "k" });
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
