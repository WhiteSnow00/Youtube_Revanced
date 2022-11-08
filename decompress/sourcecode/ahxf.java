import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxf extends agzi implements ahax
{
    public static final ahxf a;
    private static volatile ahbe h;
    public int b;
    public ahxe c;
    public boolean d;
    public ahxi e;
    public ahxd f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(ahxf.class, a = new ahxf());
    }
    
    private ahxf() {
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahxf.h) == null) {
                    synchronized (ahxf.class) {
                        if (ahxf.h == null) {
                            ahxf.h = (ahbe)new agzb((agzi)ahxf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahxf.a;
            }
            case 4: {
                return new agza((agzi)ahxf.a);
            }
            case 3: {
                return new ahxf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxf.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
