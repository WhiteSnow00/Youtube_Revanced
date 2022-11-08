import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvh extends agzi implements ahax
{
    private static final aqvh a;
    private static volatile ahbe b;
    private int c;
    private String d;
    
    static {
        agzi.registerDefaultInstance(aqvh.class, a = new aqvh());
    }
    
    private aqvh() {
        this.d = "";
    }
    
    public static aqvg a() {
        return (aqvg)aqvh.a.createBuilder();
    }
    
    private void d(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
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
                if ((b = aqvh.b) == null) {
                    synchronized (aqvh.class) {
                        if (aqvh.b == null) {
                            aqvh.b = (ahbe)new agzb((agzi)aqvh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqvh.a;
            }
            case 4: {
                return new aqvg();
            }
            case 3: {
                return new aqvh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
