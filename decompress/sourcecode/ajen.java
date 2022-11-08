import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajen extends agzi implements ahax
{
    public static final ajen a;
    public static final agzg b;
    private static volatile ahbe o;
    public int c;
    public String d;
    public int e;
    public float f;
    public float g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public amry l;
    public long m;
    public amrx n;
    
    static {
        final ajen a2 = new ajen();
        agzi.registerDefaultInstance(ajen.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 141, ahcm.k, ajen.class);
    }
    
    private ajen() {
        this.d = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = ajen.o) == null) {
                    synchronized (ajen.class) {
                        if (ajen.o == null) {
                            ajen.o = (ahbe)new agzb((agzi)ajen.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajen.a;
            }
            case 4: {
                return new agza((agzi)ajen.a);
            }
            case 3: {
                return new ajen();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajen.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1001\u0002\u0004\u1008\u0004\u0005\u1001\u0003\u0006\u1007\u0005\u0007\u1007\u0006\t\u1007\u0007\n\u1009\b\u000b\u1002\t\f\u1009\n", new Object[] { "c", "d", "e", apka.a(), "f", "h", "g", "i", "j", "k", "l", "m", "n" });
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
