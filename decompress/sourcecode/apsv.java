import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsv extends agzi implements ahax
{
    public static final apsv a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance((Class)apsv.class, (agzi)(a = new apsv()));
    }
    
    private apsv() {
        this.c = 0;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apsv.f) == null) {
                    synchronized (apsv.class) {
                        if (apsv.f == null) {
                            apsv.f = (ahbe)new agzb((agzi)apsv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsv.a;
            }
            case 4: {
                return new agza((agzi)apsv.a);
            }
            case 3: {
                return new apsv();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsv.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1037\u0000\u0003\u1034\u0000\u0004\u103a\u0000\u0005\u103b\u0000\u0006\u103d\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "d", "c", "b", "e", apsj.class, apsn.class, apsu.class });
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
