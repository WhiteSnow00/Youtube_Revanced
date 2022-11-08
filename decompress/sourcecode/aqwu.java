import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwu extends agzi implements ahax
{
    private static final aqwu a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private boolean e;
    
    static {
        agzi.registerDefaultInstance(aqwu.class, a = new aqwu());
    }
    
    private aqwu() {
        this.d = 1;
    }
    
    public static /* synthetic */ aqwu b() {
        return aqwu.a;
    }
    
    public static aqwu c() {
        return aqwu.a;
    }
    
    public aqvz a() {
        aqvz aqvz;
        if ((aqvz = aqvz.b(this.d)) == null) {
            aqvz = aqvz.a;
        }
        return aqvz;
    }
    
    public boolean d() {
        return this.e;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqwu.b) == null) {
                    synchronized (aqwu.class) {
                        if (aqwu.b == null) {
                            aqwu.b = (ahbe)new agzb((agzi)aqwu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwu.a;
            }
            case 4: {
                return new agza((agzi)b());
            }
            case 3: {
                return new aqwu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "c", "d", aqvz.a(), "e" });
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
