import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqy extends agzi implements ahax
{
    public static final alqy a;
    private static volatile ahbe l;
    public int b;
    public String c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    
    static {
        agzi.registerDefaultInstance(alqy.class, a = new alqy());
    }
    
    private alqy() {
        this.c = "";
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
                if ((l = alqy.l) == null) {
                    synchronized (alqy.class) {
                        if (alqy.l == null) {
                            alqy.l = (ahbe)new agzb((agzi)alqy.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return alqy.a;
            }
            case 4: {
                return new agza((agzi)alqy.a);
            }
            case 3: {
                return new alqy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqy.a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0002\u0003\u1003\u0003\u0004\u1007\u0004\u0005\u1007\u0005\u0006\u1007\u0006\u0007\u100c\u0007\n\u100c\n\f\u1007\u000b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", alll.t, "j", alll.r, "k" });
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
