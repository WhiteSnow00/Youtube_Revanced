import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aerd extends agzi implements ahax
{
    public static final aerd a;
    private static volatile ahbe k;
    public int b;
    public String c;
    public int d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public boolean j;
    
    static {
        agzi.registerDefaultInstance(aerd.class, a = new aerd());
    }
    
    private aerd() {
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
                final ahbe k;
                if ((k = aerd.k) == null) {
                    synchronized (aerd.class) {
                        if (aerd.k == null) {
                            aerd.k = (ahbe)new agzb((agzi)aerd.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aerd.a;
            }
            case 4: {
                return new agza((agzi)aerd.a);
            }
            case 3: {
                return new aerd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aerd.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1002\u0005\u0006\u1007\b\b\u100c\t\t\u1007\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", aeih.c, "j" });
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
