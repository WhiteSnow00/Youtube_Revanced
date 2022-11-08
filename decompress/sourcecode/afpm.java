import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpm extends agzi implements ahax
{
    public static final afpm a;
    private static volatile ahbe k;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public String j;
    
    static {
        agzi.registerDefaultInstance(afpm.class, a = new afpm());
    }
    
    private afpm() {
        this.c = "";
        this.e = "";
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
                if ((k = afpm.k) == null) {
                    synchronized (afpm.class) {
                        if (afpm.k == null) {
                            afpm.k = (ahbe)new agzb((agzi)afpm.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return afpm.a;
            }
            case 4: {
                return new agza((agzi)afpm.a);
            }
            case 3: {
                return new afpm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpm.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u1007\u0005\u0006\u1002\u0006\u0007\u1008\u0007\b\u1004\u0004", new Object[] { "b", "c", "d", "e", "f", "h", "i", "j", "g" });
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
