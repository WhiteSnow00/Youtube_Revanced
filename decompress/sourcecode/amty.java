import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amty extends agzi implements ahax
{
    public static final amty a;
    public static final agzg b;
    private static volatile ahbe n;
    public int c;
    public String d;
    public int e;
    public long f;
    public agyc g;
    public amry h;
    public long i;
    public amrx j;
    public String k;
    public String l;
    public int m;
    
    static {
        final amty a2 = new amty();
        agzi.registerDefaultInstance(amty.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 130, ahcm.k, amty.class);
    }
    
    private amty() {
        this.d = "";
        this.g = agyc.b;
        this.k = "";
        this.l = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe n;
                if ((n = amty.n) == null) {
                    synchronized (amty.class) {
                        if (amty.n == null) {
                            amty.n = (ahbe)new agzb((agzi)amty.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return amty.a;
            }
            case 4: {
                return new agza((agzi)amty.a);
            }
            case 3: {
                return new amty();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amty.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u100a\u0003\u0005\u1009\u0004\u0006\u1002\u0005\u0007\u1009\u0006\b\u1008\u0007\t\u1008\b\n\u100c\t", new Object[] { "c", "d", "e", amtu.a(), "f", "g", "h", "i", "j", "k", "l", "m", amso.a() });
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
