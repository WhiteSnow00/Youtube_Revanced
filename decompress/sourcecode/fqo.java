import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqo extends agzi implements ahax
{
    public static final fqo a;
    private static volatile ahbe p;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public ahas f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    
    static {
        agzi.registerDefaultInstance((Class)fqo.class, (agzi)(a = new fqo()));
    }
    
    private fqo() {
        this.f = ahas.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe p3;
                if ((p3 = fqo.p) == null) {
                    synchronized (fqo.class) {
                        if (fqo.p == null) {
                            fqo.p = (ahbe)new agzb((agzi)fqo.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return fqo.a;
            }
            case 4: {
                return new agza((agzi)fqo.a);
            }
            case 3: {
                return new fqo();
            }
            case 2: {
                return newMessageInfo((MessageLite)fqo.a, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u00042\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1004\u0005\b\u1004\u0006\t\u1004\u0007\n\u1004\b\u000b\u1004\t\f\u1007\n\r\u1004\u000b", new Object[] { "b", "c", "d", "e", "f", fqn.a, "g", "h", "i", "j", "k", "l", "m", "n", "o" });
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
