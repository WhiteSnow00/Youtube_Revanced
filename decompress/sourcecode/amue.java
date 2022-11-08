import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amue extends agzi implements ahax
{
    public static final amue a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public String d;
    public int e;
    public long f;
    public long g;
    
    static {
        final amue a2 = new amue();
        agzi.registerDefaultInstance(amue.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 39, ahcm.k, amue.class);
    }
    
    private amue() {
        this.d = "";
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
                if ((h = amue.h) == null) {
                    synchronized (amue.class) {
                        if (amue.h == null) {
                            amue.h = (ahbe)new agzb((agzi)amue.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amue.a;
            }
            case 4: {
                return new agza((agzi)amue.a);
            }
            case 3: {
                return new amue();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amue.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "c", "d", "e", apka.a(), "f", "g" });
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
