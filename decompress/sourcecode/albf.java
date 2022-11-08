import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albf extends agzi implements ahax
{
    public static final albf a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public Object d;
    public akjd e;
    public String f;
    public String g;
    public boolean h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)albf.class, (agzi)(a = new albf()));
    }
    
    private albf() {
        this.c = 0;
        this.j = 2;
        this.f = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = albf.i) == null) {
                    synchronized (albf.class) {
                        if (albf.i == null) {
                            albf.i = (ahbe)new agzb((agzi)albf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return albf.a;
            }
            case 4: {
                return new agza((agzi)albf.a);
            }
            case 3: {
                return new albf();
            }
            case 2: {
                return newMessageInfo((MessageLite)albf.a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103b\u0000\u0003\u1008\u0003\u0005\u1008\u0004\u0006\u1007\u0005\u0007\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
